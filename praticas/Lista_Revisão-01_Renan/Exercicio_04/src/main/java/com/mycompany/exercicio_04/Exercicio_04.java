/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_04;

import java.io.DataInputStream;

/**
 * Escreva um programa que leia três números reais 
 * e informe se eles constituem os lados de um triângulo.
 * 
 * Em caso afirmativo, informe se o triângulo é equilátero, isósceles ou escaleno. 
 * 
 * Para que três números formem um triângulo deve ocorrer que 
 * a soma dos dois lados menores deve ser maior que o lado maior.
 * 
 * Para resolver essa questão verifique como funcionam os operadores lógicos and e or
 * @author renan_8tvcd4n
 */
public class Exercicio_04 {

    public static void main(String[] args) {
        System.out.println("Informe 3 valores");
        toTriangle(inputValues());
    }
    
    public static double[] inputValues(){
        DataInputStream data;
        String input;
        final int qtdNum = 3;
        double[] numbers = new double[qtdNum];
        boolean isValid;
        
        do {
            for (int i = 0; i < qtdNum; i++){
                while (true){
                    try{
                        System.out.printf("%d.o valor: ", i+1);
                        data = new DataInputStream(System.in);
                        numbers[i] = Double.parseDouble(input = data.readLine());
                        break;
                    }
                    catch ( Exception erro ){
                        System.out.println("Valor invalido"); 
                    }
                }
            }
            isValid = checkNumbers(numbers);
        } while (!isValid);
        return numbers;
    }
    
    public static boolean checkNumbers(double[] numbers){
        boolean[] isValid = new boolean[numbers.length];
        
        for (int i = 0; i < numbers.length; i++){
            isValid[i] = numbers[i] > 0;
            if (!isValid[i]){
                System.out.println("Dados de Entrada Invalidos");
            }
        }
        return isValid[0] == isValid[1] == isValid[2];
    }

    public static void toTriangle(double[] values){
        boolean isTriangle = false;
        String triagleName = "";
        
        if ( values[0] + values[1] > values[2] || 
             values[0] + values[2] > values[1] || 
             values[1] + values[2] > values[0] ){
            if (values[0] == values[1]  && values[0] == values[2]){
                isTriangle = true;
                triagleName = "Equilatero";
            }
            else if (values[0] == values[1] || values[0] == values[2] || values[1] == values[2]){
                isTriangle = true;
                triagleName = "Isoceles";
            }
            else {
                isTriangle = true;
                triagleName = "Escaleno";
            }
        }
        else{
            System.out.println("Os valores de entrada não formam um triangulo");
        }
        
        if (isTriangle){
            System.out.println("Os valores de entrada forma um triangulo " + triagleName);
        }
    }
}
