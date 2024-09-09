/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_6_renan;

/**
 *
 * @author renan_8tvcd4n
 */
public class Exercicio_6_Renan {

    public static void main(String[] args) {
        int[] vet = {5, 1, 4, 2, 7, 8, 3, 6};
        int aux;
        
        for (int i = (vet.length-1); i >= 5; i--) {
            aux = vet[i];
            vet[i] = vet[8 - i + 1];
            vet[8 - i + 1] = aux;
            System.out.println(vet[i]);
        }
        vet[3] = vet[1];
        vet[vet[3]] = vet[vet[2]];
        System.out.println("\n");
        for (int i : vet) {
            System.out.println(i);
        }
        
    }
}
