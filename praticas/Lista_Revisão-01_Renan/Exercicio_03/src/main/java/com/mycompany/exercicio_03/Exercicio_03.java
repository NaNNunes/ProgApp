/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_03;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * Escreva um programa que leia dois números inteiros e apresente na tela 
 * sua soma apenas se ambos tiverem o mesmo sinal (positivo ou negativo). 
 * Use o mesmo formato do exercício anterior e, 
 * caso os números fornecidos tenham sinais trocados 
 * o programa deve escrever na tela que os "Dados de Entrada são Inválidos".
 * @author renan_8tvcd4n
 */
public class Exercicio_03 {

    public static void main(String[] args) throws IOException {
        System.out.println("Informe 2 valores");
        sumNumbers(inputValues());
    }
    
    public static int[] inputValues() throws IOException{
        DataInputStream data = null;
        String input;
        final int qtdNum = 2;
        int[] numbers = new int[qtdNum];
        boolean isValid;
        
        do {
            for (int i = 0; i < qtdNum; i++){
                while (true){
                    try{
                        System.out.printf("%d.o valor: ", i+1);
                        data = new DataInputStream(System.in);
                        numbers[i] = Integer.parseInt(input = data.readLine());
                        break;
                    }
                    catch ( Exception erro ){
                        System.out.println("Valor invalido"); 
                    }
                }
            }
            isValid = checkNumbers(numbers);
        } while (!isValid);
        data.close();
        return numbers;
    }
    
    public static boolean checkNumbers(int[] numbers){
        boolean[] isValid = new boolean[numbers.length];
        
        for (int i = 0; i < numbers.length; i++){
            isValid[i] = numbers[i] >= 0;
            if (!isValid[i]){
                System.out.println("Dados de Entrada Invalidos");
            }
        }
        return isValid[0] == isValid[1];
    }
    
    public static void sumNumbers(int[] numbers){
        System.out.printf("%2d + %2d = %2d", numbers[0], numbers[1], (numbers[0] + numbers[1]));
    }
}
