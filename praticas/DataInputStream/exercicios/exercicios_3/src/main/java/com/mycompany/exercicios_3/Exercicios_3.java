/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios_3;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *  Escrevaum programa que leia 7 numeros inteiros do usuario e armazene-os em array
 *  Calcular e exibir a media dos numeros multiplos de 3.
 * @author r.nunes
 */
public class Exercicios_3 {

    public static void main(String[] args) throws IOException {
        DataInputStream data;
        final int qtdNum = 7;
        int[] Array = new int[qtdNum + 1];
        int contaNum = 0;
        float media;
        String entrada;
        
        try{
            for (int i = 0; i < qtdNum; i++) {
                System.out.printf("Informe o %d.o valor: ", i+1);
                data = new DataInputStream(System.in);
                entrada = data.readLine();
                Array[i] = Integer.parseInt(entrada);

                if (Array[i] % 3 == 0){
                    System.out.printf("%d adicionado\n", Array[i]);
                    Array[qtdNum] += Array[i];
                    contaNum ++;
                }    
            }
        }
        catch (NumberFormatException erro){
            System.out.println("Erro: " + erro.getMessage());
        }
        
        media = Array[qtdNum] / contaNum;
        
        System.out.println("Media de valores impares: " + media);
                
    }
}
