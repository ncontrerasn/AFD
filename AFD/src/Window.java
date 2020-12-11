import javax.swing.*;
import java.awt.*;
//import java.awt.geom.Path2D;
import java.util.ArrayList;

public class Window extends JFrame {

    ArrayList<String> estados = new ArrayList<>();
    ArrayList<Character> alfabeto = new ArrayList<>();
    String[][] matriz;
    JButton jButton;
    JTextArea jTextArea;
    JPanel jPanel;

    public Window(ArrayList<String> estados, ArrayList<Character> alfabeto, String[][] matriz){
        super("AUTOMA-CINCO");
        this.estados = estados;
        this.alfabeto = alfabeto;
        this.matriz = matriz;
        setSize(350,350);
        setVisible(true);
        //add(jPanel);
    }

    public void paint(Graphics g){
        super.paint(g);
        //flecha incial
        g.drawLine(25,195,50,195);
        g.fillPolygon(new int[]{40, 40, 50}, new int[]{190,200,195}, 3);

        for (int i = 0; i < estados.size(); i++){
            g.drawString(estados.get(i), 58 + 100 * i, 200);
            g.drawOval(50 + 100 * i, 180, 30, 30);
            int a = 55;
            int b = 100;

            //flacha larga
            if(i < estados.size() - 1){
                g.drawLine(25 + a + (i * b),195,90 + a + (i * b),195);
                g.fillPolygon(new int[]{40 + ((i + 1) * b), 40 + ((i + 1) * b), 50 + ((i + 1) * b)}, new int[]{190, 200, 195}, 3);
            }

            //ciclo
            for (int j = 0; j < alfabeto.size(); j++){
                //System.out.println("matriz: " + matriz[i][j]);
                //System.out.println("estados: " + estados.get(i));
                //System.out.println("");
                if(matriz[i][j] != null && matriz[i][j].equals(estados.get(i))){
                    g.drawLine(55 + 100 * i,185, 55 + 100 * i, 160);
                    g.drawLine(55 + 100 * i,160, 65 + 100 * i, 160);
                    g.drawLine(65 + 100 * i,180, 65 + 100 * i, 160);
                    g.fillPolygon(new int[]{60 + 100 * i, 65 + 100 * i, 70 + 100 * i}, new int[]{170, 180, 170}, 3);
                }
            }
        }
    }
}
