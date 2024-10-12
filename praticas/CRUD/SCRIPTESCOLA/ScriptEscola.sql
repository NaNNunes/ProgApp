CREATE DATABASE escola;


USE escola;

CREATE TABLE aluno(
nome VARCHAR(20),
sobrenome VARCHAR(20),
CPF VARCHAR(11)
);

ALTER TABLE aluno ADD COLUMN ra_aluno INT NOT NULL PRIMARY KEY AUTO_INCREMENT;

select * from aluno;