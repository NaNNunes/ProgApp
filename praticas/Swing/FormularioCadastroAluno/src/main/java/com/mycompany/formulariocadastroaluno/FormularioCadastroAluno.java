/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.formulariocadastroaluno;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author r.nunes
 */
public class FormularioCadastroAluno extends JFrame {
// Declaração dos componentes do formulário
    private JLabel labelNome, labelSobrenome, labelNascimento, labelEscolaridade, labelCurso, labelTurma;
    private JTextField campoNome, campoSobrenome, campoNascimento;
    private JComboBox<String> comboEscolaridade, comboCurso, comboTurma;
    private JButton botaoSalvar;

    public FormularioCadastroAluno() {
        // Configurações da janela
        setTitle("Cadastro de Aluno");
        setSize(620, 620);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2, 10, 10));

        // Inicialização dos componentes
        labelNome = new JLabel("Nome:");
        labelSobrenome = new JLabel("Sobrenome:");
        labelNascimento = new JLabel("Nascimento:");
        labelEscolaridade = new JLabel("Escolaridade:");
        labelCurso = new JLabel("Curso:");
        labelTurma = new JLabel("Turma:");

        campoNome = new JTextField();
        campoSobrenome = new JTextField();
        campoNascimento = new JTextField();

        String[] escolaridades = {"Ensino Médio", "Graduação", "Pós-graduação"};
        comboEscolaridade = new JComboBox<>(escolaridades);

        String[] cursos = {"Ciência da Computação", "Engenharia", "Matemática", "Física"};
        comboCurso = new JComboBox<>(cursos);

        String[] turmas = {"A", "B", "C", "D"};
        comboTurma = new JComboBox<>(turmas);

        botaoSalvar = new JButton("Salvar");

        // Adicionando os componentes na janela
        add(labelNome);
        add(campoNome);
        add(labelSobrenome);
        add(campoSobrenome);
        add(labelNascimento);
        add(campoNascimento);
        add(labelEscolaridade);
        add(comboEscolaridade);
        add(labelCurso);
        add(comboCurso);        
        add(labelTurma);
        add(comboTurma);
        add(new JLabel()); // espaço vazio para alinhamento
        add(botaoSalvar);
        
        setVisible(true);
    }
    
    
    
    public static void main(String[] args) {
        new FormularioCadastroAluno();    }
}
