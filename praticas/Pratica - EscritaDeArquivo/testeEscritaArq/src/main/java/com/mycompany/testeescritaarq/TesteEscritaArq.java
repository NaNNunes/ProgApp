/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testeescritaarq;import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author r.nunes
 */

public class TesteEscritaArq {

    public static void main(String[] args) throws IOException {
        DataInputStream data;
        String path = "P:\\TURMAS\\HTC-DDS-19\\Renan\\MODULO-2\\Prog-APP\\praticas\\Pratica - EscritaDeArquivo\\";
        String input, fileName;
        int value;
        
        System.out.printf("Informe o nome do arquivo: ");
        data = new DataInputStream(System.in);
        input = data.readLine();
        fileName = input;
        
        System.out.printf("Informe um valor: ");
        data = new DataInputStream(System.in);
        value = Integer.parseInt(input = data.readLine());
        
        FileWriter file = new FileWriter(path  + fileName + ".txt");
        PrintWriter gravar = new PrintWriter(file);
        
        for (int i = 1; i <= 10; i++) {
            gravar.printf("\n%2d x %2d = %2d", value, i, (i * value));
        } 
        
        gravar.printf("\n------------------");
        file.close();
    }
}
