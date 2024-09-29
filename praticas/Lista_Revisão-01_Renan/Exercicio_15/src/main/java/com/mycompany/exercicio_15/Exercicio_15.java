/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_15;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Date;

/**
 * Determine qual é a idade que o usuário faz no ano atual,
 * para isso solicite o ano de nascimento do usuário e o ano atual.
 * @author renan_8tvcd4n
 */
public class Exercicio_15 {
    public static DataInputStream data;
    public static String input;
    
    public static void main(String[] args) throws IOException {
        int year;
        int birth;
        
        year = inputDate();
        System.out.println("--------------------------------------------");
        birth = yearBirth(year);
        data.close();
        System.out.println("--------------------------------------------");
        System.out.printf("Esse ano voce faz %d anos", calculAge(year, birth));
    }
    
    public static int inputDate(){
        Date date = new Date();
        int year = date.getYear() + 1900;
        int inputYear = 0;
        
        while (true){
            try {
                do {
                    System.out.println("Informe o ano em que estamos: ");
                    data = new DataInputStream(System.in);
                    inputYear = Integer.parseInt(input = data.readLine());

                    if (inputYear != year){
                        System.out.println("--- Ano inserido incompativel com ano atual --- ");    
                    }
                } while (inputYear != year);
                
                break;
            }
            catch (Exception e) {
                System.out.println("--- Entrada invalida ---");
            }
        }
        
        return inputYear;
    }
    
    public static int yearBirth(int currentYear){
        int year;
        
        while(true){
            try {
                do {
                    System.out.println("Informe seu ano de nascimento: ");
                    data = new DataInputStream(System.in);
                    year =  Integer.parseInt(input = data.readLine());
                    
                    if (year > currentYear ){ 
                        System.out.println("--- Nao inventaram  a maquina do tempo, ainda ---");
                    }
                } while (year > currentYear);
                
                break;
            } 
            catch (Exception e) {
                System.out.println("--- Entrada invalido ---");
            }
        }
        
        return year;
    }

    public static int calculAge(int currentYear, int yearBirth){
        return currentYear - yearBirth;
    }
}
