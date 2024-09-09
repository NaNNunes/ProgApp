/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercico_11_renan;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *Ler um vetor A de 10 números. Após, ler mais um número e guardar em uma variável X. 
* Armazenar em um vetor M o resultado de cada elemento de A multiplicado pelo valor X.
Logo após, imprimir o vetor M.
 * @author renan_8tvcd4n
 */
public class Exercico_11_Renan {
    public static DataInputStream data;
    public static void main(String[] args) throws IOException{
        try {
            inputNumbersToArr();
        }
        catch (NumberFormatException erro){
            System.out.println("Erro: " + erro.getMessage());
        }
    }
    
    public static void inputNumbersToArr() throws IOException{
        String input;
        final int numNumbers = 10;
        float[] numbers = new float[numNumbers]; // arr A
        float xNumber;
        
        for (int i = 0; i < numNumbers; i++) {
            System.out.printf("%d.o valor: ", (i+1));
            data = new DataInputStream(System.in);
            numbers[i] = Float.parseFloat(input = data.readLine());
        }
        System.out.printf("Informe um ultimo Valor: ");
        data = new DataInputStream(System.in);
        xNumber = Float.parseFloat(input = data.readLine());
        
        System.out.println("--------------------------------");
        outputNumbers(multiplicador(numbers, xNumber, numNumbers), numbers, xNumber); //:|
    }
    public static float[] multiplicador(float[] numbers, float xNumber, int numNumbers){
        float[] prodNumbers = new float[numNumbers]; // arr M
        for (int i = 0; i < numNumbers; i++) {
            prodNumbers[i] = (numbers[i] * xNumber);
        }
        return prodNumbers;
    }
    public static void outputNumbers(float[] prodNumbers, float[] numbers, float xNumber){
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%3.2f x %3.2f = %3.2f\n", numbers[i], xNumber, prodNumbers[i]);
        }
    }
}
