/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_14;

/**
 *
 * @author renan_8tvcd4n
 */
public class Funcionario {
    private String nome;
    private double salario;
    private double novoSalario;
    
    public String setNome(String nome){
        return this.nome = nome;
    }
    
    public double getSalario(){
        return this.salario;
    }
    public double setSalario(double salario){
        return this.salario = salario;
    }
    
    public void setNovoSalario(double salario){
        double porcentagem;
         
        if (salario <= 150){
            porcentagem = 0.25;
        }
        else if (salario <= 300){
            porcentagem = 0.2;
        }
        else if (salario <= 600){
            porcentagem = 0.15;
        }
        else {
            porcentagem = 0.1;
        }
        
        this.novoSalario = salario + (salario * porcentagem);
    }
    
    public double getNovoSalario(){
        return this.novoSalario;
    }
}
