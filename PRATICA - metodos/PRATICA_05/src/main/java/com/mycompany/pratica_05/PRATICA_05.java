/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pratica_05;

/**
 *
 * @author r.nunes
 */
import java.util.Scanner;
public class PRATICA_05 {

    public static void main(String[] args) {
        mostrarNomes(inputNomes());
    }
    public static String[] inputNomes(){
        Scanner read = new Scanner(System.in);
        final int qtd_pessoas = 2;
        String[] nomes = new String[qtd_pessoas];
        
        for (int i = 0; i < qtd_pessoas; i++){
            System.out.printf("Informe o nome da %d pessoa: ", i+1);
            nomes[i] = read.nextLine();
        }
        
        
        return nomes;
    }
    
    public static void mostrarNomes(String[] nomes){
        for(String nome : nomes){ // tipo de for usado em sistemas de lvl 1 e 2.
            System.out.printf("Oi %s!\n", nome);
        }
    }
}
