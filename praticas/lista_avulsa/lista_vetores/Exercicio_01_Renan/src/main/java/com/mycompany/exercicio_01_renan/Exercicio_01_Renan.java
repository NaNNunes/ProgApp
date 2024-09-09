/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_01_renan;

/**
 *Escreva um algoritmo que armazene em um vetor todos os números inteiros de 0 a 50.
    Após isso, o algoritmo deve imprimir todos os valores armazenados.
 * @author renan_8tvcd4n
 */

import java.io.DataInputStream;
import java.io.IOException;


public class Exercicio_01_Renan {
    public static DataInputStream data;
    public static String input;
    public static final int largNum = 51;
    public static float[] arrIntNumbers = new float[largNum];
    public static int cIntNum = 0;
    public static int cNum = 0;
    
    public static void main(String[] args) throws IOException {
        try {
            laco();
            System.out.println("Valores inteiros: ");
            outputNum();
        }
        catch(NumberFormatException erro){
            System.out.println("Erro: " + erro.getMessage());    
        }
        
    }
    
    public static void laco() throws IOException{
        int limLaco = 10;
        boolean toContinue = true;
        do{
            inputNum();
            if (cNum > limLaco){
                System.out.println("Deseja continuar? [true] or [false]");
                data = new DataInputStream(System.in);
                input = data.readLine();
                toContinue = Boolean.parseBoolean(input);
                if (toContinue){
                    limLaco += 5;
                }   
            }
        }while (toContinue);
    }
    
    public static void inputNum() throws IOException{
        int intInput;
        float fInput;

        System.out.printf("Informe o %d.o valor: ", (++cNum));
        data = new DataInputStream(System.in);
        input = data.readLine();
        fInput = Float.parseFloat(input);
        intInput = (int) fInput;
        
        if (fInput >= 0 && fInput < largNum){
            if (fInput - intInput == 0){
                arrIntNumbers[cIntNum] = fInput;
                cIntNum ++;
            }
        }
    }
    
    public static void outputNum(){
        for (int i = 0; i < cIntNum; i++) {
            System.out.println(arrIntNumbers[i]);
        }
    }
}
