/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_3_renan;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *Escreva um algoritmo que armazene em um vetor todos os números pares do intervalo
fechado de 1 a 100. Após isso, o algoritmo deve imprimir todos os valores armazenados
 * @author renan_8tvcd4n
 */
public class Exercicio_3_Renan {
    public static DataInputStream data;
    public static String input;
    
    public static final int largeNum = 100;
    public static int cPairs = 0;
    public static float[] pairNumbers = new float[largeNum]; 
    
    public static void main(String[] args) throws IOException {
        float number;
        try {
            for (int i = 0; i < largeNum; i++) {
                System.out.printf("%d.o valor: ", (i+1));
                data = new DataInputStream(System.in);
                input = data.readLine();
                number = Float.parseFloat(input);
                if (number > 0 && number <= largeNum){
                    if (number % 2 == 0){
                        pairNumbers[cPairs++] = number;
                    }
                }
            }

            System.out.println("Valores pares encontrados entre 1 e 100:");
            for (int i = 0; i < cPairs; i++){
                System.out.printf("%.0f ", pairNumbers[i]);
            }
        }
        catch (NumberFormatException erro){
            System.out.println("Erro: " + erro.getMessage());
        }
    }
}
