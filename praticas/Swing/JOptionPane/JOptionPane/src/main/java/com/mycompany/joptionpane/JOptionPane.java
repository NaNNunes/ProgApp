/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.joptionpane;

/**
 *
 * @author r.nunes
 */
public class JOptionPane {

    public static void main(String[] args) {
        final int qtdVal = 3;
        float[] notas = new float[qtdVal];
        String[] inputNota = new String[qtdVal - 1];
        
        float nota1 = 0;
        float nota2 = 0;
        float media = 0;
        
        for (int i = 0; i < (qtdVal - 1); i++) {
            inputNota[i] = JOptionPane.showInputDialog("entre com a nota " + i+1 + ":");
        }
        
        

        // Pega a primeira nota através de uma caixa de diálogo
        String inputNota1 = JOptionPane.showInputDialog("Entre com a nota 1:");
        nota1 = Float.parseFloat(inputNota1);  // Converte a string recebida para float

        // Pega a segunda nota através de uma caixa de diálogo
        String inputNota2 = JOptionPane.showInputDialog("Entre com a nota 2:");
        nota2 = Float.parseFloat(inputNota2);  // Converte a string recebida para float

        // Calcula a média das notas
        media = (nota1 + nota2) / 2;

        // Exibe o resultado em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, "A média é: " + media);
    }

    private static void showMessageDialog(Object object, String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static String showInputDialog(String entre_com_a_nota_2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
