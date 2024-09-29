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
            valSeparator(values, len);
        }
        else{
            System.out.println("Fim");
        }
    }
    
    public static int inputLength() throws IOException{
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
        DataInputStream data = null;
        String input;
        
        double[] aArray = new double[len];
        
        for (int i = 0; i < len; i++){
            while (true){
                try {
                    System.out.printf("%d.o valor: ", i+1);
                    data = new DataInputStream(System.in);
                    input = data.readLine();
                    aArray[i] = Double.parseDouble(input);
                    break;
                }
                catch (Exception erro){
                    System.out.println("--- Valor invalido ---");
                }
            }         
        }
        data.close();
        return aArray;
    }
    
    public static void valSeparator(double[] values, int len){
        double[] POS, NEG;
        int pCounter = 0, nCounter = 0;
        
        for (int i = 0; i < len; i++) {
            if (values[i]< 0){
                nCounter ++;
            }
            else{
                pCounter ++;
            }
        }
        
        POS = new double[pCounter];
        NEG = new double[nCounter];
        nCounter = 0;
        pCounter = 0;
        
        for (int i = 0; i < len; i++) {
            if (values[i] < 0){
                NEG[nCounter++] = values[i];
            }
            else{
                POS[pCounter++] = values[i];
            }
        }
        
        outputValues(NEG, POS, nCounter, pCounter);
    }
    
    public static void outputValues(double[] NEG, double[] POS, int nLen, int pLen){
        System.out.println("-----------------------------");
        System.out.println("Valores negativos: ");
        for (int i = 0; i < nLen; i++) {
            System.out.println(NEG[i]);
        }
        System.out.println("Quantidade de valores negativos: " + nLen);
        
        System.out.println("-----------------------------");
        
        System.out.println("Valores naturais: ");
        for (int i = 0; i < pLen; i++) {
            System.out.println(POS[i]);
        }
        System.out.println("Quantidade de valores naturais: " + pLen);
    }
}
