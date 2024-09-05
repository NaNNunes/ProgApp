/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_1;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *  Crie um programa que leia 5 numeros inteiros digitados pelo usuario,
 *  armazene em um vetor e exiba apenas os numeros pares desse vetor
 * @author r.nunes
 */
public class Exercicio_1 {

    public static void main(String[] args) throws IOException {
        final int qtdNum = 5;
        int[] arr = new int[qtdNum];
        String entrada;
        DataInputStream dado;
        
        try {
            for (int i = 0; i < qtdNum; i++){
                System.out.printf("Informe o %d.o numero: ", i+1);
                dado = new DataInputStream(System.in);
                entrada = dado.readLine();

                arr[i] = Integer.parseInt(entrada);
            }
        }
        catch (NumberFormatException erro){
                System.out.println("Erro: valor invalido: " + erro.getMessage());
        }
        
        System.out.println("Numeros pares do vetor:");
        for (int num : arr){
            if (num % 2 == 0){
                System.out.println(num);
            }
        }
    }
}
