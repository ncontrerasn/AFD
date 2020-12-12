import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ProcesamientoAFD extends  JFrame{
    private JButton procesarButton;
    private JTextField textField1;
    private JTextArea textArea1;
    private JPanel panelPro;
    private JButton verMétricasButton;

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
                textArea1.setText(cadenaAFD.probarAutomata(cadena));
            }
        });
        verMétricasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Metricas metricas = new Metricas(tiempoConstruccion, cadenaAFD.tiempo, lineasEscritas, porcentajeComentarios);
                metricas.setLocation(800, 800);
            }
        });
    }
}
