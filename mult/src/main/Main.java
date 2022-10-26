
package main;

import java.util.Random;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
       int [] val = new int[7];
       int val1 = 0;
       int val2 = 0;
       String mult1 = "";
       String mult2 = "";
       String mult3 = "";
       Random grava = new Random();
       
       for(int c = 0; c < 7; c++){
           val[c] = grava.nextInt(100);
           val1 = val[c] % 2;
           val2 = val[c] % 3;
           if(val1 == 0 && val2 == 0){
             mult1 = mult1 + val[c] + " | ";           }
           else if (val1 == 0){
               mult2 = mult2 + val[c] + " | ";               
           }
           else if(val2 == 0 ){
               mult3 = mult3 + val[c] + " | ";
           }else{}
                
       }
       JOptionPane.showMessageDialog(null, mult1 + "\n" + mult2 + "\n" + mult3);
    }
    
}
