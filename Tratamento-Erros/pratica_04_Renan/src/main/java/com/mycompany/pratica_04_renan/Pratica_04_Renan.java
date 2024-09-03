/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pratica_04_renan;

/**
 *
 * @author r.nunes
 */

import java.util.Scanner;
public class Pratica_04_Renan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];
        int[] num = new int[2];
        int c = 0;
        
        for (int i = 0; i < arr.length; i++){
            System.out.printf("Informe o %d.o num: ", i+1);
            arr[i] = scanner.nextInt();
            
            try
            {
                num[i]
                System.out.println(num[0]);
            }
            catch (ArithmeticException e){
                System.out.println("Erro: divisão por 0");
            }
            catch (NumberFormatException e){
                System.out.println("Erro: Erro de tipo");
            }
            
            c++;
        }
        

    }
}
