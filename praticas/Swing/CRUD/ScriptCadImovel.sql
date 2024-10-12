CREATE DATABASE marcenaria;
USE marcenaria;

CREATE TABLE solicitacao(
id_solicitacao INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(20),
sobrenome VARCHAR(20),
telefone VARCHAR(11),
CPF VARCHAR(11) UNIQUE,
dt_incio VARCHAR(10),
dt_final VARCHAR(10),
imovel
);
