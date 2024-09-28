/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_15_renan; 

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author r.nunes
 */
public class PROJETO_15_RENAN {

    public static void main(String[] args) throws IOException {
        toFile(inputValues());
    }
    
    public static int[] inputValues(){
        DataInputStream data;
        final int len = 5;
        String input;
        int[] values = new int[len];
        
        System.out.printf("Insira 5 valores\n");
        for (int i = 0; i < len; i++){
            while (true){
                try {
                    System.out.printf("%d.o valor: ", i+1);
                    data = new DataInputStream(System.in);
                    values[i] = Integer.parseInt(input = data.readLine());
                    break;
                }
                catch (Exception erro){
                    System.out.println("Valor invalido");
                }
            } 
        }
        return values;
    }
    
    public static void toFile(int[] values) throws IOException{
        String path = ".\\";
        String fileName = "Tabuada de ";
        
        FileWriter file;
        PrintWriter record;
        
        for (int i = 0; i < values.length; i++) {
            file = new FileWriter(path + fileName + values[i]);
            record = new PrintWriter(file);
            for (int j = 1; j <= 10; j++){
                record.printf("\n %3d x %3d = %3d", values[i], j, (values[i] * j));
            }
            record.printf("\n---------------");
            record.close();
        }
    }
}
