
package main;

import java.util.Random;
import javax.swing.JOptionPane;


public class Main {

  
    public static void main(String[] args) {
        int [] val = new int[10];
        int i = 0;
        int resul = 0;
        Random grava = new Random();
        for(int c = 0; c < 10; c++){
            val[c] = grava.nextInt(10) -10;
            
            if(val[c] < 0){
                i++;
            }
            else{
                resul = resul + val[c];
            }
            
        }
        JOptionPane.showMessageDialog(null, "A soma dos números positivos é: "+resul+"\nE a quantidade dos números negativos é: "+i);
    }
    
}
