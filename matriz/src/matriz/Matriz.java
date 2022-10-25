
package matriz;

import java.util.Random;
import javax.swing.JOptionPane;


public class Matriz {

    
    public static void main(String[] args) {
        int [] valor = new int[5]; //Declaração da vetor, matriz
        int [] armaz = new int[6];
        
        
        int [] valor2 = {14, 25, 67, 88, 90};
        double [] valor3 = {14.90, 25.00, 67, 88, 90};
        
        char [] valor4 = {'a', 'b', 'c'};
        String [] valor5 = {"a", "b"};
        Random gera = new Random();
        
        valor[0] = 28; //prenchendo variavel
        String total = "";
        for (int c=0; c<5; c++){
            String x = JOptionPane.showInputDialog(null, "Digite um valor: ");
            valor[c] = Integer.parseInt(x);
            total = total + valor[c]+ " - ";
            armaz[c] = gera.nextInt(3);
        }
        JOptionPane.showMessageDialog(null, total);
        
        
        
        //numeros randomicos
        
        
    }
    
}
