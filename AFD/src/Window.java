import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Window extends JFrame {

    ArrayList<String> estados;
    ArrayList<Character> alfabeto;
    String[][] matriz;

    public Window(ArrayList<String> estados, ArrayList<Character> alfabeto, String[][] matriz){
        super("AUTOMA - GRAFO");
        this.estados = estados;
        this.alfabeto = alfabeto;
        this.matriz = matriz;
        setSize(700,350);
        setVisible(true);
    }

    public void paint(Graphics g){
        super.paint(g);
        //flecha incial
        g.drawLine(25,195,50,195);
        g.fillPolygon(new int[]{40, 40, 50}, new int[]{190,200,195}, 3);

        for (int i = 0; i < estados.size(); i++){
            //estado
            g.drawString(estados.get(i), 58 + 100 * i, 200);
            g.drawOval(50 + 100 * i, 180, 30, 30);
            int a = 55;
            int b = 100;

            //estado final con doble linea
            if(i == estados.size()-1){
                g.drawOval(52 + 100 * i, 182, 26, 26);
            }

            //ciclo
            for (int j = 0; j < alfabeto.size(); j++){
                if(matriz[i][j] != null && matriz[i][j].equals(estados.get(i))){
                    //etiqueta
                    g.drawString(alfabeto.get(j).toString(), 57 + 100 * i, 150);
                    //arco
                    g.drawLine(55 + 100 * i,185, 55 + 100 * i, 160);
                    g.drawLine(55 + 100 * i,160, 65 + 100 * i, 160);
                    g.drawLine(65 + 100 * i,180, 65 + 100 * i, 160);
                    g.fillPolygon(new int[]{60 + 100 * i, 65 + 100 * i, 70 + 100 * i}, new int[]{170, 180, 170}, 3);
                }else if(matriz[i][j] != null && ! matriz[i][j].equals(estados.get(i))){
                    //flacha larga
                    if(i < estados.size() - 1){
                        //etiqueta
                        g.drawString(alfabeto.get(j).toString(), 105 + 100 * i, 190);
                        //arco
                        g.drawLine(25 + a + (i * b),195,90 + a + (i * b),195);
                        g.fillPolygon(new int[]{40 + ((i + 1) * b), 40 + ((i + 1) * b), 50 + ((i + 1) * b)}, new int[]{190, 200, 195}, 3);
                    }
                }
            }
        }
    }
}
