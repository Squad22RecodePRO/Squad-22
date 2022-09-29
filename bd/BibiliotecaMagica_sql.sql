CREATE DATABASE BibliotecaMagica;
USE BibliotecaMagica;

CREATE TABLE Usuario (
Id_usuario INTEGER PRIMARY KEY auto_increment,
Email VARCHAR(50),
Nome VARCHAR(80),
Data_nasc DATETIME
);

CREATE TABLE Conquista (
Id_conquistas INTEGER PRIMARY KEY AUTO_INCREMENT,
Titulo_conquista VARCHAR(30),
Condição VARCHAR(50)
);

CREATE TABLE Estatistica (
Id_Estatistica INTEGER PRIMARY KEY AUTO_INCREMENT,
Titulo_estatistica VARCHAR(30),
Quantidade VARCHAR(30)
);

CREATE TABLE Atributo (
Id_atributo INTEGER PRIMARY KEY AUTO_INCREMENT,
Pontos VARCHAR(10),
Atributo VARCHAR(10)
);

CREATE TABLE Genero (
Id_genero INTEGER PRIMARY KEY AUTO_INCREMENT,
Genero VARCHAR(20)
);

CREATE TABLE Login (
Id_login INTEGER PRIMARY KEY AUTO_INCREMENT,
Senha VARCHAR(50),
Login VARCHAR(30),
Id_usuario INTEGER,
FOREIGN KEY(Id_usuario) REFERENCES Usuario (Id_usuario)
);

CREATE TABLE Perfil (
Id_perfil INTEGER PRIMARY KEY AUTO_INCREMENT,
NomeDeUsuario VARCHAR(50),
Id_login INTEGER,
FOREIGN KEY(Id_login) REFERENCES Login (Id_login)
);

CREATE TABLE Itens_perfil (
Id_itens INTEGER PRIMARY KEY AUTO_INCREMENT,
Id_perfil INTEGER,
Id_conquistas INTEGER,
Id_Estatistica INTEGER,
Id_atributo INTEGER,
FOREIGN KEY(Id_perfil) REFERENCES Perfil (Id_perfil),
FOREIGN KEY(Id_conquistas) REFERENCES Conquista (Id_conquistas),
FOREIGN KEY(Id_Estatistica) REFERENCES Estatistica (Id_Estatistica),
FOREIGN KEY(Id_atributo) REFERENCES Atributo (Id_atributo)
);

CREATE TABLE Livro (
Id_livro INTEGER PRIMARY KEY AUTO_INCREMENT,
Autor VARCHAR(80),
Titulo VARCHAR(50),
Id_genero INTEGER,
FOREIGN KEY(Id_genero) REFERENCES Genero (Id_genero)
);

CREATE TABLE Itens_leitura (
Id_livro INTEGER,
Id_perfil INTEGER,
FOREIGN KEY(Id_livro) REFERENCES Livro (Id_livro),
FOREIGN KEY(Id_perfil) REFERENCES Perfil (Id_perfil)
);

CREATE TABLE Permissao (
Id_permissao INTEGER PRIMARY KEY auto_increment,
Tipo VARCHAR(20)
);

ALTER TABLE Usuario ADD column Id_permissao INTEGER;
ALTER TABLE Usuario ADD FOREIGN KEY(Id_permissao) REFERENCES Permissao (Id_permissao);
 
select * from permissao;
select * from login_completo;

create view livro_completo 
as select l.Id_livro,l.Id_genero, g.genero, l.Autor, l.Titulo 
from genero g, livro l where l.Id_genero = g.Id_genero;

create view usuario_completo
as select u.Id_usuario, u.Email, u.Nome, u.Data_nasc, p.Id_permissao, p.Tipo 
from usuario u, permissao p where u.Id_permissao = p.Id_permissao order by u.Id_usuario asc;

create view login_completo
as select l.Id_login, l.Login, l.Senha, u.Id_usuario, u.Email 
from login l, usuario u where l.Id_usuario = u.Id_usuario order by l.Id_login asc;

