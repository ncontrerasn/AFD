import java.util.ArrayList;
import java.io.*;

public class MyVisitor<T> extends GrammarAFDBaseVisitor {

    ArrayList<String> estados = new ArrayList<>();
    ArrayList<Character> alfabeto = new ArrayList<>();
    String[][] matriz;//esta matriz gurda con filas igual el orden que el vector de estados, si aparece q0, q5 y q2, las filas de la matriz serán q0, q5 y q2
    String x = "";

    @Override
    public Object visitAutomata(GrammarAFDParser.AutomataContext ctx) {
        long TInicio, TFin, tiempo; //Variables para determinar el tiempo de ejecución
        TInicio = System.currentTimeMillis();
        visitAlfabeto(ctx.alfabeto());
        visitEstados(ctx.estados());
        visitTransiciones(ctx.transiciones());
        TFin = System.currentTimeMillis(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
        tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
        System.out.println("\nTiempo de ejecución en milisegundos de la construcción del autómata: " + tiempo);

        String prueba = "bbbbaaba";
        probarAutomata(prueba);
        try {
            generarMetricas();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    //los comentarios por ahora solo sirven si el simbolo de comnetario esta en la posicion 0 y/o 1 (en caso de multiple) del renglon
    private void generarMetricas() throws FileNotFoundException {
        File archivo = new File ("input.txt");
        FileReader fr = new FileReader (archivo);
        BufferedReader br = new BufferedReader(fr);
        FileWriter fichero = null;
        PrintWriter pw = null;
        int lineasTotales = 0, comentarios = 0;
        boolean inicioComentario = false;
        try {
            fichero = new FileWriter("miAFD.txt");
            pw = new PrintWriter(fichero);
            String linea;
            while((linea=br.readLine())!=null){
                pw.println(linea);
                lineasTotales++;
                if(linea.equals(""))
                    lineasTotales--;
                else if(linea.charAt(0) == '#' && linea.charAt(1) != '/')
                    comentarios++;
                else if(linea.charAt(1) == '#' && linea.charAt(0) == '/')
                    inicioComentario = true;
                if(inicioComentario)
                    comentarios++;
                if(inicioComentario && (linea.charAt(linea.length() - 2) == '#' && linea.charAt(linea.length() - 1) == '/'))
                    inicioComentario = false;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        try {
            if (null != fichero)
                fichero.close();
            if( null != fr )
                fr.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
        int lineasEscritas = lineasTotales - comentarios;
        float porcentajeComentarios = (float) comentarios / lineasTotales * 100;
        System.out.println("\nDensidad de líneas de comentarios: " + porcentajeComentarios + " %");
        System.out.println("Número de líneas de código: " + lineasEscritas);
    }

    private void probarAutomata(String prueba) {
        System.out.println("\nCadena ingresada: " + prueba + "\n");
        String estadoFinal = estados.get(1);
        String estadoActual;
        int fila, columna;
        System.out.print("[ " + estados.get(0));
        fila = 0;
        char lambda = 955;
        long TInicio, TFin, tiempo; //Variables para determinar el tiempo de ejecución
        TInicio = System.currentTimeMillis();
        for(int i = 0; i < prueba.length(); i++){
            columna = alfabeto.indexOf(prueba.charAt(i));
            estadoActual = matriz[fila][columna];
            if(estadoActual == null){
                System.out.print(", " + prueba.substring(i) + " ]");
                System.out.println("\n\nNo hay un camino para que la cadena sea aceptada.");
                System.out.println("La cadena ingresada no hace parte del lenguaje aceptado por el autómata.");
                break;
            }
            fila = estados.indexOf(estadoActual);
            System.out.print(", " + prueba.substring(i) + " ] |-- [ " + estadoActual);
            if(i == prueba.length()-1 && estadoActual.equals(estadoFinal)){
                System.out.print(", " + lambda + " ]");
                System.out.println("\n\nLa cadena ingresada es parte del lenguaje aceptado por el autómata.");
            }
        }
        TFin = System.currentTimeMillis(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
        tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
        System.out.println("\nTiempo de ejecución de procesamiento de la cadena en milisegundos: " + tiempo);
    }

    @Override
    public Object visitAlfabeto(GrammarAFDParser.AlfabetoContext ctx) {
        char letra = ctx.DECL_ALF().toString().charAt(0);
        alfabeto.add(letra);
        if(ctx.decl_alf() != null)
            visitDecl_alf(ctx.decl_alf());
        return null;
    }

    @Override
    public Object visitDecl_alf(GrammarAFDParser.Decl_alfContext ctx) {
        if(ctx.DECL_ALF() != null){
            char letra = ctx.DECL_ALF().toString().charAt(0);
            alfabeto.add(letra);
        }
        if(ctx.decl_alf() != null)
            visitDecl_alf(ctx.decl_alf());
        return null;
    }

    @Override
    public Object visitEstados(GrammarAFDParser.EstadosContext ctx) {
        visitE_inicial(ctx.e_inicial());
        visitE_intermedio(ctx.e_intermedio());
        visitE_final(ctx.e_final());
        return null;
    }

    @Override
    public Object visitE_inicial(GrammarAFDParser.E_inicialContext ctx) {
        String estado = ctx.ESTADO().toString();
        estados.add(estado);
        return null;
    }

    @Override
    public Object visitE_final(GrammarAFDParser.E_finalContext ctx) {
        String estado = ctx.ESTADO().toString();
        estados.add(estado);
        return null;
    }

    @Override
    public Object visitE_intermedio(GrammarAFDParser.E_intermedioContext ctx) {
        String estado = ctx.ESTADO().toString();
        estados.add(estado);
        if(ctx.decl_interm() != null)
            visitDecl_interm(ctx.decl_interm());
        return null;
    }

    @Override
    public Object visitDecl_interm(GrammarAFDParser.Decl_intermContext ctx) {
        if(ctx.ESTADO() != null){
            String estado = ctx.ESTADO().toString();
            estados.add(estado);
        }
        if(ctx.ESTADO() != null)
            visitDecl_interm(ctx.decl_interm());
        return null;
    }

    @Override
    public Object visitTransiciones(GrammarAFDParser.TransicionesContext ctx) {
        matriz = new String[estados.size()][alfabeto.size()];
        //3 filas x 2 columnas con este ejemplo
        if(ctx.transicion() != null)
            visitTransicion(ctx.transicion());
        else
            visitConjunto_transiciones(ctx.conjunto_transiciones());
        return null;
    }

    @Override//
    public Object visitTransicion(GrammarAFDParser.TransicionContext ctx) {
        ArrayList<String> res;
        String estado = ctx.ESTADO().toString();
        int fila = estados.indexOf(estado);
        int columna;
        if(ctx.LLAVE_IZQ() != null){
            res = (ArrayList<String>) visitConjunto_predicados(ctx.conjunto_predicados());
            for(String s : res){
                String[] arr = s.split("\\s+");
                for(int i = arr.length - 1; i >= 1; i--){
                    //System.out.println(arr[i]);
                    char c = arr[i].charAt(0);
                    columna = alfabeto.indexOf(c);
                    //System.out.println("estado: "+estado+", etiqueta: "+c +", fila:"+fila+ ", col: " + columna+", hacia: "+arr[0]);
                    matriz[fila][columna] = arr[0];
                }
            }
        }
        else{
            String s = "";
            s += visitPredicado(ctx.predicado());
            String[] arr = s.split("\\s+");
            for(int i = arr.length - 1; i >= 1; i--){
                char c = arr[i].charAt(0);
                columna = alfabeto.indexOf(c);
                matriz[fila][columna] = arr[0];
            }
        }
        return null;
    }

    @Override
    public Object visitConjunto_transiciones(GrammarAFDParser.Conjunto_transicionesContext ctx) {
        visitTransicion(ctx.transicion());
        visitConj_tran(ctx.conj_tran());
        return null;
    }

    @Override
    public Object visitConj_tran(GrammarAFDParser.Conj_tranContext ctx) {
        if(ctx.transicion() != null){
            visitTransicion(ctx.transicion());
            visitConj_tran(ctx.conj_tran());
        }
        return null;
    }

    @Override
    public Object visitPredicado(GrammarAFDParser.PredicadoContext ctx) {
        x = "";
        String s = "";
        s += ctx.ESTADO().toString() + " " + ctx.DECL_ALF().toString();
        if(ctx.mas_pred() != null){
            visitMas_pred(ctx.mas_pred());
        }
        s += x;
        return (Object) s;
    }

    @Override
    public Object visitMas_pred(GrammarAFDParser.Mas_predContext ctx) {
        if(ctx.mas_pred() != null){
             x += " " + ctx.DECL_ALF().toString();
            visitMas_pred(ctx.mas_pred());
        }
        return null;
    }

    @Override
    public Object visitConjunto_predicados(GrammarAFDParser.Conjunto_predicadosContext ctx) {
        ArrayList<String> res = new ArrayList<>();
        if(ctx.predicado() != null && ctx.otro_pred() != null){
            res.add((String) visitPredicado(ctx.predicado()));
            res.add((String) visitOtro_pred(ctx.otro_pred()));
        }
        return (Object) res;
    }

    @Override
    public Object visitOtro_pred(GrammarAFDParser.Otro_predContext ctx) {
        String s = "";
        if(ctx.predicado() != null){
            s += visitPredicado(ctx.predicado());
            visitOtro_pred(ctx.otro_pred());
        }
        return (Object) s;
    }
}