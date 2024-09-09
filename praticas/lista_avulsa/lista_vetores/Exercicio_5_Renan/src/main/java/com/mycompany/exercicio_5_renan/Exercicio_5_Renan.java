/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_5_renan;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *Escreva um algoritmo que receba dez números do usuário e armazene em um vetor a
metade de cada número. Após isso, o algoritmo deve imprimir todos os valores armazenados.
 * @author renan_8tvcd4n
 */
public class Exercicio_5_Renan {

    public static void main(String[] args) throws IOException {
        DataInputStream data;
        String input;
        final int qtdVal = 10;
        float[] valores = new float[qtdVal];
        
        for (int i = 0; i < qtdVal; i++) {
            System.out.printf("%d.o valor: ", (i+1));
            data = new DataInputStream(System.in);
            input = data.readLine();
            valores[i] = Float.parseFloat(input);
            valores[i] = (valores[i] / 2);
        }
        
        System.out.println("Metade de cada valor informado: ");
        for (float valor : valores) {
            System.out.printf("%.2f ", valor);
        }
    }
}
