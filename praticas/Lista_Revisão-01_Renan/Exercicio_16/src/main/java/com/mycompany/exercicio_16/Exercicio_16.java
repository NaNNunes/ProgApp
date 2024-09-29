/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_16;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * Uma empresa precisa realizar uma estatística do salário de seus funcionários.
 * 
 * Para isto precisa de um programa que leia uma lista
 * contendo os salários dos funcionários da empresa,
 * e imprima quantos funcionários ganham salário acima da média.
 * 
 * Sabe-se que a empresa possui 50 funcionários.
 * 
 * • Considerando que não há um número fixo de 50 funcionários.
 * o programa pergunta no início quantos 
 * funcionários possui a empresa e reliza o restante do processo.

 * @author renan_8tvcd4n
 */
public class Exercicio_16 {
    public static DataInputStream data;
    public static String input;
    
    public static void main(String[] args) throws IOException {
        int numberEmployee;
        double[] salaryEmployee;
        double avgWages;
        
        numberEmployee = inputNumberEmployees();
        
        if (numberEmployee <= 0){
            System.out.println("--- Obrigado ---");
        }
        else {
            System.out.println("----------------------");
            salaryEmployee = inputSalary(numberEmployee);
            avgWages = sumWages(salaryEmployee, numberEmployee);
            System.out.println("----------------------");
            outputAbvAvg(avgWages, salaryEmployee);
            
        }
    }
    
    public static int inputNumberEmployees(){
        final int numberEmployees = 50;
        int value;
        while (true){
            try {
                do {
                    System.out.printf("Quantidade de funcionarios: ");
                    data = new DataInputStream(System.in);
                    value = Integer.parseInt(input = data.readLine());
                    if (value > numberEmployees){
                        System.out.printf("A empresa possui apenas %d funcionarios\n",
                        numberEmployees);
                    }
                } while (value > numberEmployees);
                break;
            } catch (Exception e) {
                System.out.println("--- Valor invalido ---");
            }
        }
        return value;
    }
    
    public static double[] inputSalary(int numEmployee) throws IOException{
        double[] employeeSalary = new double[numEmployee];
        
        for (int i = 0; i < numEmployee; i++) {
            while (true){
                try{
                    do {
                        System.out.printf("Salario do %d.o funcionario: ",(i+1));
                        data = new DataInputStream(System.in);
                        employeeSalary[i] = Double.parseDouble(input = data.readLine());
                        if (employeeSalary[i] < 0){
                            System.out.println("--- Valor invalido ---");
                        }
                    } while (employeeSalary[i] < 0);
                    break;
                }
                catch (Exception erro){
                    System.out.println("--- Valor ivalido ---");
                }
            }
        }
        
        return employeeSalary;
    }

    public static double sumWages(double[] wages, int numberEmployee){
        double sumWages = 0;
        
        for (double wage : wages) {
            sumWages += wage;
        }
        
        return sumWages / numberEmployee;
    }
    
    public static void outputAbvAvg(double avgWage, double[] wagesEmployee){
        int aboveAvg = 0;
        for (int i = 0; i < wagesEmployee.length; i++) {
            if (wagesEmployee[i] > avgWage){
                aboveAvg ++;
            }
        }
        
        if (aboveAvg > 1){
            System.out.printf("%d funcionarios recebem acima da media", aboveAvg);
        }
        else {
            System.out.printf("%d funcionario recebe acima da media", aboveAvg);
        }
    }
}
