-- Active: 1690746463990@@127.0.0.1@5432@postgres
drop table if exists palette_a;
drop table if exists palette_b;
CREATE TABLE palette_a (
    id INT PRIMARY KEY,
    color VARCHAR (100) NOT NULL
);
CREATE TABLE palette_b (
    id INT PRIMARY KEY,
    color VARCHAR (100) NOT NULL
);
INSERT INTO palette_a (id, color)
VALUES (1, 'Red');
INSERT INTO palette_a (id, color)
VALUES (2, 'Green');
INSERT INTO palette_a (id, color)
VALUES (3, 'Blue');
INSERT INTO palette_a (id, color)
VALUES (4, 'Purple');

-- insert data for the palette_b
INSERT INTO palette_b (id, color)
VALUES (1, 'Green');

INSERT INTO palette_b (id, color)
VALUES (2, 'Red');

INSERT INTO palette_b (id, color)
VALUES (3, 'Cyan');

INSERT INTO palette_b (id, color)
VALUES (4, 'Brown');
