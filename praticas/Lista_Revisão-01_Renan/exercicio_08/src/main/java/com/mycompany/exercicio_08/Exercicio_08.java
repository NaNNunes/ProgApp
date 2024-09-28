/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_08;

import java.io.DataInputStream;

/**
 * Escreva um programa que leia dois números inteiros denominados Min e Max.
 * 
 * Em seguida, inicie um laço dentro do qual será efetuada a leitura
 * de um número inteiro X.
 * O laço termina quando for digitado o valor 0 zero) para X.
 * 
 * Dentro do laço o programa deve contar e totalizar todos os valores de X que
 * estejam no intervalo fechado [Min, Max].
 * 
 * Se algum valor fora do intervalo for digitado para X,
 * o programa deve dar a mensagem "Valor fora do intervalo [Min, Max]
 * ignorado na totalização".
 * 
 * Após sair do laço, deve apresentar o total e
 * a quantidade correta de valores fornecidos.
 * 
 * Cuidado com a possibilidade do usuário digitar o valor Min maior que o valor Max.
 * Se isso acontecer o programa deve avisar a situação e invertê-los. 
 * @author renan_8tvcd4n
 */
public class Exercicio_08 {

    public static void main(String[] args) {
        inputValuesToInterval(inputMinMaxValues());
    }
    
    public static int[] inputMinMaxValues(){
        DataInputStream data;
        String input;
        int[] values = new int[2];
        String valueName;
        
        System.out.println("Informe 2 valores");
        for (int i = 0; i < 2; i++){
            while (true){
                try {
                    valueName = (i == 0) ? "Min" : "Max";
                    System.out.printf("informe o valor %s: ", valueName);
                    data = new DataInputStream(System.in);
                    values[i] = Integer.parseInt(input = data.readLine());
                    
                    if (values[i] == 0){
                        System.out.println("Valor invalido");
                        i--;
                    }
                    
                    break;
                }
                catch (Exception erro){
                    System.out.println("--- Valor invalido ---");
                }
            }
        }
        
        if (values[0] > values[1]){
            System.out.println("Alternando posicao entre valores Min e Max");
            int aux = values[0];
            values[0] = values[1];
            values[1] = aux;
        }
        
        return values;
    }
    
    public static void inputValuesToInterval(int[] values){
        DataInputStream data;
        String input;
        int x, totalVal = 0, counter = 0;
        
        System.out.println("-----------------------");
        do {
            while (true){
                try {
                    System.out.printf("Informe um valor: ");
                    data = new DataInputStream(System.in);
                    x = Integer.parseInt(input = data.readLine());
                    
                    if (x != 0){
                        counter ++;
                        if (values[1] >= x && x >= values[0]){
                            totalVal += x; 
                        }
                        else{
                            System.out.printf("Valor fora do intervalo [%d, %d] ignorado na totalizacao.\n", values[0], values[1]);
                        }
                    }
                    else {
                        System.out.println("----- Fim -----");
                    }
                    
                    break;
                }
                catch (Exception erro){
                    System.out.println("--- Valor invalido ---");
                }
            }
        } while (x != 0);
        
        outputValuesInInterval(totalVal, counter);
    }
    
    public static void outputValuesInInterval(int total, int numberValues){
        System.out.println("Total de valores inseridos: " + total);
        System.out.println("Quantidade de valores inseridos: " + numberValues);
    }
}
