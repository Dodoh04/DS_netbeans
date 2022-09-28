
package Model;

import javax.swing.JOptionPane;


public class ClasseX_DAO {
    public static double valor1 = 0;
    public static double valor2 = 0;
      
    
    public static void soma(){
        double result = 0;
        String operacao = JOptionPane.showInputDialog(null,"Digite o valor ", "", -1);
        int valor1 = Integer.parseInt(operacao);
        
        operacao = JOptionPane.showInputDialog(null,"Digite o valor ", "", -1);
        int valor2 = Integer.parseInt(operacao);
        
        result = (valor1 + valor2);
        JOptionPane.showMessageDialog(null,"A soma de "+ valor1 +" é "+valor2+" igual a: "+ result);
    }
    
    public static void subtracao(){
        double result = 0;
        String operacao = JOptionPane.showInputDialog(null,"Digite o valor ", "", -1);
        int valor1 = Integer.parseInt(operacao);
        
        operacao = JOptionPane.showInputDialog(null,"Digite o valor ", "", -1);
        int valor2 = Integer.parseInt(operacao);
        
        result = (valor1 - valor2);
        JOptionPane.showMessageDialog(null,"A subtração de "+ valor1 +" é "+valor2+" igual a: "+ result);
        
    }
    public static void divisao(){
        double result = 0;
        String operacao = JOptionPane.showInputDialog(null,"Digite o valor ", "", -1);
        int valor1 = Integer.parseInt(operacao);
        
        operacao = JOptionPane.showInputDialog(null,"Digite o valor ", "", -1);
        int valor2 = Integer.parseInt(operacao);
        
        result = (valor1 / valor2);
        JOptionPane.showMessageDialog(null,"A divisão de "+ valor1 +" é "+valor2+" igual a: "+ result);
        
    }
    public static void multplicacao(){
        double result = 0;
        String operacao = JOptionPane.showInputDialog(null,"Digite o valor ", "", -1);
        int valor1 = Integer.parseInt(operacao);
        
        operacao = JOptionPane.showInputDialog(null,"Digite o valor ", "", -1);
        int valor2 = Integer.parseInt(operacao);
        
        result = (valor1 * valor2);
        JOptionPane.showMessageDialog(null,"A Multiplicação de "+ valor1 +" é "+valor2+" igual a: "+ result);
    }
}
//(variavel.equals("A") || variavel.equals("a")  comparação de strings
//string x2 =  x.toIpperCase conversão de minusculo ou maiuscula