-- Active: 1690746463990@@127.0.0.1@5432@postgres
drop table if exists Xvendedor;
drop table if exists  Xproduto;
drop table if exists Xvendas;

CREATE TABLE Xvendedor (
   nome VARCHAR (100) NOT NULL
);
CREATE TABLE Xproduto (
   tipo VARCHAR (100) NOT NULL,
   valor FLOAT
);
CREATE TABLE Xvendas (
    nome VARCHAR (100) NOT NULL,
    tipo VARCHAR (100) NOT NULL,
    quantidade INT
);


INSERT INTO Xvendedor (nome)
VALUES ('Gabriela');
INSERT INTO Xvendedor (nome)
VALUES ('Joao');
INSERT INTO Xvendedor (nome)
VALUES ('Maria');
INSERT INTO Xvendedor (nome)
VALUES ('Pedro');
INSERT INTO Xproduto (tipo, valor)
VALUES ('Cadeira',800.0);
INSERT INTO Xproduto (tipo, valor)
VALUES ('Mesa',1400.0);
INSERT INTO Xproduto (tipo, valor)
VALUES ('Sofa',2600.0);
INSERT INTO Xvendas (nome,tipo, quantidade)
VALUES ('Gabriela','Cadeira',8);
INSERT INTO Xvendas (nome,tipo, quantidade)
VALUES ('Gabriela','Mesa',2);
INSERT INTO Xvendas (nome,tipo, quantidade)
VALUES ('Gabriela','Sofa',3);

INSERT INTO Xvendas (nome,tipo, quantidade)
VALUES ('Joao','Cadeira',4);
INSERT INTO Xvendas (nome,tipo, quantidade)
VALUES ('Joao','Mesa',1);
INSERT INTO Xvendas (nome,tipo, quantidade)
VALUES ('Joao','Sofa',3);

INSERT INTO Xvendas (nome,tipo, quantidade)
VALUES ('Maria','Cadeira',2);
INSERT INTO Xvendas (nome,tipo, quantidade)
VALUES ('Maria','Mesa',1);



