/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto_17_renan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author renan_8tvcd4n
 */
public class Inserir_Instrutor extends javax.swing.JFrame {

    /**
     * Creates new form Inserir_Instrutor
     */
    public Inserir_Instrutor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jtxtf_Nome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Jlbl_nome = new javax.swing.JLabel();
        Jlbl_Sobrenome = new javax.swing.JLabel();
        Jlbl_CPF = new javax.swing.JLabel();
        Jlbl_Tel = new javax.swing.JLabel();
        Jtxtf_Tel = new javax.swing.JTextField();
        Jtxtf_Sobrenome = new javax.swing.JTextField();
        Jtxtf_CPF = new javax.swing.JTextField();
        Jbtn_Cadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));

        Jtxtf_Nome.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel1.setText("Cadastro Instrutor");

        Jlbl_nome.setText("Nome:");

        Jlbl_Sobrenome.setText("Sobrenome:");

        Jlbl_CPF.setText("CPF:");

        Jlbl_Tel.setText("Telefone:");

        Jtxtf_Tel.setPreferredSize(new java.awt.Dimension(200, 30));

        Jtxtf_Sobrenome.setPreferredSize(new java.awt.Dimension(200, 30));

        Jtxtf_CPF.setPreferredSize(new java.awt.Dimension(200, 30));

        Jbtn_Cadastrar.setBackground(new java.awt.Color(0, 153, 0));
        Jbtn_Cadastrar.setText("Cadastrar");
        Jbtn_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_CadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(Jbtn_Cadastrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Jlbl_nome)
                                .addGap(34, 34, 34)
                                .addComponent(Jtxtf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jlbl_Sobrenome)
                                    .addComponent(Jlbl_CPF)
                                    .addComponent(Jlbl_Tel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jtxtf_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Jtxtf_Sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Jtxtf_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(180, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(248, 248, 248))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlbl_nome)
                    .addComponent(Jtxtf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlbl_Sobrenome)
                    .addComponent(Jtxtf_Sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jlbl_CPF)
                    .addComponent(Jtxtf_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jtxtf_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jlbl_Tel))
                .addGap(40, 40, 40)
                .addComponent(Jbtn_Cadastrar)
                .addGap(89, 89, 89))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jbtn_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_CadastrarActionPerformed
        // TODO add your handling code here:
        Connection connection = null;
        PreparedStatement statement = null;
        
        String url = "jdbc:mysql://localhost:3306/projeto18";
        String user = "root";
        String psswrd = "";
        
        try{
            connection = DriverManager.getConnection(url, user, psswrd);
            String query = "INSERT INTO instrutor(nome, sobrenome, CPF, telefone) VALUES(?,?,?,?)";
            statement = connection.prepareStatement(query);
            
            statement.setString(1, Jtxtf_Nome.getText());
            statement.setString(2, Jtxtf_Sobrenome.getText());
            statement.setString(3, Jtxtf_CPF.getText());
            statement.setString(4, Jtxtf_Tel.getText());
            statement.executeUpdate();
            System.out.println("Cadastro Realizado!");
            
        }catch (SQLException erro){
            System.out.println("Erro: " + erro.getMessage());
        }
    }//GEN-LAST:event_Jbtn_CadastrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inserir_Instrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inserir_Instrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inserir_Instrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inserir_Instrutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inserir_Instrutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbtn_Cadastrar;
    private javax.swing.JLabel Jlbl_CPF;
    private javax.swing.JLabel Jlbl_Sobrenome;
    private javax.swing.JLabel Jlbl_Tel;
    private javax.swing.JLabel Jlbl_nome;
    private javax.swing.JTextField Jtxtf_CPF;
    private javax.swing.JTextField Jtxtf_Nome;
    private javax.swing.JTextField Jtxtf_Sobrenome;
    private javax.swing.JTextField Jtxtf_Tel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}