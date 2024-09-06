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

    Exibir a matriz original inserida pelo usuário. (feito)
    Ordenar a matriz de forma crescente, como se fosse um vetor único, e exibir a matriz ordenada. (feito)
    Calcular a soma de cada linha e cada coluna da matriz, e exibir essas somas. (feito)
    Encontrar os números que aparecem mais de uma vez na matriz e exibir quais são e quantas vezes eles aparecem. (feito)
    Calcular a soma da diagonal principal e da diagonal secundária da matriz. (feito)
    Substituir todos os números primos da matriz por -1 e exibir a nova matriz
 * @author r.nunes
 */
public class PROJETO_14_RENAN {
    public static DataInputStream data;
    public static String entrada;
    
    public static final int tam = 5;
    public static int[][] array = new int[tam][tam];
    public static int[] vet = new int[tam * tam];
    
    public static Random random = new Random();
    public static final int lim = 101;
    
    public static void main(String[] args) throws IOException{
        try {
            InputNum();
            System.out.println("\nMatriz de valores: ");
            OutputNum();
            sortArray();
            System.out.println("Matriz organizada: ");
            OutputNum();
            somador();
            System.out.println("\n\nValores que repetem e vezes que ocorrem:");
            EncontraRepetidos();
            System.out.println("");
            CalculaDiagonais();
            System.out.println("\n\nvalores primos substituidos por [-1]: ");
            NumerosPrimos();
        }
        catch (NumberFormatException erro){
            System.out.println("Erro: " + erro.getMessage());
        }
    }
    //  entrada de numeros
    public static void InputNum() throws IOException{
        for (int l = 0; l < tam; l++) {
            for (int c = 0; c < tam; c++) {
                System.out.printf("Informe o %d.o valor da %d.a linha: ", c+1, l+1);
                data = new DataInputStream(System.in);
                entrada = data.readLine();
                array[l][c] = Integer.parseInt(entrada);
            }
            System.out.println("");
        }
    }
    //  Saida de valores de entrada
    public static void OutputNum(){
        for(int[] line : array){
            for (int num : line){
                System.out.printf("%3d ", num);
            }
            System.out.println("");
        }
        System.out.println("");
    }
    //  orgazidor
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
    //  soma linha e coluna
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
    //  ENCONTRA VALORES REPETIDOS NO ARRAY
    public static void EncontraRepetidos(){
        int[] vetAux = vet;
        int ref = vetAux[0]; // referencia base inical sendo o primeiro valor
        int index = 0;
        int contaRepet = 0;
        boolean temZero = false;
        
        // MEU FEITO DA SEMANA... ainda sinto que to fazendo errado.
        // laço de maior escopo
        for (int i = 0; i < vetAux.length; i++){
            index = i;      // indice auxiliar
            contaRepet = 0; // contador de num repetidos
            
            // verifica se o valor atual é igual ao próximo valor
            if ((index < (vetAux.length -1)) && (vetAux[i] == vetAux[index + 1])){
                // verifica se o valor atual é diferente da referencia
                    // Ou se valor atual for igual a valor inicial(0) sendo ele nao registrado
                if (vetAux[i] != ref || (vetAux[i] == vetAux[0] && temZero == false)){
                    // laço para contagem de repetiçoes
                    for (int c = 0; c < vetAux.length; c++){
                        // conta repetições verificando se o valor atual se repetir
                        if(vetAux[c] == vetAux[i]){
                            contaRepet ++;
                        }
                    }
                    // verifica se referencia não mudou
                    if (ref == vetAux[0]){
                        temZero = true;
                    }
                    // nova referencia
                    ref = vetAux[i];
                    System.out.printf("%d --- %dx\n", ref, contaRepet);
                }
            }
        }
    }
    //  calculo de diagonais
    public static void CalculaDiagonais() {
        int SomaDiagPrincipal = 0;
        int somaDiagSecundaria = 0;
        
        System.out.println("Diagonal Principal:");
        for (int l = 0; l < tam; l++){
            for (int c = 0; c < tam; c++) {
                if (l == c){
                    System.out.printf("%3d ",array[l][c]);
                    SomaDiagPrincipal += array[l][c];
                }
            }
        }
        System.out.printf("\nSoma Diagonal Principal: %d", SomaDiagPrincipal);
        
        System.out.println("\n");
        System.out.println("Diagonal Secundaria:");
        for (int i = 0; i < vet.length; i++){
           if(i % 4 == 0 && i > 0 && i < (vet.length -1)){
               System.out.printf("%3d ", vet[i]);
               somaDiagSecundaria += vet[i];
           }
        }
        System.out.printf("\nSoma Diagonal Secundaria: %d", somaDiagSecundaria);
    }
    //  numeros primos substituidos por -1
    public static void NumerosPrimos() {
        int contaDivisores;
        // escopo
        for (int i = 0; i < vet.length; i++) {
            contaDivisores = 0;
            
            // laco com todos numeros menores que o valor atual
            for (int j = 1; j <= vet[i]; j++) {
                // verifica quantos numeros dividem o valor atual
                if (vet[i] % j == 0){
                    contaDivisores ++;
                }
            }
            if (vet[i] > 1 && contaDivisores <= 2){ // numeros primos(no máximo 2 divisores), naturais e maiores que 1
                System.out.printf("%3d ", (-1)); 
            }
            else {                                  // numeros compostos e não naturais
                System.out.printf("%3d ",vet[i]);
            }
            
            if ((i+1) % tam == 0){                  // simulador de matriz
                System.out.println("");
            }
        }
    }
}

