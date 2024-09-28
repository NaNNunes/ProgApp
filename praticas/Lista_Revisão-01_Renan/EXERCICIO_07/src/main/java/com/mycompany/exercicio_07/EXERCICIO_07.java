/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_07;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * Elaborar um programa que efetue a leitura de valores positivos inteiros 
 * até que zero ou um valor negativo seja informado. 
 * 
 * Ao final devem ser apresentados: 
 * o maior e menor valores informados pelo usuário,
 * a quantidade de valores, a soma e a média de todos.
 * 
 * @author renan_8tvcd4n
 */
public class EXERCICIO_07 {
    
    public static void main(String[] args) throws IOException {
        inputValues();
    }
    
    public static void inputValues() throws IOException{
        DataInputStream data;
        String input;
        int value, bigValue = 1, smallValue = 0, sumVal = 0, counter = 0;
        int avgVal;
        
        do{
            while (true){
                try {
                    System.out.println("Informe valores positivos: ");
                    data = new DataInputStream(System.in);
                    value = Integer.parseInt(input = data.readLine());
                    if (value > 0){

                        sumVal += value;
                        counter ++;
                        
                        if (value > bigValue){
                            bigValue = value;
                        }
                        
                        if (smallValue == 0){
                            smallValue = value;
                        }
                        else{
                           if (value < smallValue){
                               smallValue = value;
                           }
                        }
                        
                    }
                    break;
                }
                catch (Exception erro){
                    System.out.println("--- Dado de entrada nao valido ---");
                }
            }
            
        } while (value > 0);
        
        avgVal = sumVal / counter;
        data.close();
        outputVal(smallValue, bigValue, sumVal, avgVal);
    }
    
    public static void outputVal(int small, int big, int sum, int avg){
        System.out.printf("Menor valor: %d\nMaior valor: %d\nSoma de valores: %d\nMedia de Valores: %d",
                small, big, sum, avg);
    }
}
