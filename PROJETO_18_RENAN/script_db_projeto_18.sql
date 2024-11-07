CREATE DATABASE projeto_18;
use projeto_18;

CREATE TABLE pato(
id_pato INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(30),
nome_cientifico VARCHAR(50),
idade decimal(2,1),
altura decimal(3,1),
peso decimal(4,2),
velocidade_media decimal(4,2)
);