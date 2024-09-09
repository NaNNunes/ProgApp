/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_4_renan;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *Escreva um algoritmo em PORTUGOL que armazene em um vetor o quadrado dos
    números ímpares no intervalo fechado de 1 a 20. Após isso, o algoritmo deve imprimir todos
    os valores armazenados.
 * @author renan_8tvcd4n
 */
public class Exercicio_4_Renan {
    
    public static void main(String[] args) throws IOException {
        DataInputStream data;
        String input;
        final int interval = 21;
        float number;
        float[] squaredOdd = new float[interval];
        int cOdd = 0;
        
        try {
            for (int i = 0; i < interval; i++){
                System.out.printf("%d.o valor: ", (i+1));
                data = new DataInputStream(System.in);
                input = data.readLine();
                number = Float.parseFloat(input);
                if (number > 0 && number < interval){
                    if (number % 2 != 0){
                        squaredOdd[cOdd++] = (number * number);
                    }
                }
            }

            System.out.println("Quadrado de valores ímpares informados: ");
            for (int i = 0; i < cOdd; i++) {
                System.out.printf("%.0f ", squaredOdd[i]);
            }
        }
        catch (NumberFormatException erro){
            System.out.println("Erro: " + erro.getMessage());
        }
    }
}
