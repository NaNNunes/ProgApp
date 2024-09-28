/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_05;

/**
 *
 * @author renan_8tvcd4n
 */
public class Lutador {
    
    private String nome;
    private double peso;
    private String categoria;
    
    public String setNome(String nome){
        return this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public double setPeso(double peso){
        return this.peso = peso;
    }
    public double getPeso(){
        return peso;
    }
    
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public String getCategoria(){
        return categoria;
    }
}
