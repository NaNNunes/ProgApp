/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercico_13_renan;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *Faça um algoritmo para ler um valor N qualquer (que será o tamanho dos vetores).
    Após, ler dois vetores A e B (de tamanho N cada um) e depois armazenar em um terceiro vetor
    Soma a soma dos elementos do vetor A com os do vetor B (respeitando as mesmas posições) e
    escrever o vetor Soma
 * @author renan_8tvcd4n
 */
public class Exercico_13_Renan {
    public static DataInputStream data;
    public static String input;
    
    public static void main(String[] args) throws IOException {
        int len;
        try {
            System.out.printf("Informe o tamanho dos arrays: ");
            len = inputLenArr();
            somaArrs(inputNumArrA(len), inputNumArrB(len), len);
        }
        catch (NumberFormatException erro){
            System.out.println("Erro: " + erro.getMessage());
        }
    }
    public static int inputLenArr() throws IOException {
        data = new DataInputStream(System.in);
        return Integer.parseInt(input = data.readLine());
    }
    public static float[] inputNumArrA(int len) throws IOException {
        float[] arrA = new float[len];
        System.out.println("-------- Array A --------");
        for (int i = 0; i < len; i++){
            System.out.printf("%d.o valor de A: ", (i+1));
            data = new DataInputStream(System.in);
            arrA[i] = Float.parseFloat(input = data.readLine());
        }
        
        return arrA;
    }
    
    public static float[] inputNumArrB(int len) throws IOException{
        float[] arrB = new float[len];
        System.out.println("-------- Array B --------");
        for (int i = 0; i < len; i++){
            System.out.printf("%d.o valor de B: ", (i+1));
            data = new DataInputStream(System.in);
            arrB[i] = Float.parseFloat(input = data.readLine());
        }
        
        return arrB;
    }
    
    public static void somaArrs(float[] arrA, float[] arrB, int len){
        float[] arrSoma = new float[len];
        System.out.println("-------------------------");
        System.out.println("Soma dos volores do vetor: ");
        for (int i = 0; i < len; i++) {
            arrSoma[i] = (arrA[i] + arrB[i]);
            System.out.printf("%2.2f + %2.2f = %2.2f\n", arrA[i], arrB[i], arrSoma[i]);
        }
    }
}
