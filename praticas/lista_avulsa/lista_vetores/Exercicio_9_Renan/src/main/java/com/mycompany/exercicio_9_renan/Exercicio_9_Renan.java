/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_9_renan;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *Ler um vetor Q de 20 posições (aceitar somente números positivos).
 * Escrever a seguir o valor do maior elemento de Q e 
 * a respectiva posição que ele ocupa no vetor.
 * @author renan_8tvcd4n
 */
public class Exercicio_9_Renan {
    public static DataInputStream data;
    public static void main(String[] args) throws IOException{
        try {
            inputNumbers();
        }
        catch (NumberFormatException erro){
            System.out.println("Erro: " + erro.getMessage());
        }
    }
    public static void inputNumbers() throws IOException{
        String input;
        final int numNumbers = 20;
        int cValidNum = 0;
        float number;
        float[] numbers = new float[20];
        
        for (int i = 0; i < numNumbers; i++) {
            System.out.printf("%d.o valor: ", (i+1));
            data = new DataInputStream(System.in);
            input = data.readLine();
            number = Float.parseFloat(input);
            if ( number >= 0){
               numbers[cValidNum++] = number;
            }
        }
        
        largestNumber(numbers, cValidNum);
    }
    
    public static void largestNumber(float[] numbers, int cValidNum){
        float largNum = 0;
        int indexLargNum = 0;
        
        for (int i = 0; i < cValidNum; i++){
            if (numbers[i] > largNum){
                largNum = numbers[i];
                indexLargNum = i;
            }
        }
        
        System.out.printf("Maior numero: %f\n", largNum);
        System.out.printf("Indice do maior numero: %d", indexLargNum);
    }
}
