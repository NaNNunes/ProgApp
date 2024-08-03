/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project_6.renan;

/**
 *
 * @author r.nunes
 */

// ENTRADA DE NOTAS, RETORNO DE MEDIA

import java.util.Scanner;
public class PROJECT_6RENAN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe a 1.a nota:");
        float notaUm = ler.nextFloat();
        
        System.out.print("Informa a 2.a nota:");
        float notaDois = ler.nextFloat();
        
        float media = (notaUm + notaDois) / 2;
        System.out.println("Media: " + media);
    }
}
