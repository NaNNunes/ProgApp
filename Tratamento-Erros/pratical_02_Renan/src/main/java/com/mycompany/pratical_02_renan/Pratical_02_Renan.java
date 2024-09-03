/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pratical_02_renan;

/**
 *
 * @author r.nunes
 */
import java.util.Scanner;
public class Pratical_02_Renan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerador, divisor;
        
        System.out.printf("Informe o numerador: ");
        numerador = scanner.nextInt();
        
        System.out.printf("Informe o divisor: ");
        divisor = scanner.nextInt();
        
        try 
        {
            int result = numerador / divisor;
            System.out.printf("Resultado: %d\n", result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Erro: divisão por 0");
        }
        scanner.close();
    }
}
