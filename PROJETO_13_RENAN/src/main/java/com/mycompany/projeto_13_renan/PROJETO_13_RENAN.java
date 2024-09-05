/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_13_renan;

/**
 *Escreva um programa que realiza diferentes operações matemáticas em elementos de um vetor de números inteiros.
 O programa deve solicitar ao usuário que insira os elementos do vetor, 
 o tipo de operação desejada (adição, subtração, multiplicação, divisão) e 
 os índices dos elementos a serem operados. O programa deve utilizar blocos try-catch para capturar erros como divisão por zero, 
 índices inválidos e entradas inválidas.

   Instruções:
    1.O programa deve permitir ao usuário definir o tamanho do vetor e preencher os valores.
    2.O programa deve solicitar ao usuário que escolha uma operação matemática (adição, subtração, multiplicação, divisão).
    3.O programa deve exibir os resultados presentes no vetor antes de realizar as operações, incluindo os respectivos índices.
    4.O programa deve pedir dois índices do vetor para realizar a operação nos elementos correspondentes.
    5.Use try-catch para:
        Capturar tentativas de divisão por zero.
        Capturar exceções de índices fora dos limites do vetor.
        Capturar entradas inválidas (como strings quando se espera um número).
    6.Exiba o resultado da operação ou uma mensagem de erro apropriada.
    7.O programa deve armazenar os resultados em um segundo vetor chamado “resultados”.
 * @author r.nunes
 */

import java.util.Scanner;
public class PROJETO_13_RENAN {
    public static Scanner scanner = new Scanner(System.in);
    public static int[] Array = new int[0];
    public static int[] resultados;
    public static void main(String[] args) {
        inputLen();
    }
    // entrada de tamanho
    public static void inputLen(){
        String strLen;
        int len;
        //int[] array = new int[0];
        System.out.printf("Informe o tamanho do vetor: ");
        strLen = scanner.nextLine();
        
        try {
            len = Integer.parseInt(strLen);
            Array = new int[len];
            System.out.println("------------------------------");
            inputValues();
        }
        catch (NumberFormatException erro){
            System.out.println("Erro: " + erro.getMessage());
        }
        
    }
    
    // entrada de valores ao array
    public static void inputValues(){
        String strValue;
        
        try {
            for (int i = 0; i < Array.length; i++) {
                System.out.printf("Insira o %d.o valor: ", i+1);
                strValue = scanner.nextLine();
                Array[i] = Integer.parseInt(strValue);
            }
            resultados = new int[Array.length / 2];
            termsSelection();
        }
        catch (NumberFormatException erro){
            System.out.println("Erro: " + erro.getMessage());
        }
    }
    
    // saida de valores do array
    public static void outputValues(int[] array){
        for (int i = 0; i < array.length; i++){
            if (i < (array.length - 1)){
                System.out.printf("%d = %d, ", i, (array[i]));
            }
            else {
                System.out.printf("%d = %d\n", i, (array[i]));
            }
        }
    }
    
    //selecinar termos
    public static void termsSelection(){
        String strTermos;
        final int qtdNum = 2;
        int[] termos = new int[qtdNum];
        
        try{
            for (int c = 0; c < resultados.length; c++){
                for (int i = 0; i < qtdNum; i++) {
                    System.out.println("------------------------------");
                    System.out.printf("Informe um valor de acordo com indice (0 - %d):\n", (Array.length - 1));
                    outputValues(Array);
                    System.out.printf("-> ");
                    strTermos = scanner.nextLine();

                    int indexValue = Integer.parseInt(strTermos);
                    System.out.println("Valor selecionado: " + Array[indexValue]);
                    termos[i] = Array[indexValue];
                }
                resultados[c] = operators(termos);
            }
            System.out.println("------------------------------");
            outputValues(resultados);
        }
        catch (NumberFormatException erro){
            System.out.println("Erro: " + erro.getMessage());
        }
        catch (IndexOutOfBoundsException erro){
            System.out.println("Erro: " + erro.getMessage());
        }
    }
    
    // difinir operação
    public static int operators(int[] termos){
        String strOp;
        int operator;
        int resultado = 0; 

        try {
            do{
                System.out.println("------------------------------");
                System.out.println("Selecione um operador:");
                System.out.printf("[1]Somar\n[2]Subtrair\n[3]Multiplicar\n[4]Dividir\n -> ");
                strOp = scanner.nextLine();
                operator = Integer.parseInt(strOp);
                switch (operator) {
                    case 1 -> resultado = termos[0] + termos[1];
                    case 2 -> resultado = termos[0] - termos[1];
                    case 3 -> resultado = termos[0] * termos[1];
                    case 4 -> resultado = termos[0] / termos[1];
                    default -> System.out.println("Erro: Valor invalido");
                }
            } while(operator > 4 || operator < 1);
        }
        catch (NumberFormatException erro){
            System.out.println("Erro: " + erro.getMessage());
        }
        catch (ArithmeticException erro){
            System.out.println("Erro: Dividir por 0");
        }
        
        return resultado;
    }
}
