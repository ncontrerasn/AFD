import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Form extends JFrame {
    private JButton simularButton;
    private JTextArea textArea2;
    private JPanel panel1;

    public Form(ArrayList<String> estados, ArrayList<Character> alfabeto, String[][] matriz){
        add(panel1);
        setSize(350, 600);
        setTitle("AUTOMA - CINCO");
        simularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = textArea2.getText();
                System.out.println(texto);
                //setVisible(false);
                //dispose();
                Window window = new Window(estados, alfabeto, matriz);
                //window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
