import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Grafo extends JFrame {
    /*
    esta clase dibuja exactamente lo mismo de Window pero al final dependiendo del procesamiento que se recibe con el vector orden
    se van poniendo graficamente el paso a paso de lo que se va procesando
     */
    private JPanel panel;
    private JButton button1;
    ArrayList<String> estados;
    ArrayList<Character> alfabeto;
    String[][] matriz;
    ArrayList<Integer> orden;
    String[] proceso;
    int contador = 0;

    public Grafo(ArrayList<String> estados, ArrayList<Character> alfabeto, String[][] matriz, ArrayList<Integer> orden, String procesos){
        add(panel);
        setSize(357,350);
        setVisible(true);
        setTitle("AUTOMA - ANIMACIÓN");
        this.estados = estados;
        this.alfabeto = alfabeto;
        this.matriz = matriz;
        this.orden = orden;

        //separar la cadena de entrada para poder mostrar el paso a paso correctamente
        this.proceso = procesos.split("--");
        for(int h = 0; h < proceso.length; h++){
            proceso[h] = proceso[h].substring(0, proceso[h].length() - 1);
            if(h == 0)
                proceso[h] = " " + proceso[h].substring(0, proceso[h].length() - 1);
        }
        int posCorchete = proceso[proceso.length - 1].indexOf("]");
        proceso[proceso.length - 1] = proceso[proceso.length - 1].substring(0, posCorchete + 1);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> estadosOrdenados = estados;
                Color color = new Color(241, 239, 241);
                Graphics g = panel.getGraphics();
                g.setColor(color);
                g.fillPolygon(new int[]{120, 300, 300, 120}, new int[]{60, 60, 100, 100}, 4);
                //flecha incial
                g.setColor(Color.BLACK);
                String q;
                int posQ, difEstados;

                //flecha incial
                g.drawLine(25,195,50,195);
                g.fillPolygon(new int[]{40, 40, 50}, new int[]{190,200,195}, 3);

                for (int i = 0; i < estados.size(); i++){
                    //estado
                    g.drawString(estadosOrdenados.get(i), 58 + 100 * i, 200);
                    g.drawOval(50 + 100 * i, 180, 30, 30);
                    int a = 55;
                    int b = 100;

                    //estado final con doble linea
                    if(i == estados.size()-1)
                        g.drawOval(52 + 100 * i, 182, 26, 26);

                    //arcos
                    for (int j = 0; j < alfabeto.size(); j++){
                        if(matriz[i][j] != null && matriz[i][j].equals(estados.get(i))){
                            //etiqueta
                            g.drawString(alfabeto.get(j).toString(), 52 + 100 * i + 10 * j, 150);
                            //arco ciclo
                            g.drawLine(55 + 100 * i,185, 55 + 100 * i, 160);
                            g.drawLine(55 + 100 * i,160, 65 + 100 * i, 160);
                            g.drawLine(65 + 100 * i,180, 65 + 100 * i, 160);
                            g.fillPolygon(new int[]{60 + 100 * i, 65 + 100 * i, 70 + 100 * i}, new int[]{170, 180, 170}, 3);
                        }else if(matriz[i][j] != null){
                            //flacha larga
                            q =  matriz[i][j];
                            posQ = estados.indexOf(q);
                            difEstados = Math.abs(posQ - i);
                            if(difEstados > 1){
                                if(i < posQ){//flecha hacia la derecha y poner la etiqueta sobre el arco
                                    //etiqueta
                                    g.drawString(alfabeto.get(j).toString(), (130 + 200 * i + 100 * difEstados) / 2 + 10 * j, 170 + 65 * 1);
                                    //arco
                                    g.drawLine(65 + 100 * i,210, 65 + 100 * i, 220 + 20 * 1);
                                    g.drawLine(65 + 100 * i,220 + 20 * 1, 65 + (100 * (i + difEstados)), 220 + 20 * 1);
                                    g.drawLine(65 + (100 * (i + difEstados)),220 + 20 * 1, 65 + (100 * (i + difEstados)), 210);
                                    g.fillPolygon(new int[]{60 + (100 * (i + difEstados)), 65 + (100 * (i + difEstados)), 70 + (100 * (i + difEstados))}, new int[]{220, 210, 220}, 3);
                                }
                                if(i > posQ){
                                    //etiqueta
                                    g.drawString(alfabeto.get(j).toString(), (130 + 200 * i - 100 * difEstados)  / 2 + 10 * j, 190 + 65 * j);
                                    //arco
                                    g.drawLine(65 + (100 * (i - difEstados)),220 + 20 * j, 65 + (100 * (i - difEstados)), 210);
                                    g.drawLine(65 + 100 * i,220 + 20 * j, 65 + (100 * (i - difEstados)), 220 + 20 * j);
                                    g.drawLine(65 + 100 * i,210, 65 + 100 * i, 220 + 20 * j);

                                    g.fillPolygon(new int[]{60 + (100 * (i - difEstados)), 65 + (100 * (i - difEstados)), 70 + (100 * (i - difEstados))}, new int[]{220, 210, 220}, 3);
                                }
                            }else{
                                if(i < posQ){
                                    //etiqueta
                                    g.drawString(alfabeto.get(j).toString(), 105 + 100 * i + 10 * j, 190);
                                    //arco
                                    g.drawLine(25 + a + (i * b),195,90 + a + (i * b),195);
                                    g.fillPolygon(new int[]{40 + ((i + 1) * b), 40 + ((i + 1) * b), 50 + ((i + 1) * b)}, new int[]{190, 200, 195}, 3);
                                }
                                if(i > posQ){
                                    //etiqueta
                                    g.drawString(alfabeto.get(j).toString(), 105 * i + 10 * j, 210);
                                    //tringulo de flecha
                                    g.fillPolygon(new int[]{80 + ((i - 1)  * b), 90 + ((i - 1) * b), 90 + ((i - 1) * b)}, new int[]{195, 200, 190}, 3);
                                }

                            }
                        }
                    }
                }
                //dibujar de otro color el estado actual y poner el pedazo de procesamiento que lleva
                String cade = "";
                if(contador >= proceso.length)
                    cade = "Fin del procesamiento.";
                else{
                    cade = proceso[contador];
                    g.setColor(Color.RED);
                    g.drawOval(50 + 100 * orden.get(contador), 180, 30, 30);
                }
                g.setColor(Color.BLACK);
                g.drawString(cade, 120,80);
                contador++;
                //estadosOrdenados.indexOf(contador)
            }

        });
    }
}
