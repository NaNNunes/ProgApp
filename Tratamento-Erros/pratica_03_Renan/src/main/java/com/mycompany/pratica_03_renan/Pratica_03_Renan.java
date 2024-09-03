/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pratica_03_renan;

/**
 *
 * @author r.nunes
 */
import java.util.Scanner;
public class Pratica_03_Renan {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int[] arr = {10,20,30,40,50};
       
       System.out.printf("Digite um index (0-4): ");
       int index = scanner.nextInt();

       try
       {
            System.out.printf("Valor do index: %d: %d\n", index, arr[index]);
       }
       catch (ArrayIndexOutOfBoundsException e)
       {
            System.out.println("Erro: Index fora do limite");
       }
        
       scanner.close();
    }
}
