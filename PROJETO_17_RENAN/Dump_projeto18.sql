CREATE DATABASE projeto18;
USE projeto18;
DROP TABLE instrutor;

CREATE TABLE  instrutor(
id_instrutor INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(30),
sobrenome VARCHAR(40),
CPF VARCHAR(11),
telefone VARCHAR(13)
);

SELECT * FROM instrutor;
TRUNCATE TABLE instrutor;
