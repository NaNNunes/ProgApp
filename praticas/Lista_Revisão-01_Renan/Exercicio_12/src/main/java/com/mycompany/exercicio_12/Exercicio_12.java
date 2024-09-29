/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicio_12;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Random;

/**
 * Escreva um programa que leia um número N (entre 0 e 50) e em seguida defina
 * um vetor V preenchendo-o com N números inteiros aleatórios (pesquise como
 * fazer isso em Java). Exiba-o na tela.
 *
 * Inicie um laço no qual será feita a leitura de um número X. Pesquise se X
 * está ou não no vetor V e caso esteja elimine todas as ocorrências do mesmo e
 * reexiba o vetor na tela.
 *
 * @author renan_8tvcd4n
 */
public class Exercicio_12 {

    public static DataInputStream data;
    public static String input;

    public static void main(String[] args) throws IOException {
        int len;
        int value;
        int[] array;

        len = inputLen();
        if (len > 0) {
            array = toArray(len);
            System.out.println("-----------------");
            do {
                outputArray(array);
                System.out.println("-----------------");
                value = inputValue();
                System.out.println("-----------------");
                findValue(value, array);
                System.out.println("-----------------");
            } while (toContinue());
        } else {
            System.out.println("--- Obrigado ---");
        }
        data.close();
    }

    public static int inputLen() {
        final int[] interval = {0, 50};
        int value;
        do {
            while (true) {
                try {
                    System.out.printf("Informe um valor entre %d e %d: ", interval[0], interval[1]);
                    data = new DataInputStream(System.in);
                    value = Integer.parseInt(input = data.readLine());
                    if (!(value >= 0 && value <= interval[1])) {
                        System.out.printf("--- Valor fora do intervalo (%d, %d) ---\n", interval[0], interval[1]);
                    }
                    break;
                } catch (Exception erro) {
                    System.out.println("--- Valor invalido ---");
                }
            }
        } while (value < interval[0] || value > interval[1]);
        return value;
    }

    public static int[] toArray(int len) {
        Random random = new Random();
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = random.nextInt((len * 2) + 1);
        }
        return array;
    }
    
    public static void outputArray(int[] array){
        System.out.println("Valores sorteados: ");
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static int inputValue() {
        int value;

        while (true) {
            try {
                System.out.printf("Informe um valor: ");
                data = new DataInputStream(System.in);
                value = Integer.parseInt(input = data.readLine());
                break;
            } catch (Exception erro) {
                System.out.println("--- Valor invalido ---");
            }
        }

        return value;
    }

    public static void findValue(int value, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != value) {
                System.out.println(array[i]);
            }
        }
    }

    public static boolean toContinue() {
        boolean toContinue = false;
        boolean isValid;

        while (true) {
            try {
                do {
                    isValid = true;
                    
                    System.out.println("Deseja continuar?\n[s/sim]-Continuar\n[n/nao]-Parar");
                    data = new DataInputStream(System.in);
                    input = data.readLine();
                    
                    switch (input.toLowerCase()) {
                        case "s", "sim" ->
                            toContinue = true;
                        case "n", "nao" ->
                            toContinue = false;
                        default -> {
                            System.out.println("--- Entrada invalida ---");
                            isValid = false;
                        }
                    }
                }
                while (!isValid);
                break;
            } catch (Exception erro) {
                System.out.println("--- Valor invalido ---");
            }
        }

        return toContinue;
    }
}
