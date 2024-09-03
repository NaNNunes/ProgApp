/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pratica_01_renan;

import java.sql.SQLOutput;

/**
 *
 * @author r.nunes
 */
public class Pratica_01_RENAN {

    public static void main(String[] args) {
        String inte = "23.6";
        String floa = "3e";
        try
        {
            int valueInt = Integer.parseInt(inte);
            System.out.printf("Valor inteiro %d\n", valueInt);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Erro ao converter: "+ e.getMessage());
        }
        
        try {
            float valueFloat = Float.parseFloat(floa);
            System.out.printf("Valor flutuante: %.2f\n", valueFloat);
        }
        catch (NumberFormatException e){
            System.out.println("Erro ao converter: " + e.getMessage());
        }
    }
}
