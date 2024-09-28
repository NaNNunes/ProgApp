/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_05;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author renan_8tvcd4n
 */
class ToFile{
    private FileWriter file;
    private PrintWriter record;
    
    private final String path = ".\\";
    private final String type = ".txt";
    
    public void setRecorder(String nome, double peso, String categoria) throws IOException{
        this.file = new FileWriter(path + nome + type);
        this.record = new PrintWriter(file);
        
        this.record.println("Nome fornecido: " + nome);
        this.record.println("Peso fornecido: " + peso);
        this.record.println("O lutador "+ nome +" pesa " + peso +" kg e se enquadra na categoria " + categoria +".");
        this.record.close();
    }
}
