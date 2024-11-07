/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto_18_renan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author r.nunes
 */
public class CRUD_patos extends javax.swing.JFrame {

    /**
     * Creates new form CRUD_patos
     */
    public CRUD_patos() {
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

        Jtxtf_nome = new javax.swing.JTextField();
        Jtxtf_nomeCien = new javax.swing.JTextField();
        Jtxtf_idade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Jtxtf_altura = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Jtxtf_peso = new javax.swing.JTextField();
        Jtxtf_VelocidadeMedia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtbl_tabela = new javax.swing.JTable();
        Jbtn_cadastrar = new javax.swing.JButton();
        Jbtn_apagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Jtxtf_nome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Jtxtf_nome.setPreferredSize(new java.awt.Dimension(120, 30));

        Jtxtf_nomeCien.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Jtxtf_nomeCien.setPreferredSize(new java.awt.Dimension(120, 30));

        Jtxtf_idade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Jtxtf_idade.setPreferredSize(new java.awt.Dimension(120, 30));

        jLabel1.setText("Nome:");

        jLabel2.setText("Cadastro de Patos de Corrida");

        jLabel3.setText("Nome Cientifico");

        jLabel4.setText("idade:");

        jLabel5.setText("altura:");

        Jtxtf_altura.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Jtxtf_altura.setPreferredSize(new java.awt.Dimension(120, 30));
        Jtxtf_altura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtxtf_alturaActionPerformed(evt);
            }
        });

        jLabel6.setText("Peso:");

        jLabel7.setText("Valocidade Média:");

        Jtxtf_peso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Jtxtf_peso.setPreferredSize(new java.awt.Dimension(120, 30));

        Jtxtf_VelocidadeMedia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Jtxtf_VelocidadeMedia.setPreferredSize(new java.awt.Dimension(120, 30));

        Jtbl_tabela.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Jtbl_tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "numero", "nome", "nome Cientifico", "idade", "altura", "peso", "velocidade"
            }
        ));
        jScrollPane1.setViewportView(Jtbl_tabela);

        Jbtn_cadastrar.setText("Cadastrar");
        Jbtn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_cadastrarActionPerformed(evt);
            }
        });

        Jbtn_apagar.setText("Apagar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Jtxtf_idade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Jtxtf_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(166, 166, 166)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(172, 172, 172)
                                        .addComponent(jLabel5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jtxtf_altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Jtxtf_VelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(Jbtn_cadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Jbtn_apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Jtxtf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(172, 172, 172)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addComponent(Jtxtf_nomeCien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(237, 237, 237))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jtxtf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(Jtxtf_nomeCien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jtxtf_idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(Jtxtf_altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Jtxtf_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(Jtxtf_VelocidadeMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbtn_apagar)
                    .addComponent(Jbtn_cadastrar))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            String query = "SELECT * FROM pato";
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto_18", "root", "");
            PreparedStatement statement = (PreparedStatement) connection.prepareStatement(query);
            try{
                statement.execute();

                ResultSet resultSet = statement.executeQuery(query);

                DefaultTableModel model = (DefaultTableModel) Jtbl_tabela.getModel();
                model.setNumRows(0);

                while(resultSet.next()){
                    model.addRow(new Object[] {
                        resultSet.getString("id_pato"),
                        resultSet.getString("nome"),
                        resultSet.getString("nome_cientifico"),
                        resultSet.getString("idade"),
                        resultSet.getString("altura"),
                        resultSet.getString("peso"),
                        resultSet.getString("velocidade_media"),

                    });
                }
            }catch (SQLException erro){
                System.out.println("Erro: " + erro.getMessage());
            }   
        } catch (SQLException ex) {
            Logger.getLogger(CRUD_patos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void Jtxtf_alturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtxtf_alturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtxtf_alturaActionPerformed

    private void Jbtn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_cadastrarActionPerformed
        
        String url = "jdbc:mysql://localhost:3306/projeto_18";
        String user = "root";
        String pss = "";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = DriverManager.getConnection(url, user, pss);
            String query = "INSERT INTO pato(nome, nome_cientifico, idade, altura, peso, velocidade) values(?,?,?,?,?,?)";
            statement = connection.prepareStatement(query);
            
            statement.setString(1, Jtxtf_nome.getText());
            statement.setString(2, Jtxtf_nomeCien.getText());
            statement.setString(3, Jtxtf_idade.getText());
            statement.setString(4, Jtxtf_altura.getText());
            statement.setString(5, Jtxtf_peso.getText());
            statement.setString(6, Jtxtf_VelocidadeMedia.getText());
            
            statement.execute();
            System.out.println("Pato cadastrado");
        }
        catch (SQLException erro){
            System.out.println("Erro: " + erro.getMessage());
        }
        
    }//GEN-LAST:event_Jbtn_cadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(CRUD_patos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD_patos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD_patos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD_patos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD_patos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbtn_apagar;
    private javax.swing.JButton Jbtn_cadastrar;
    private javax.swing.JTable Jtbl_tabela;
    private javax.swing.JTextField Jtxtf_VelocidadeMedia;
    private javax.swing.JTextField Jtxtf_altura;
    private javax.swing.JTextField Jtxtf_idade;
    private javax.swing.JTextField Jtxtf_nome;
    private javax.swing.JTextField Jtxtf_nomeCien;
    private javax.swing.JTextField Jtxtf_peso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}