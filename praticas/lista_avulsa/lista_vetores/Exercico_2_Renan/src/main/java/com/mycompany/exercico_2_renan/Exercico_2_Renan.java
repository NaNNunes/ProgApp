/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercico_2_renan;

import java.io.DataInputStream;

/**
 *Escreva um algoritmo que armazene em um vetor todos os números inteiros de 100 a
    1 (em ordem decrescente). Após isso, o algoritmo deve imprimir todos os valores
    armazenados.
 * @author renan_8tvcd4n
 */
public class Exercico_2_Renan {
    public static final int largNum = 11;
    public static int contaNumValidos = 0;
    public static DataInputStream data;
    public static String input;
    
    public static void main(String[] args) throws Exception{
        float[] values = new float[largNum];
        float number;
        
        try {
            for (int i = largNum; i >= 1; i--) {
                System.out.printf("%d.o valor: ", (i-1));
                data = new DataInputStream(System.in);
                input = data.readLine();
                number = Float.parseFloat(input);
                if (number < (largNum - 1) && number >= 0){
                    values[contaNumValidos++] = number;
                }
            }

            System.out.println("Valores informados entre 0 e :" + (largNum - 1));
            for (int i = 0; i < contaNumValidos; i++) {
                System.out.printf("%.4f ", values[i]);
            }
        }
        catch (NumberFormatException erro){
            System.out.println("Erro: " + erro.getMessage());
        }
    }
    
}
