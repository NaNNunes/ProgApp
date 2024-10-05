/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.formulariocadastrofuncionario;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author r.nunes
 */
public class FormularioCadastroFuncionario extends JFrame{

    private JLabel labelNome, labelSobrenome, labelMatricula,
            labelTelefone, labelEmail,
            
            labelSetor, labelTurno, labelCargo,
            
            labelDescSS, labelDescHS, labelDependentes, labelTreinamentos;
    
    private JTextField campoNome, campoSobreNome, campoMatricula, campoTelefone, campoEmail;
    
    private JTextArea campoDescSS, campoDescHS, campoDependentes, campoTreinamentos;
    
    private JComboBox<String> comboSetor, comboTurno, comboCargo;
    
    private JButton botaoSalvar, botaoPesquisar, botaoApagar;
    
    public FormularioCadastroFuncionario(){
        // config janela
        setTitle("Cadastro de Funcionario");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2, 10, 10));
        
        // inicial.. componentes
        this.labelNome = new JLabel("Nome:");
        this.labelSobrenome = new JLabel("Sobrenome:");
        this.labelMatricula = new JLabel("Matricula:");
        this.labelTelefone = new JLabel("Telefone:");
        this.labelEmail = new JLabel("Email:");
        
        this.labelSetor = new JLabel("Setor:");
        this.labelTurno = new JLabel("Turno:");
        this.labelCargo = new JLabel("Cargo:");
        
        this.labelDescSS = new JLabel("Descricao Soft Skills:");
        this.labelDescHS = new JLabel("Descricao Hard Skills:");
        this.labelDependentes = new JLabel("Dependentes:");
        this.labelTreinamentos = new JLabel("Treinamentos:");
        
        // txtField
        this.campoNome = new JTextField();
        this.campoSobreNome = new JTextField();
        this.campoMatricula = new JTextField();
        this.campoTelefone = new JTextField();
        this.campoEmail = new JTextField();
        
        // Area
        this.campoDescSS = new JTextArea();
        this.campoDescHS = new JTextArea();
        this.campoDependentes = new JTextArea();
        this.campoTreinamentos = new JTextArea();
        
        // comboBox
        String[] setor = {"Automacao", "Operacao", "Atendimento"};
        this.comboSetor = new JComboBox<>(setor);
        
        String[] cargo = {"Operador", "Supervisor", "Gerente"};
        this.comboCargo = new JComboBox<>(cargo);
        
        String[] turno = {"Matutino", "Vespertino", "Noturno"};
        this.comboTurno = new JComboBox<>(turno);
        
        // add componentes na janela
        //txtField
        add(this.labelNome);
        add(this.campoNome);
        add(this.labelSobrenome);
        add(this.campoSobreNome);
        add(this.labelMatricula);
        add(this.campoMatricula);
        add(this.labelTelefone);
        add(this.campoTelefone);
        add(this.labelEmail);
        add(this.campoEmail);
        //txtArea
        add(this.labelDescSS);
        add(this.campoDescSS);
        add(this.labelDescHS);
        add(this.campoDescHS);
        add(this.labelDependentes);
        add(this.campoDependentes);
        add(this.labelTreinamentos);
        add(this.campoDependentes);
        //combo
        add(this.labelSetor);
        add(this.comboSetor);
        add(this.labelCargo);
        add(this.comboCargo);
        add(this.labelTurno);
        add(this.comboTurno);
        
        add(new JLabel());
        add(botaoSalvar);
        add(botaoPesquisar);
        add(botaoApagar);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new FormularioCadastroFuncionario();
    }
}
