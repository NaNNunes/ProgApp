/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_12_renan;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *Faça um algoritmo para ler 20 números e armazenar em um vetor. 
 * Após a leitura total dos 20 números,
 * o algoritmo deve escrever esses 20 números lidos na ordem inversa.
 * @author renan_8tvcd4n
 */
public class Exercicio_12_Renan {
    public static DataInputStream data;
    public static void main(String[] args) throws IOException{
        float [] numbers;
        try {
            numbers = inputNumbers();
            System.out.println("----------------------\nValores na ordem inversa: ");
            outputNumbers(numbers);
        }
        catch (NumberFormatException erro){
            System.out.println("Erro: " + erro.getMessage());
        }
    }
    public static float[] inputNumbers() throws IOException{
        String input;
        final int qtdNumbers = 20;
        float[] numbers = new float[qtdNumbers];
        
        for (int i = 0; i < qtdNumbers; i++){
            System.out.printf("%d.o valor: ", (i+1));
            data = new DataInputStream(System.in);
            numbers[i] = Float.parseFloat(input = data.readLine());
        }
        return numbers;
    }
    
    public static void outputNumbers(float[] numbers){
        for (int i = (numbers.length - 1); i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
