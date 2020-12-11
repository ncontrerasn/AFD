import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProcesamientoAFD extends  JFrame{
    private JButton procesarButton;
    private JTextField textField1;
    private JTextArea textArea1;
    private JPanel panelPro;
    private JButton verMétricasButton;

    public ProcesamientoAFD() {
        add(panelPro);
        setSize(600,160);
        setTitle("AUTOMA - PRUEBA");
        setVisible(true);

        procesarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cadena = textField1.getText();
                textArea1.setText(cadena + " puta");
            }
        });
        verMétricasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Metricas metricas = new Metricas(1,1,1,1);
                metricas.setLocation(800, 760);
            }
        });
    }
}
