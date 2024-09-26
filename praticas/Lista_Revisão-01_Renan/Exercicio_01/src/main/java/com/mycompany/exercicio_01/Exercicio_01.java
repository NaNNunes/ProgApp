/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_01;

import java.awt.BorderLayout;
import java.io.DataInput;
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
        final int qtdNum = 3;
        double[] nums = new double[qtdNum];
        
        System.out.println("Informe ");
        for (int i = 0; i < (qtdNum - 1); i++) {
            while (true){
                try {
                    System.out.printf("%d.o valor: ", i+1);
                    data = new DataInputStream(System.in);
                    nums[i] = Double.parseDouble(input = data.readLine());
                    nums[2] += nums[i];
                    break;
                }
                catch (Exception erro){
                    System.out.println("Invalido");
                }
            }
        }
        
        System.out.printf("Soma de %2f com %2f = %2f", nums[0], nums[1], nums[2]);
    }
}
