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
    public static void main(String[] args) {
        
        IoIndexAndValues();
    }
    
    // entrada e saida de limites e valores iniciais
    public static void IoIndexAndValues(){
        int[] num_Arr;
        int Arr_Len;
        String leng;
        
        System.out.printf("Defina o limite do Vetor: ");
        leng = scanner.nextLine();
        
        try {
            AssignValues(num_Arr = new int[Arr_Len  = Integer.parseInt(leng)]);
        }
        catch (NumberFormatException e){
            System.out.println("Erro: String ou caractere numerico invalido: "+ e.getMessage());
        }
    }
    
    // Atribunido Valores
    public static void AssignValues(int[] Array){
            try {
                for (int i = 0; i < Array.length; i++){
                    System.out.printf("Insira o %d.o valor: ", i+1);
                    String strValue = scanner.nextLine();
                    int value = Integer.parseInt(strValue);
                    Array[i] = value;
                }
                TermsSelection(Array);
            }
            catch (NumberFormatException e){
                System.out.println("Erro: Esperado valor Inteiro: " + e.getMessage());
            }
    }
    
    // output de valores do array
    public static void OutputValues(int[] Array){
        for (int i = 0; i < Array.length; i++){
            System.out.printf("%d --- %d\n", i, Array[i]);
        }
    }
    
    // Selecao de termos para operação
    public static void TermsSelection(int[] Array){
        final int AmountNum = 2;
        String[] StrNumber = new String[AmountNum];
        int[] termos = new int[AmountNum];
        
        try {
            for (int i = 0; i < AmountNum; i++){
                System.out.printf("Selecione um valor pelo Indice: (0 - %d)\n", (Array.length - 1));
                OutputValues(Array);
                StrNumber[i] = scanner.nextLine();
                termos[i] = Integer.parseInt(StrNumber[i]);
                if (true) {
                    System.out.println("Valor selecionado: " + Array[termos[i]])
                }
            }
        }
        catch (NumberFormatException erro){
            System.out.println("Erro: Esparado Valor inteiro: " + erro.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException erro){
            System.out.println("Erro: Indice fora do intervalo: " + erro.getMessage());
        }
    }
    
    public static void Operators(int[] number, int resultado){
        String StrOperator;
        System.out.println("Selecione um operador: \n[1]Somar +\n[2]Subtrair -\n[3]Dividir :\n[4]Multiplicar x\n -> ");
        StrOperator = scanner.nextLine();
        
        try {
            int operator;
            do {
                operator = Integer.parseInt(StrOperator);
                switch (operator) {
                    case 1:
                        resultado = (number[0] + number[1]);
                        break;
                    case 2:
                        resultado = (number[0] - number[1]);
                        break;
                    case 3:
                        resultado = (number[0] / number[1]);
                        break;
                    case 4:
                        resultado = (number[0] * number[1]);
                        break;
                    default:
                        System.out.println("Valor inválido.\nFavor inserir operador disponivel.");
                }
            } while (operator > 4 || operator < 1);
        }
        catch (NumberFormatException erro){
            switch (StrOperator) {
                case "+":
                    resultado = (number[0] + number[1]);
                    break;
                case "-":
                    resultado = (number[0] - number[1]);
                    break;
                case ":":
                    resultado = (number[0] / number[1]);
                    break;
                case "/":
                    resultado = (number[0] / number[1]);
                    break;
                case "*":
                    resultado = (number[0] * number[1]);
                    break;
                case "x":
                    resultado = (number[0] * number[1]);
                    break;
                default:
                    System.out.println("Erro: caractere de operador inválido: " + erro.getMessage());
            }
        }
    }
    
}
