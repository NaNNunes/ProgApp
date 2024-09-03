/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_1_renan;

/**
 *
 * @author r.nunes
 */
import java.util.Scanner;
public class Exercicio_1_renan {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] numbers = new int[2];
        
        for (int num : numbers){
            System.out.printf("Enter a number: ");
            num = read.nextInt();
        }
    }
}
