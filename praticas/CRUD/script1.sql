CREATE DATABASE escola;
USE escola;

CREATE TABLE matricula(
cod_matricula INT AUTO_INCREMENT PRIMARY KEY,
cod_curso INT,
ra_aluno INT
);

CREATE TABLE aluno(
ra_aluno INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(30),
dt_nasc DATE,
CPF CHAR(11) NOT NULL UNIQUE
);