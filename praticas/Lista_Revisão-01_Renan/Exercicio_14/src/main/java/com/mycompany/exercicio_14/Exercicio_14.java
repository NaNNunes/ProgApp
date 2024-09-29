/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicio_14;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * Escreva um programa que leia o nome e salário atual de um funcionário. O
 * programa deve calcular seu novo salário (segundo a tabela abaixo) e mostrar o
 * nome, o salário atual e o salário reajustado do funcionário:
 *
 * Faixa salarial | Acréscimo 
 * acima de | até |____________
 * --       | 150 | 25%
 * 150      | 300 | 20%
 * 300      | 600 | 15%
 * 600      | --  | 10%
 *
 * • Repita o processo acima até que seja digitado FIM no lugar do nome do funcionário;
 * • Mostrar ao final do programa a soma dos salários atuais,
 *      a soma dos salários reajustados e a diferença entre eles.
 *
 * @author renan_8tvcd4n
 */
public class Exercicio_14 {
    public static DataInputStream data;
    public static String input;
    
    public static void main(String[] args) throws IOException {
        Funcionario funcionario = new Funcionario();
        
        String name;
        double salary;
        double newSalary;
        double sumSalary = 0;
        double sumNewSalary = 0;
        boolean toContinue;
        
        do{
            toContinue = true;
            
            name = inputName();
            if (name.equals("fim")){
                toContinue = false;
                break;
            }
            else {
                funcionario.setNome(name);
                System.out.println("----------------");
                funcionario.setSalario(inputSalary());
                sumSalary += funcionario.getSalario();
                System.out.println("----------------");
                funcionario.setNovoSalario(funcionario.getSalario());
                sumNewSalary += funcionario.getNovoSalario();
            }
        } while (toContinue);
        
        if (!toContinue){
            System.out.println("----------------");
            outputValues(sumSalary, sumNewSalary);
            System.out.println("--- Obrigado ---");
        }
        else {
            System.out.println("--- Obrigado ---");
        }
        
        data.close();
    }

    public static String inputName() throws IOException {

        while (true) {
            try {
                System.out.println("Nome do funcionario: [FIM] - Parar");
                data = new DataInputStream(System.in);
                input = data.readLine();
                
                break;
            } catch (Exception erro) {
                System.out.println("--- valor invalido ---");
            }
        }

        return input.toLowerCase();
    }

    public static double inputSalary() throws IOException {
        double salary = 0;

        while (true) {
            try {
                System.out.println("Salario atual: R$ ");
                data = new DataInputStream(System.in);
                salary = Double.parseDouble(input = data.readLine());
                break;
            }
            catch (Exception erro) {
                System.out.println("--- valor invalido ---");
            }
        }
        return salary;
    }
    
    public static void outputValues(double sumSalary, double sumNewSalary){
        System.out.println("Soma dos salarios: R$" + sumSalary);
        System.out.println("Soma dos salarios reajustados: R$ " + sumNewSalary);
        System.out.println("Difereca entre eles: R$" + (sumNewSalary - sumSalary));       
    }
}
