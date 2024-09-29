/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_02;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * Escreva um programa que leia dois números inteiros e 
 * apresente na tela sua soma apenas se ambos forem positivos. 
 * Use o mesmo formato do exercício anterior e, 
 * caso algum dos números fornecidos seja negativo 
 * o programa deve escrever na tela que os "Dados de Entrada são Inválidos".
 * @author r.nunes
 */
public class Exercicio_02 {
    
    public static void main(String[] args) throws IOException {
        System.out.println("Informe 2 valores");
        sumValues(inputValues());   
    }
    
    public static int[] inputValues() throws IOException {
        DataInputStream data = null;
        String input;
        final int qtdNum = 2;
        int[] numbers = new int[qtdNum];
        boolean isValid;
        
        do{
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
            isValid = checkNums(numbers);
            
        }while(!isValid);
        data.close();
        return numbers;
    }
    
    public static boolean checkNums(int[] numbers){
        boolean isValid = true;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0){
                System.out.println("Dados de Entrada sao Invalidos");
                isValid = false;
                break;
            }
        }
        return isValid;
    }
    
    public static void sumValues(int[] numbers){
        System.out.printf("%2d com %2d = %d", numbers[0], numbers[1], (numbers[0] + numbers[1]));
    }
}
