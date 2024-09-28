/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_16_renan;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author renan_8tvcd4n
 */
public class Exercicio_16_Renan {
    public static DataInputStream data;
    public static void main(String[] args) throws IOException{
        final int len = 15;
        final int numArr = 2;
        float[][] arrayVet = new float[numArr][len];
        
        for (int i = 0; i < numArr; i++) {
            arrayVet[i] = inputArr(numArr, 'a');
        }
        
    }
    public static float[] inputArr(int lenArr, char arrName) throws IOException{
        String input;
        float[] arr = new float[lenArr];
        
        for (int i = 0; i < lenArr; i++) {
            System.out.printf("%d.o valor do array %c: ", (i+1), arrName);
            data = new DataInputStream(System.in);
            arr[i] = Float.parseFloat(input = data.readLine());
        }
        
        return arr;
    }
}
