/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_10;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * Escreva um programa que leia um número N (entre 0 e 50) e em seguida leia N números reais em um vetor A.
 * 
 * O programa dever separar os valores lidos em A em outros dois vetores NEG e POS,
 * o primeiro contendo somente os valores negativos e o segundo contendo os valores positivos e zero.
 * 
 * Apresentar na tela os vetores NEG e POS e a quantidade de valores contidos em cada um.
 * @author renan_8tvcd4n
 */
public class Exercicio_10 {

    public static void main(String[] args) throws IOException {
        int len;
        double[] values;
                
        len = inputLength();
        if (len > 0){
            values = inputValues(len);
        }
        else{
            System.out.println("Fim");
        }
    }
    
    public static int inputLength(){
        final int min = 0;
        final int max = 50;
        
        DataInputStream data;
        String input;
        
        int value;
        boolean isValid = false;
        
        do{
            while (true){
                try{
                    System.out.printf("Inforne um valor entre %d e %d: ", min, max);
                    data = new DataInputStream(System.in);
                    value = Integer.parseInt(input = data.readLine());
                    
                    if (value <= 50 && value >= 0){
                        isValid = true;
                    }
                    else {
                        System.out.printf("Informe um valor dentro do intervalo [%d, %d]\n", min, max);
                    }
                    break;
                }
                catch (Exception erro){
                    System.out.println("--- Valor invalido ---");
                }
            }
        } while (!isValid);
        
       return value;
    }

    public static double[] inputValues(int len) throws IOException{
        DataInputStream data;
        String input;
        
        double[] aArray = new double[len];
        
        for (int i = 0; i < len; i++){
            while (true){
                try {
                    System.out.printf("%d.o valor: ", i+1);
                    data = new DataInputStream(System.in);
                    aArray[i] = Double.parseDouble(input = data.readLine());
                    break;
                }
                catch (Exception erro){
                    System.out.println("--- Valor invalido ---");
                }
            }         
        }
        
        return aArray;
    }
    

}
