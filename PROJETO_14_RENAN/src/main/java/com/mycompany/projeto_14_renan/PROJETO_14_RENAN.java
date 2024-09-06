/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_14_renan;

import java.util.Random;
import java.io.DataInputStream;
import java.io.IOException;

/**
 *  Escreva um programa que leia uma matriz 5x5 de números inteiros inseridos pelo usuário.
 *  O programa deve realizar as seguintes operações:

    Exibir a matriz original inserida pelo usuário. v
    Ordenar a matriz de forma crescente, como se fosse um vetor único, e exibir a matriz ordenada. v
    Calcular a soma de cada linha e cada coluna da matriz, e exibir essas somas. v
    Encontrar os números que aparecem mais de uma vez na matriz e exibir quais são e quantas vezes eles aparecem. 
    Calcular a soma da diagonal principal e da diagonal secundária da matriz.
    Substituir todos os números primos da matriz por -1 e exibir a nova matriz
 * @author r.nunes
 */
public class PROJETO_14_RENAN {
    public static DataInputStream data;
    public static int entrada;
    
    public static final int tam = 5;
    public static int[][] array = new int[tam][tam];
    public static int[] vet = new int[tam * tam];
    
    public static Random random = new Random();
    public static final int lim = 11;
    
    public static void main(String[] args) throws IOException{
        InputNum();
        System.out.println("Matriz de valores: ");
        OutputNum();
        sortArray();
        System.out.println("Matriz organizada: ");
        OutputNum();
        somador();
        System.out.println("\n");
        EncontraRepetidos();
    }
    // entrada de numeros
    public static void InputNum() throws IOException{
        for (int l = 0; l < tam; l++) {
            for (int c = 0; c < tam; c++) {
                System.out.printf("Informe o %d.o valor da %d.a linha: ", c+1, l+1);
                data = new DataInputStream(System.in);
                entrada = random.nextInt(lim);
                array[l][c] = entrada;//Integer.parseInt(entrada);
            }
        }
    }
    // Saida de valores de entrada
    public static void OutputNum(){
        for(int[] line : array){
            for (int num : line){
                System.out.printf("%2d, ", num);
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public static void sortArray(){
        
        int counter = 0;
        // transferindo valores
        for (int l = 0; l < tam; l++){
            for (int c = 0; c < tam; c++){
                vet[counter] = array[l][c];
                counter ++;
            }
        }
        
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
        
        // passando vet para array
        counter = 0;
        for (int l = 0; l < tam; l++) {
            for (int c = 0; c < tam; c++) {
                array[l][c] = vet[counter];
                counter ++;
            }
        }
    }
    
    //soma linha e coluna
    public static void somador(){
        int[] somaLine = new int[tam];
        int[] somaCol = new int[tam];
        int counter;
        
        //soma coluna
        counter = 0;
        for (int l = 0; l < tam; l++) {
            for (int c = 0; c < tam; c++) {
                somaCol[counter] += array[c][l];
            }
            if (counter < tam){
                counter ++;
            }
        }
        //soma linha
        counter = 0;
        for (int l = 0; l < tam; l++) {
            for (int c = 0; c < tam; c++) {
                somaLine[counter] += array[l][c];
            }
            if (counter < tam){
                counter ++;
            }
        }
        
        System.out.println("Soma de cada coluna: ");
        for (int i = 0; i < tam; i++){
            System.out.printf("%d, ", somaCol[i]);
        }
        System.out.println("");
        System.out.println("Soma de cada linha: ");
        for (int i = 0; i < tam; i++){
            System.out.printf("%d, ", somaLine[i]);
        }
    }
    
    public static void EncontraRepetidos(){
        int[] vetAux = vet;
        int ref = vetAux[0];
        int index;
        
        for (int i = 0; i < vetAux.length; i++){
            index = i;
            
            if ((index < (vetAux.length -1)) && (vetAux[i] == vetAux[index + 1])){
                if (vetAux[i] != ref){
                    ref = vetAux[i];
                    System.out.println(ref);
                }
            }
        }
    }
}

