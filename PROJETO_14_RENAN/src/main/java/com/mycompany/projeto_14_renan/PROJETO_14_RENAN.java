/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_14_renan;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *  
 * @author r.nunes
 */
public class PROJETO_14_RENAN {
    public static DataInputStream data;
    public static final int tam = 2;
    public static int[][] array = new int[tam][tam];
    public static String entrada;
    
    public static void main(String[] args) throws IOException{
        InputNum();
        OutputNum();
        sortArray();
    }
    // entrada de numeros
    public static void InputNum() throws IOException{
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.printf("Informe o %d.o valor da %d.a linha: ", j+1, i+1);
                data = new DataInputStream(System.in);
                entrada = data.readLine();
                array[j][i] = Integer.parseInt(entrada);
            }
        }
    }
    // Saida de valores de entrada
    public static void OutputNum(){
        for(int[] line : array){
            for (int num : line){
                System.out.printf("%d, ", num);
            }
            System.out.println("");
        }
    }
    
    public static void sortArray(){
        int[] vet = new int[tam * tam];
        int counter = 0;
        // transferindo valores
        for (int l = 0; l < tam; l++){
            for (int c = 0; c < tam; c++){
                vet[counter] = array[l][c];
                counter ++;
            }
        }
        // mostra array
        for (int i = 0; i < vet.length; i++) {
            System.out.printf("%d, ",vet[i]);
        }
        System.out.println("");
        
        //sorter
        for (int i = 0; i < vet.length; i++) {
            int org = i;
            int aux = vet[org];
            
            while (org > 0 && vet[org - 1] > aux){
                vet[org] = vet[org - 1];
                org --; 
            }
            
            vet[org] = aux;
        }
        // mostra array
        for (int i = 0; i < vet.length; i++) {
            System.out.printf("%d, ",vet[i]);
        }
    }
    
    //soma linha e coluna
    public static void(){
        
    }
}

