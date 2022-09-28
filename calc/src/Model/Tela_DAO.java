
package Model;

import javax.swing.JOptionPane;


public class Tela_DAO {
    
    public static void SolicitaOperação(){
        JOptionPane.showMessageDialog(null,"Escolha uma Opereção.");
        
        String operacao = JOptionPane.showInputDialog(null,"1. para soma \n2. para subtração \n3. para divisão \n4. para multiplicação.", "", -1);
        int m = Integer.parseInt(operacao);
        if(m == 1){
            Model.ClasseX_DAO.soma();
        }
        else if(m == 2){
            Model.ClasseX_DAO.subtracao();
        }
        else if(m == 3){
            Model.ClasseX_DAO.divisao();
        }
        else if(m == 4){
            Model.ClasseX_DAO.multplicacao();
        }
        else{
            JOptionPane.showMessageDialog(null,"Opção invalida!!");
        }
    }
    //Int valor = Integer.parseInt(variavel para converter)
}
