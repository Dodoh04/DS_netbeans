
package cinconum;

import java.util.Random;
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
       int [] val = new int[5];
        int i = 0;
        int resul = 0;
        String total = "";
        Random grava = new Random();
        for(int c = 0; c < 5; c++){
            val[c] = grava.nextInt(10) -50;
            
            if(val[c] >= 0){
                total = total + val[c] + " | ";
            }
            else{
                
            }
            
        }
        JOptionPane.showMessageDialog(null, total);
    }
    
}
