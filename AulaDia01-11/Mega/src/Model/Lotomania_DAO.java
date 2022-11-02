
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
    
    
    String total = "";
    Random gerar = new Random();
    
    for(int c = 0; c < 5; c++){
          val1[c] = gerar.nextInt(25);
       }
    
    Arrays.sort(val1);
    for(int c = 0; c < 5; c++){
        total = total + val1[c]+ " | ";
    }
    
    total = total + "\n \n";
    
    for(int c = 0; c < 5; c++){
          val2[c] = gerar.nextInt(25);
       }
    
    
    Arrays.sort(val2);
    for(int c = 0; c < 5; c++){
        total = total + val2[c]+ " | ";
    }
    
    
    for(int c = 0; c < 5; c++){
          val3[c] = gerar.nextInt(25);
       }
    
    Arrays.sort(val3);
    for(int c = 0; c < 5; c++){
        total = total + val3[c]+ " | ";
    }
    
    for(int c = 0; c < 5; c++){
          val4[c] = gerar.nextInt(25);
       }
    
    Arrays.sort(val4);
    for(int c = 0; c < 5; c++){
        total = total + val4[c]+ " | ";
    }
    JOptionPane.showMessageDialog(null,total);
    }
}
