import java.util.ArrayList;

public class CadenaAFD {
    /*
    clase que calcula el camino que debe cruzar una cadena de prueba en el AFD.
    calcula el tiempo que tarda en procesar la cadena en la variable tiempo.
    llena el array orden que guarda las posciones de los estados que tiene que atravesar.
    */
    ArrayList<String> estados;
    ArrayList<Character> alfabeto;
    String[][] matriz;
    long tiempo;
    ArrayList<Integer> orden = new ArrayList<>();

    public CadenaAFD(ArrayList<String> estados, ArrayList<Character> alfabeto, String[][] matriz){
        this.estados = estados;
        this.alfabeto = alfabeto;
        this.matriz = matriz;
    }

    public String probarAutomata(String prueba) {
        orden.add(0);
        String res = "";
        String estadoFinal = estados.get(estados.size() - 1);
        String estadoActual;
        int fila, columna;
        res += "[ " + estados.get(0);
        fila = 0;
        char lambda = 955;
        long TInicio, TFin; //Variables para determinar el tiempo de ejecución
        TInicio = System.currentTimeMillis();
        for(int i = 0; i < prueba.length(); i++){
            columna = alfabeto.indexOf(prueba.charAt(i));
            estadoActual = matriz[fila][columna];
            if(estadoActual == null || (i == prueba.length() - 1 && !estadoActual.equals(estadoFinal))){
                res += ", " + prueba.substring(i) + " ]";
                res += "\n\nNo hay un camino para que la cadena sea aceptada.";
                res += "\nLa cadena ingresada no hace parte del lenguaje aceptado por el autómata.";
                break;
            }
            fila = estados.indexOf(estadoActual);
            orden.add(estados.indexOf(estadoActual));
            res += ", " + prueba.substring(i) + " ] |-- [ " + estadoActual;
            if(i == prueba.length() - 1 && estadoActual.equals(estadoFinal)){
                res += ", " + lambda + " ]";
                res += "\n\nLa cadena ingresada es parte del lenguaje aceptado por el autómata.";
            }
        }
        TFin = System.currentTimeMillis(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
        tiempo = 1 + TFin - TInicio; //Calculamos los milisegundos de diferencia
        return res;
    }

}