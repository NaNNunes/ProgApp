CREATE DATABASE pa_escola;
USE pa_escola;

CREATE TABLE aluno(
ra_aluno INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(20),
sobrenome VARCHAR(20),
CPF VARCHAR(11) UNIQUE
);

ALTER TABLE aluno ADD COLUMN cod_curso INT;

SELECT * FROM aluno;
DELETE FROM aluno WHERE ra_aluno = 10;