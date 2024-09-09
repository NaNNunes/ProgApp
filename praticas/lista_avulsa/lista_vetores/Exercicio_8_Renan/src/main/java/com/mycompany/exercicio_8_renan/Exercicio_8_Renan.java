/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_8_renan;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *Escreva um algoritmo que permita a leitura das notas de uma turma de 20 alunos.
    Calcular a média da turma e contar quantos alunos obtiveram nota acima desta média
    calculada. Escrever a média da turma e o resultado da contagem.
 * @author renan_8tvcd4n
 */
public class Exercicio_8_Renan {
    public static DataInputStream data;
    public static String input;
    public static final int numGrade = 20;
    
    
    public static void main(String[] args) throws IOException {
        try{
            inputNum();
        }
        catch (NumberFormatException erro){
            System.out.println("Erro: " + erro.getMessage());
        }
        catch (IndexOutOfBoundsException erro){
            System.out.println("Erro: " + erro.getMessage());
        }
    }
    public static void inputNum() throws IOException{
        float[] grades = new float[(numGrade+1)];
        float avarage;
        final float maxGrade = 10;
        for (int i = 0; i < numGrade; i++) {
            do{
                System.out.printf("nota do %2d.o aluno: ", (i+1));
                data = new DataInputStream(System.in);
                grades[i] = Float.parseFloat(input = data.readLine());
                if (grades[i] <= maxGrade){
                    grades[numGrade] += grades[i];
                }
                else{
                    System.out.println("Nota acima da nota max");
                }
            } while (grades[i] > maxGrade);
        }
        avarage = avrgCalc(grades[numGrade]);
        outputValues(avarage, aboveAvrg(avarage, grades));
    }
    
    public static float avrgCalc(float sumGrades){
        return sumGrades / numGrade;
    }
    
    public static int aboveAvrg(float avarage, float[] grades){
        int cAboveAvarege = 0;
        for (int i = 0; i < numGrade; i++) {
            if(grades[i] > avarage){
                cAboveAvarege++;
            }
        }
        return cAboveAvarege;
    }
    
    public static void outputValues(float avarage, int aboveAvarage){
        System.out.println("\n---------------------------------");
        System.out.printf("Media da turma: %.2f\n", avarage);
        System.out.printf("Alunos acima da media: %d", aboveAvarage);
    }
}
