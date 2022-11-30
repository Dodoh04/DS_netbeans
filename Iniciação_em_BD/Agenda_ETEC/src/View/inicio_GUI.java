
package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class inicio_GUI extends javax.swing.JFrame {

    //-->inicio    
 static int cod;
 static String nom;
 static String em;
 static long tel; 
    
  String url2 = "jdbc:mysql://localhost/aprender"; // enderço do BD
  String username = "root";        //nome de um usuário de seu BD
  String password = "";  // senha do BD

    //-->fim
    public inicio_GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jMenuItem1 = new javax.swing.JMenuItem();
        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("APRENDER?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        clienteQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Cliente c");
        clienteList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clienteQuery.getResultList();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        email2 = new javax.swing.JTextField();
        nome2 = new javax.swing.JTextField();
        tel2 = new javax.swing.JTextField();
        gravar = new javax.swing.JButton();
        fechar = new javax.swing.JButton();
        email1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        tel3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cod3 = new javax.swing.JTextField();
        nome3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        email3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        consulta = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("Agenda");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(244, 33, 120, 44);

        email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        email.setText("E-mail:");
        jPanel2.add(email);
        email.setBounds(63, 215, 55, 22);

        nome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nome.setText("Nome:");
        jPanel2.add(nome);
        nome.setBounds(63, 148, 52, 22);
        jPanel2.add(jLabel9);
        jLabel9.setBounds(398, 230, 212, 43);
        jPanel2.add(email2);
        email2.setBounds(174, 206, 220, 31);
        jPanel2.add(nome2);
        nome2.setBounds(174, 147, 220, 31);
        jPanel2.add(tel2);
        tel2.setBounds(174, 277, 220, 31);

        gravar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gravar.setText("Gravar");
        gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gravarActionPerformed(evt);
            }
        });
        jPanel2.add(gravar);
        gravar.setBounds(360, 365, 110, 40);

        fechar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fechar.setText("X");
        jPanel2.add(fechar);
        fechar.setBounds(501, 365, 70, 40);

        email1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        email1.setText("Telefone : ");
        jPanel2.add(email1);
        email1.setBounds(40, 278, 86, 22);

        jTabbedPane1.addTab("Cadastrar", jPanel2);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, clienteList, tabela);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliCod}"));
        columnBinding.setColumnName("Código");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliNime}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliEmail}"));
        columnBinding.setColumnName("E-mail");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliTel}"));
        columnBinding.setColumnName("Telefone");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tabela);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 615, 174);
        jPanel1.add(tel3);
        tel3.setBounds(100, 370, 200, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nome:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 270, 80, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Codigo:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(15, 200, 80, 22);
        jPanel1.add(cod3);
        cod3.setBounds(90, 200, 190, 30);
        jPanel1.add(nome3);
        nome3.setBounds(90, 260, 190, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("E-mail:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 310, 80, 22);
        jPanel1.add(email3);
        email3.setBounds(90, 310, 190, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Telefone:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 370, 80, 22);

        consulta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        consulta.setText("Consultar");
        consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaActionPerformed(evt);
            }
        });
        jPanel1.add(consulta);
        consulta.setBounds(430, 410, 130, 31);

        jTabbedPane1.addTab("Gerenciar", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gravarActionPerformed
        //-->inicio
        nom = nome2.getText(); // recebendo o nome
      em = email2.getText(); // recebendo o email      
      tel = Long.valueOf(tel2.getText());// recebendo o telefone

       

             
      try { 
               
                   
               
            Connection con = null;
            
            
    try {
    con = (Connection) DriverManager.getConnection(url2, username, password);
    } catch (SQLException ex) {

    Logger.getLogger(inicio_GUI.class.getName()).log(Level.SEVERE, null, ex);

            
                   }

            // Recebendo os dados a serem inseridos na tabela
            String sql = "INSERT INTO CLIENTE (cli_nime,cli_email,cli_tel) values('"+nom+"','"+em+"','"+tel+"')";
     
            try { // Tratamento de Erros para inserção

                // Criando varialvel que executara a inserção
                PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql);
                inserir.execute(); // Executando a inserção

  JOptionPane.showMessageDialog(null,"\nInserção realizada com sucesso!!!\n","",-1);
                nome2.setText("");
                email2.setText("");
                tel2.setText("");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"\nErro na inserção!","ERRO!",0);
            }

        }catch(NumberFormatException erro){
            // Tratamento de erro caso o usuario não digite o telefone corretamente
            JOptionPane.showMessageDialog(null,"Digite os dados corretamente","ERRO",0);
            tel2.setText("");
        }

       
      
        
        //-->fim
    }//GEN-LAST:event_gravarActionPerformed

    private void consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaActionPerformed
       //-->inicio
       
       
       try{     //Iniciando o possivel tratamento de erros
            //Declarando a variavel código
            cod = Integer.valueOf(cod3.getText());
            try {// Tratamento de erro para a conexao
                // Declarando  a variavel de conexão con
                // e estabelendo a conexão
                Connection con = null;

                try {
                    con = (Connection) DriverManager.getConnection(url2, username, password);
                } catch (SQLException ex) {
                    Logger.getLogger(inicio_GUI.class.getName()).log(Level.SEVERE, null, ex);
                }

                // Declarando uma string com o comando mySQL para consulta
                String sql = "SELECT cli_nome, cli_email, cli_tel FROM cliente where cli_cod = "+cod3.getText();
                // Criando variavel que executara o comando da string sql
                Statement stm = (Statement) con.createStatement();
                try//Tratamento de erro da consulta
                { //Criando variavel que exibira os resultados
                    //Executando o comando da string sql na variavel rs
                    ResultSet rs = stm.executeQuery(sql);

                    int i=0; // Variavel utilizada para saber se ha dados cadastrados

                    while (rs.next()) {  // Criando variaveis que receberão os valores do banco de dados
                        String nome = rs.getString("cli_nome");
                        String email = rs.getString("cli_email");
                        String telefone = rs.getString("cli_tel");

                        i++;
                        nome3.setText(String.valueOf(nome));
                        email3.setText(String.valueOf(email));
                        tel3.setText(String.valueOf(telefone));

                    }

                    if(i==0){ // Verificando se ha dados cadastrados atraves da variavel i

                        JOptionPane.showMessageDialog(null,"Dado não cadastrado","Resultado",-1);

                    }

                } catch (Exception ex) { // Consulta mal sucedida
                    JOptionPane.showMessageDialog(null,"\nErro ao consultar!","ERRO",0);
                }

            } catch (SQLException ex) {
                // Conexão com servidor mal sucedida
                JOptionPane.showMessageDialog(null,"Erro ao conectar com o servidor","ERRO!",0);
            }

        }catch(NumberFormatException erro){
            // Código fora do formato
            JOptionPane.showMessageDialog(null,"Digite o código corretamante","ERRO",0);
            cod3.setText("");
        }

       
       //-->fim
    }//GEN-LAST:event_consultaActionPerformed


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<View.Cliente> clienteList;
    private javax.persistence.Query clienteQuery;
    private javax.swing.JTextField cod3;
    private javax.swing.JButton consulta;
    private javax.swing.JLabel email;
    private javax.swing.JLabel email1;
    private javax.swing.JTextField email2;
    private javax.swing.JTextField email3;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton fechar;
    private javax.swing.JButton gravar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel nome;
    private javax.swing.JTextField nome2;
    private javax.swing.JTextField nome3;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField tel2;
    private javax.swing.JTextField tel3;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
