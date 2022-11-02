package Model;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

public class megaSena_DAO {
    
    public static void MegaSena(){
    int [] val = new int[6];
    
    String total = "";
    Random gerar = new Random();
    
    for(int c = 0; c < 6; c++){
          val[c] = gerar.nextInt(60);
       }
    
    Arrays.sort(val);
    for(int c = 0; c < 6; c++){
        total = total + val[c]+ " | ";
    }
     
    View.Inicio_GUI.txt.setText(total);
    
    
    
    JOptionPane.showMessageDialog(null,total);
    
    
    
    
    }
}



