
package Model;

import java.util.Arrays;
import java.util.Random;


public class Quina_DAO {
    
    
    public static void Quina(){
    int [] val = new int[5];
    
    String total = "";
    Random gerar = new Random();
    
    for(int c = 0; c < 5; c++){
          val[c] = gerar.nextInt(80);
       }
    
    Arrays.sort(val);
    for(int c = 0; c < 5; c++){
        total = total + val[c]+ " | ";
    }
    }
}
