/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_7_renan;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *Escreva um algoritmo que permita a leitura dos nomes de 10 pessoas e armaze os
    nomes lidos em um vetor. Após isto, o algoritmo deve permitir a leitura de mais 1 nome
    qualquer de pessoa e depois escrever a mensagem ACHEI, se o nome estiver entre os 10
    nomes lidos anteriormente (guardados no vetor), ou NÃO ACHEI caso contrário.
 * @author renan_8tvcd4n
 */
public class Exercicio_7_Renan {
    public static DataInputStream data;
    public static String input;
    public static final int numNames = 11;
    public static String[] names = new String[numNames];
            
    public static void main(String[] args) throws IOException{
        try {
            inputNames();
        }
        catch(NullPointerException erro){
            System.out.println("Erro: " + erro.getLocalizedMessage());
        }
    }    
    public static void inputNames() throws IOException{
        int cNomes = 0;
        for (int i = 0; i < numNames; i++) {
            if (i < (numNames - 1)){
                System.out.printf("%d.o nome: ", (i+1));
                data = new DataInputStream(System.in);
                input = data.readLine();
                if (validaNome(input)){
                    names[i] = input;
                }
            }
            else{
                System.out.printf("informe um nome: ");
                data = new DataInputStream(System.in);
                input = data.readLine();
                procuraNome(names[(numNames-1)] = input);
            }
        }
    }
    public static boolean validaNome(String nome){
        boolean isValid = false;
        
        for (int i = 0; i < nome.length(); i++) {
            switch (nome.toLowerCase().charAt(i)){
                case 'a' -> isValid = true;
                case 'b' -> isValid = true;
                case 'c' -> isValid = true;
                case 'd' -> isValid = true;
                case 'e' -> isValid = true;
                case 'f' -> isValid = true;
                case 'g' -> isValid = true;
                case 'h' -> isValid = true;
                case 'i' -> isValid = true;
                case 'j' -> isValid = true;
                case 'k' -> isValid = true;
                case 'l' -> isValid = true;
                case 'm' -> isValid = true;
                case 'n' -> isValid = true;
                case 'o' -> isValid = true;
                case 'p' -> isValid = true;
                case 'q' -> isValid = true;
                case 'r' -> isValid = true;
                case 's' -> isValid = true;
                case 't' -> isValid = true;
                case 'u' -> isValid = true;
                case 'v' -> isValid = true;
                case 'w' -> isValid = true;
                case 'x' -> isValid = true;
                case 'y' -> isValid = true;
                case 'z' -> isValid = true;
                default -> isValid = false;
            }
        }
        return isValid;
    }
    
    public static void procuraNome(String nome){
        boolean isFind = false;
        for (int i = 0; i < (numNames -1); i++ ) {
            if(nome.toLowerCase().equals(names[i].toLowerCase())){
                isFind = true;
                break;
            }
        }
        System.out.println((isFind) ? "ACHEI" : "NAO ACHEI");
    }
}
