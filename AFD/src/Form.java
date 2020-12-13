import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Form extends JFrame {
    /*
    en esta clase se llama a MyVisitor que es la clase que hace el analisis de ANTLR con la entrada que se captura, luego
    se llama a Window para ver el AFD ingresado y ProcesamientoAFD para poder hacer pruebas de casdenas pero solo ver
    el procesamiento de forma textual.
    Al final se genran las metricas de lineas escritas y el porcentaje de comentarios.
    Hay 2 botones:
        simular: para hacer lo que hace ProcesamientoAFD.
        descargar: para generar un txt en el escritorio con el codigo ingresado.
     */
    private JButton simularButton;
    private JTextArea textArea2;
    private JPanel panel1;
    private JButton descargarButton;
    static int lineasEscritas;
    static float porcentajeComentarios;

    public Form(){
        add(panel1);
        setSize(408, 600);
        setTitle("AUTOMA - CINCO");

        simularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = textArea2.getText();
                generarMetricas(texto);
                CharStream charStreams = CharStreams.fromString(textArea2.getText());
                GrammarAFDLexer lexer = new GrammarAFDLexer(charStreams);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                GrammarAFDParser parser = new GrammarAFDParser(tokens);
                ParseTree tree = parser.automata();
                MyVisitor<Object> loader = new MyVisitor<Object>();
                loader.visit(tree);
                Window window = new Window(loader.estados, loader.alfabeto, loader.matriz);
                window.setLocation(800, 450);
                ProcesamientoAFD procesamientoAFD = new ProcesamientoAFD(loader.estados, loader.alfabeto, loader.matriz, loader.tiempoConstruccion, lineasEscritas, porcentajeComentarios);
                procesamientoAFD.setLocation(800, 200);
            }
        });
        descargarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = textArea2.getText();
                descargarAFD(texto);
            }
        });
    }

    void descargarAFD(String texto){
        FileSystemView filesys = FileSystemView.getFileSystemView();
        char car = 92;
        String dir = String.valueOf(car);
        dir += "miAFD.txt";
        String lines[] = texto.split("\\r?\\n");
        FileWriter fichero = null;
        PrintWriter pw;
        try {
            fichero = new FileWriter(filesys.getHomeDirectory() + dir);
            pw = new PrintWriter(fichero);
            String linea;
            for(int i = 0; i < lines.length; i++){
                linea = lines[i];
                pw.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    //los comentarios por ahora solo sirven si el simbolo de comnetario esta en la posicion 0 y/o 1 (en caso de multiple) del renglon
    private static void generarMetricas(String texto) {
        String lines[] = texto.split("\\r?\\n");
        int lineasTotales = 0, comentarios = 0;
        boolean inicioComentario = false;
        String linea;
        for(int i = 0; i < lines.length; i++){
            linea = lines[i];
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
        lineasEscritas = lineasTotales - comentarios;
        porcentajeComentarios = (float) comentarios / lineasTotales * 100;
    }

}
