/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_10_renan;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *O mesmo exercício anterior, mas agora deve escrever o menor elemento do vetor e a
respectiva posição dele nesse vetor.
 * @author renan_8tvcd4n
 */
public class Exercicio_10_Renan {
    public static DataInputStream data;
    public static int cValidNum = 0;
    public static void main(String[] args) throws IOException {
        float[] numbers;
        try {
            outputNumbers(sorterNumbers(numbers = inputNumbers(), cValidNum));
        }
        catch (NumberFormatException erro){
            System.out.println("Erro: " + erro.getMessage());
        }
    }
    
    public static float[] inputNumbers()throws IOException{
        String input;
        final int numNumbers = 20;
        
        float number;
        float[] numbers = new float[numNumbers];
        
        for (int i = 0; i < numNumbers; i++) {
            System.out.printf("%d.o valor: ", (i+1));
            data = new DataInputStream(System.in);
            number = Float.parseFloat(input = data.readLine());
            if (number >= 0){
                numbers[cValidNum++] = number;
            }
        }
        return numbers;
    }
    
    public static float[] sorterNumbers(float[] numbers, int cValidNumbers){
        int indexAux;
        float aux;
        for (int i = 0; i < cValidNumbers; i++) {
            indexAux = i;
            aux = numbers[i];
            while (indexAux > 0 && numbers[(indexAux - 1)] > aux){
                numbers[indexAux] = numbers[(indexAux - 1)];
                indexAux --;
            }
            numbers[indexAux] = aux;
        }
        return numbers;
    }
    
    public static void outputNumbers(float[] numbers){
        for (int i = 0; i < cValidNum; i++) {
            System.out.printf("%f\n", numbers[i]);
        }
        
        System.out.println("O menor valor é: " + numbers[0]);
    }
}
