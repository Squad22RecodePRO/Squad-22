create database bibliotecamagica;
use bibliotecamagica;

select * from livro;

CREATE TABLE usuarios(
	id int not null PRIMARY KEY auto_increment,
    usuario  varchar(80) not null,
    senha varchar(80) not null,
    data_cadastro date
);

INSERT INTO usuarios(usuario, senha) VALUES ('aline', 'brendo');

SELECT * FROM usuarios;


CREATE TABLE livro (
id_livro int not null PRIMARY KEY,
autor VARCHAR(60) not null,
titulo VARCHAR(60) not null,
genero VARCHAR(10) not null,
cod_genero VARCHAR(10),
isbn VARCHAR(13)
);

CREATE TABLE Usuario(
  id int not null PRIMARY KEY auto_increment,
  email VARCHAR(80) not null,
  senha VARCHAR(32) not idnull,
  username VARCHAR(30) not null,
  dt_criacao Date not null,
  dt_ultima_alteracao Date not null
);

CREATE TABLE Atributos(
  id int not null PRIMARY KEY auto_increment,
  cod_genero int,
  nome VARCHAR(30)
);