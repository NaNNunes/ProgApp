/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_15_renan;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *Faça um algoritmo para ler um vetor de 20 números. 
  Após isto, deverá ser lido mais um número qualquer e verificar se esse número existe no vetor ou não.
  Se existir, o algoritmo deve gerar um novo vetor sem esse número.
  (Considere que não haverão números repetidos no vetor)
 * @author renan_8tvcd4n
 */
public class Exercicio_15_Renan {
    public static DataInputStream data;
    public static void main(String[] args) throws IOException{
        inputNum();
    }
    public static void inputNum() throws IOException{
        String input;
        final int qtdNum = 10;
        float[] ArrNum = new float[qtdNum];
        float lastNum = 0;
        
        for (int i = 0; i < qtdNum; i++) {
            System.out.printf("%d.o valor: ", (i+1));
            data = new DataInputStream(System.in);
            ArrNum[i] = Float.parseFloat(input = data.readLine());
        }
        System.out.printf("Informe um ultimo numero: ");
        data = new DataInputStream(System.in);
        lastNum = Float.parseFloat(input = data.readLine());
        repeatNumCheck(ArrNum, lastNum);
    }
    public static void repeatNumCheck(float[] arrNumbers, float lastNum){
        float aux;
        int index;
        
        for (int i = 0; i < arrNumbers.length; i++) {
            if (arrNumbers[i] == lastNum){
                System.out.println("-----------------------\nValor encontrado");
                aux = arrNumbers[i];
                for (index = i ; index < (arrNumbers.length - 1); index++){
                    arrNumbers[index] = arrNumbers[(index +1)];
                }
                arrNumbers[(arrNumbers.length - 1)] = aux;
                System.out.println("Valor removido do indice: " + i);
                transferVal(arrNumbers);
                break;
            }
        }
    }
    public static void transferVal(float[] oldArr){
        float[] newArr = new float[(oldArr.length-1)];
        System.out.println("--------------------------------");
         for (int i = 0; i < newArr.length; i++) {
             newArr[i] = oldArr[i];
             System.out.printf("%f ", newArr[i]);
        }
    }
}
