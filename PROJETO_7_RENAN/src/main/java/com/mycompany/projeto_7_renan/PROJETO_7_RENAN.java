/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_7_renan;

/**
 *
 * @author r.nunes
 */

import java.util.Scanner;
public class PROJETO_7_RENAN {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        float height, weight, imc;
        String classe;
        
        System.out.printf("Informe sua altura em metros: ");
        height = read.nextFloat();
        System.out.printf("Informe seu peso em quilogramas: ");
        weight = read.nextFloat();
        
        imc = weight / (height * height);
        
        if (imc < 18.5){
            classe = "Abaixo do normal";
        }else if (imc < 25){
            classe = "Normal";
        }else if (imc < 30){
            classe = "Sobrepeso";
        }else if (imc < 35){
            classe = "Obesidade I";
        }else if (imc < 40){
            classe = "Obesidade II";
        }else {
            classe = "Obesidade III";
        }
        
        System.out.printf("IMC: %.2f\nClasse: %s", imc, classe);
    }
}
