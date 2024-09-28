/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_09;

import java.io.DataInputStream;

/**
 * Refaça o exercício 8 armazenando cada um dos valores válidos (dentro do intervalo [Min, Max])
 * em um vetor de números inteiros.
 
 * Apresente na tela todos os valores contidos no vetor,
 * bem como o total e a quantidade correta de valores fornecidos.
 
 * Responda a seguinte questão: Qual problema pode ocorrer neste exercício,
 * referente ao preenchimento do vetor à medida que os valores de X são digitados?
 * 
 *  R:   Sobrescrição de valores.
 
 * @author renan_8tvcd4n
 */
public class Exercicio_09 {

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
        int x, totalVal = 0, counter = 0, validCounter = 0;;
        int[] Array = new int[((values[1] - values[0]) + 1)];
        
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
                            Array[validCounter++] = x;
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
        
        outputValuesInInterval(totalVal, counter, Array);
    }
    
    public static void outputValuesInInterval(int total, int numberValues, int[] values){
        System.out.println("Total de valores inseridos: " + total);
        System.out.println("Quantidade de valores inseridos: " + numberValues);
        System.out.println("Array de valores inseridos");
        for(int val : values){
            if (val != 0){
                System.out.printf("%d ", val);
            }
            else{
                break;
            }
        }
    }
}
