import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ProcesamientoAFD extends  JFrame{
    /*
    clase que pide por un formulario la cadena que quiere ser procesada, llama a CadenaAFD para que ella haga el
    procesamiento y la muestre en el cuadro de texto de abajo.
    tiene 3 botones:
        procesar: para hacer lo dicho arriba.
        verMetricas: para llamar a la clase Metricas.
        dibujo: para ver el grafo paso a paso con el procesamiento de la cadena ingresada.
     */
    private JButton procesarButton;
    private JTextField textField1;
    private JTextArea textArea1;
    private JPanel panelPro;
    private JButton verMétricasButton;
    private JButton dibujoButton;
    String proceso;

    public ProcesamientoAFD(ArrayList<String> estados, ArrayList<Character> alfabeto, String[][] matriz, long tiempoConstruccion, int lineasEscritas, float porcentajeComentarios) {
        add(panelPro);
        setSize(700,250);
        setTitle("AUTOMA - PRUEBA");
        setVisible(true);
        CadenaAFD cadenaAFD = new CadenaAFD(estados, alfabeto, matriz);
        textArea1.setLineWrap(true);
        textArea1.setWrapStyleWord(true);

        procesarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cadena = textField1.getText();
                proceso = cadenaAFD.probarAutomata(cadena);
                textArea1.setText(proceso);
            }
        });
        verMétricasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Metricas metricas = new Metricas(tiempoConstruccion, cadenaAFD.tiempo, lineasEscritas, porcentajeComentarios);
                metricas.setLocation(800, 800);
            }
        });
        dibujoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Grafo grafo = new Grafo(estados, alfabeto, matriz, cadenaAFD.orden, proceso);
                grafo.setVisible(true);
                grafo.setLocation(1142, 450);
            }
        });
    }
}