package Controller;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Testa_DB {
    public static void conecta(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Conexão realizada com sucesso");
        } catch (Exception ex) {
           System.out.println("Driver ou banco Inexistente");
        }
    }
}
