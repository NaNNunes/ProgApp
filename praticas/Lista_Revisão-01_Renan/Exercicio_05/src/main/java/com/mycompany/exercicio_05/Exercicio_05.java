/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_05;


import java.io.IOException;

/**
 * Escreva um programa que leia o nome de um lutador e seu peso. 
 * Em seguida informe a categoria a que pertence o lutador,
 * conforme a tabela ao lado(note que a tabela foi criada para efeito deste exercício e não condiz com qualquer categoria de luta).
 * 
 * A saída do programa deve exibir em um TEXT uma frase no seguinte padrão:
 *  Nome fornecido: Pepe Jordão
 *  Peso fornecido: 73.4
 * 
 * Saída exibida no TXT:
 *  O lutador Pepe Jordão pesa 73.4 kg e se enquadra na categoria Ligeiro
 * 
 * @author renan_8tvcd4n
 * C:\Users\renan_8tvcd4n\OneDrive\Documentos\Estudos\ProgApp\praticas\Lista_Revisão-01_Renan
 */
public class Exercicio_05 {
    
    public static void main(String[] args) throws IOException{
        Lutador lutador = new Lutador();
        ToValues input = new ToValues();   
        ToFile file = new ToFile();
        
        System.out.printf("Nome: ");
        lutador.setNome(input.openDataInput());
        
        System.out.printf("Peso: ");
        lutador.setPeso(input.checkVal());

        lutador.setCategoria(input.categ(lutador.getPeso()));
        System.out.println("Categoria: " + lutador.getCategoria());
        
        file.setRecorder(lutador.getNome(), lutador.getPeso(), lutador.getCategoria());
    }
}
