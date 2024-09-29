/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_11;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * Escreva um programa que leia um número N (entre 0 e 50)
 * e em seguida defina um vetor V preenchendo-o com N números inteiros aleatórios
 * (pesquise como fazer isso em Java). Exiba-o na tela.
 * 
 * Inicie um laço no qual será feita a leitura de um número X.
 * Pesquise se X está ou não no vetor V e caso esteja informe a posição de cada ocorrência.
 * 
 * @author renan_8tvcd4n
 */

import java.util.Random;

public class Exercicio_11 {
    public static DataInputStream data;
    public static String input;
    
    public static void main(String[] args) throws IOException {
        int len = inputLen();
        if (len != 0){
            System.out.println("----------------");
            int[] array = array = toArray(len);
            do{
                System.out.println("----------------");
                int value = inputValue();
                System.out.println("----------------");
                findValue(value, array);
            } while(toContinue());
            System.out.println("--- Obrigado ---");
        }
        else {
            System.out.println("--- Obrigado ---");
        }
        data.close();
    }
    
    public static int inputLen(){
        int value;
        final int[] interval = {0, 50};
        
        while (true){
            try{
                System.out.printf("Defina um valor entre %d e %d: ", interval[0], interval[1]);
                data = new DataInputStream(System.in);
                value = Integer.parseInt(input = data.readLine());
                if (value >= interval[0] && value <= interval[1]){
                    break;
                }
                else{
                    System.out.printf("Valor fora do intervalo de [%d, %d]\n", interval[0], interval[1]);
                }
            }
            catch (Exception erro){
                System.out.println("--- Valor invalido --- ");
            }
        }
        return value; 
    }
    
    public static int[] toArray(int len){
        // para definir o vetor com tamanho de len e preencher com random
        Random random = new Random();
        int[] array = new int[len];
        
        for (int i = 0; i < len; i++) {
            array[i] = random.nextInt((len * 5) + 1);
        }
        outputArray(array);
        return array;
    }
    
    public static void outputArray(int[] array){
        int index, aux;
        System.out.println("Valores sorteados: ");
        for (int i : array) {
            System.out.println(i);
        }
    }
    
    public static int inputValue(){
        int value;
        
        while (true){
            try{
                System.out.printf("Informe um valor: ");
                data = new DataInputStream(System.in);
                value = Integer.parseInt(input = data.readLine());
                break;
            }
            catch (Exception erro){
                System.out.println("--- Valor invalido ---");
            }
        }
        
        return value;
    }
    
    public static void findValue(int value, int[] array){
        boolean isRepeat = false;
        
        for (int i = 0; i < array.length; i++){
            if(value == array[i]){
                System.out.printf("O valor %d foi encontrado na posicao %d\n", value, i+1);
                isRepeat = true;
            }
        }
        if (!isRepeat){
            System.out.printf("O valor %d nao foi encontrado na lista de valores\n", value);
        }
    }
    
    public static boolean toContinue(){
        
        boolean toContinue = false;
        boolean isValid;
        
        while (true){
            try {
                do{
                    isValid = true;
                    System.out.println("----------------");
                    System.out.println("Deseja continuar: \n[Sim] s/sim\n[nao] n/nao");
                    data = new DataInputStream(System.in);
                    input = data.readLine();
                    input = input.toLowerCase();

                    switch (input) {
                        case "s", "sim" -> toContinue = true;
                        case "n", "nao" -> toContinue = false;
                        default -> {
                            System.out.println("--- Entrada invalida ---");
                            isValid = false;
                        }
                    }
                } while(!isValid);
                break;
            }
            catch (Exception erro){
                System.out.println("--- Entrada invalida ---");
            }
        }
        
        return toContinue;
    }
}
