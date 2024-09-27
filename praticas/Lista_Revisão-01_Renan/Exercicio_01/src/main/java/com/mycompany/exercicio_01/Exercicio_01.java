/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_01;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * Escreva um programa que leia dois números inteiros e apresente na tela sua soma, 
 * no seguinte formato: Soma de 5 com 7 = 12
 * @author r.nunes
 */
public class Exercicio_01 {

    public static void main(String[] args) throws IOException {
        DataInputStream data;
        String input;
        final int qtdNum = 2;
        int[] nums = new int[qtdNum];
        
        System.out.println("Informe ");
        for (int i = 0; i < qtdNum; i++) {
            while (true){
                try {
                    System.out.printf("%d.o valor: ", i+1);
                    data = new DataInputStream(System.in);
                    nums[i] = Integer.parseInt(input = data.readLine());
                    break;
                }
                catch (Exception erro){
                    System.out.println("Invalido");
                }
            }
        }
        
        System.out.printf("Soma de %2d com %2d = %2d", nums[0], nums[1], (nums[0] + nums[1]));
    }
}
