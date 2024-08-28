/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project_12_renan;

/**
 *
 * @author r.nunes
 */
import java.util.Scanner;
public class PROJECT_12_RENAN {
    public static Scanner read = new Scanner(System.in);
    public static String[] player = new String[2];
    public static String nomeFilme;
    public static final int num_Dicas = 5;
    
    
    public static void main(String[] args) {
        
        start();
        
    }
    public static void start(){
        if (playerTwo(playerOne())){
            System.out.printf("Vencedor: %s", player[1]);
        }
        else {
            System.out.printf("Vencedor: %s", player[0]);
        }
    }
    
    // first player
    public static String[] playerOne(){
        String[] dicas = new String[num_Dicas];
        
        System.out.printf("Nome do 1.o jogdor: ");
        player[0] = read.nextLine();
        System.out.printf("Informe o nome do filme: ");
        nomeFilme = read.nextLine().toLowerCase();
        
        for (int i = 0; i < num_Dicas; i++){
            System.out.printf("Informa a %d.a dica: ", i+1);
            dicas[i] = read.nextLine();
        }
        
        for (int i = 0; i < 50; i++){
            System.out.println(" ");
        }
        
        return dicas;
    }
    
    // second player
    public static boolean playerTwo(String[] dicas){
        String guess = "";
        int i = 1;
        
        System.out.printf("Nome do 2.o jogador: ");
        player[1] = read.nextLine();
        
        while (guess.equals(nomeFilme) || i <= num_Dicas ){
            System.out.printf("%d.a dica: %s\n", i, dicas[i-1]);
            System.out.printf("%d.a tentativa: ", i);
            guess = read.nextLine().toLowerCase();
            
            if (!guess.equals(nomeFilme)){
                i++;
            }
            else{
                break;
            }
        }
        
        return (i <= num_Dicas) ? true : false;
    }
}
