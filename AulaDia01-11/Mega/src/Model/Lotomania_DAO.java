
package Model;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;


public class Lotomania_DAO {
    public static void Loto(){
        int [] val1 = new int[5];
        int [] val2 = new int[5];
        int [] val3 = new int[5];
        int [] val4 = new int[5];


        String total1 = "";
        String total2 = "";
        String total3 = "";
        String total4 = "";

        Random gerar = new Random();

        for(int c = 0; c < 5; c++){
              val1[c] = gerar.nextInt(25);
           }

        Arrays.sort(val1);
        for(int c = 0; c < 5; c++){
            total1 = total1 + val1[c]+ " | ";
        }
        for(int c = 0; c < 5; c++){
              val2[c] = gerar.nextInt(50)+25;
           }


        Arrays.sort(val2);
        for(int c = 0; c < 5; c++){
            total2 = total2 + val2[c]+ " | ";
        }


        for(int c = 0; c < 5; c++){
              val3[c] = gerar.nextInt(75)+50;
           }

        Arrays.sort(val3);
        for(int c = 0; c < 5; c++){
            total3 = total3 + val3[c]+ " | ";
        }

        for(int c = 0; c < 5; c++){
              val4[c] = gerar.nextInt(99)+75;
           }

        Arrays.sort(val4);
        for(int c = 0; c < 5; c++){
            total4 = total4 + val4[c]+ " | ";
        }
        View.Inicio_GUI.txt.setText(total1+"\n"+total2+"\n"+total3+"\n"+total4);
        //JOptionPane.showMessageDialog(null,total1+"\n"+total2+"\n"+total3+"\n"+total4);
    }
}
