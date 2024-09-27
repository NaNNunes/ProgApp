/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_05;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author renan_8tvcd4n
 */
public class ToValues {
    private DataInputStream data;
    private String input;
    
    public String openDataInput() throws IOException{
        data = new DataInputStream(System.in);
        return input = data.readLine();
    }
    
    public double checkVal()throws IOException{
        double valor;
        
        while (true){
            try{
                valor = Double.parseDouble(openDataInput());
                break;
            }
            catch (Exception erro){
                System.out.println("--- Erro ---");
                System.out.printf("Informe um valor valido: ");
            }
        }
        
        return valor;
    }
    
    public String categ(double peso){
        String categ;
        
        if (peso < 65){
            categ = "Pena";
        }
        else if (peso < 72){
            categ = "Leve";
        }
        else if (peso < 79){
            categ = "Ligeiro";
        }
        else if (peso < 86){
            categ = "Meio medio";
        }
        else if (peso < 93){
            categ = "Medio";
        }
        else if (peso < 100){
            categ = "Meio pesado";
        }
        else {
            categ = "Pesado";
        }
        
        return categ;
    }
}
