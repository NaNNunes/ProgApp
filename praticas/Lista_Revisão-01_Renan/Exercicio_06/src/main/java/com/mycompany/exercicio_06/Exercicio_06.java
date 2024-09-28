/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_06;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * Escreva um programa que permaneça em laço
 * dentro do qual será efetuada a leitura de um número inteiro X.
 * O laço termina quando for digitado o valor 0 (zero) para X.
 * 
 * Para cada valor X lido, o programa deve informar na tela se o mesmo é positivo ou negativo
 * @author renan_8tvcd4n
 */
public class Exercicio_06 {

    public static void main(String[] args) throws IOException {
        inputvalues();
        System.out.println("Fim");
    }
    
    public static void inputvalues() throws IOException{
        DataInputStream data;
        String input;
        int value;
        
        do {
            while (true){
                try {
                    System.out.println("Informe um numero: ");
                    
                    data = new DataInputStream(System.in);
                    value = Integer.parseInt(input = data.readLine());
                    
                    
                    if (value > 0){
                        System.out.println(value + " pertence aos numeros positivo!");
                    }
                    else if (value < 0){
                        System.out.println(value + " pertence aos numeros negativo!");
                    }
                    break;
                }
                catch (Exception erro){
                    System.out.println("--- Valor invalido ---");
                }
            }
        } while (value != 0);
        data.close();
    }
}
