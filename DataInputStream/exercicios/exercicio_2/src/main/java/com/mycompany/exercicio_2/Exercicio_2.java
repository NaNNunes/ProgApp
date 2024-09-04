/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_2;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;

/**
 *  Desenvolva um programa que solicite ao usuario que insira 10 numeros inteiros
 *  O programa deve armazena-los em array e calcular a soma de todos os impares no array
 *  Exibir ao final.
 * @author r.nunes
 */
public class Exercicio_2 {

    public static void main(String[] args) throws IOException {
        final int qtdNum = 10;
        int[] arr = new int[qtdNum + 1];
        String entrada = "";
        DataInputStream data;
        
        try {
            for (int i = 0; i < qtdNum ; i++){
                System.out.printf("Entre o %d.o valor: ", i+1);
                data = new DataInputStream(System.in);
                entrada = data.readLine();
                arr[i] = Integer.parseInt(entrada);
                
                if (arr[i] % 2 != 0){
                    arr[qtdNum] += arr[i];
                }
            }
        }
        catch (NumberFormatException erro){
            System.out.println("Erro: valor não tratavel: " + erro.getMessage());
        }
        
        System.out.println(arr[qtdNum]);
    }
}
