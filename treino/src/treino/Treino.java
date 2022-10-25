
package treino;

import javax.swing.JOptionPane;


public class Treino {

    
    public static void main(String[] args) {
        int [] armazena = new int[9];
        String total = "";
        
        for(int i=0; i < 4; i++){
            String x = JOptionPane.showInputDialog(null, "Digite um valor: ");
            armazena[i] = Integer.parseInt(x);
            total = total + armazena[i] + " | ";
            
        }
        JOptionPane.showMessageDialog(null, total);
    }
    
}
