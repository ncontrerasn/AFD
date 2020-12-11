import javax.swing.*;

public class Metricas extends JFrame{
    private JTextArea textArea1;
    private JPanel panel1;

    public Metricas(long tiempoConstruccion, long tiempoProcesamiento, int lineas, float comentarios){
        add(panel1);
        setSize(600,200);
        setTitle("AUTOMA - MÉTRICAS");
        String met = "Tiempo de construcción del autómata: " + tiempoConstruccion + " ms.";
        met += "\n\nTiempo de procesamiento de la cadena: " + tiempoProcesamiento + " ms.";
        met += "\n\nDensidad de líneas de comentarios: " + comentarios + " %.";
        met += "\n\nNúmero de líneas de código: " + lineas + ".";
        textArea1.setText(met);
        setVisible(true);
    }
}
