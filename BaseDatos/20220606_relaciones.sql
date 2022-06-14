use generationg1;

CREATE TABLE registros(
    id Integer PRIMARY KEY auto_increment,
    codigo varchar(10),
    rut varchar(13)
);

CREATE TABLE cursos(
    id Integer PRIMARY KEY auto_increment,
    nombre varchar(30),
    descripcion varchar(50)
);

CREATE TABLE paises(
    id Integer PRIMARY KEY auto_increment,
    nombre varchar(20),
    sector varchar(10)
);

CREATE TABLE direcciones(
    id Integer PRIMARY KEY auto_increment,
    nombre varchar(30),
    numero Integer
);

CREATE TABLE alumnos (
    id Integer PRIMARY KEY auto_increment,
    nombre varchar(30),
    apellido varchar(30),
    edad Integer,
    cursos_id Integer,
    registros_id Integer,
    direcciones_id Integer
);

INSERT INTO paises (nombre, sector) VALUES ('Argentina', 'Sur'),
('Bolivia', 'Sur'),
('Brasil', 'Sur'),
('Chile', 'Sur'),
('Colombia', 'Sur'),
('Ecuador', 'Sur'),
('Paraguay', 'Sur'),
('Perú', 'Sur'),
('Surinam', 'Sur'),
('Trinidad y Tobago', 'Sur'),
('Uruguay', 'Sur'),
('Belice', 'Centro'),
('Costa Rica', 'Centro'),
('El Salvador', 'Centro'),
('Guatemala', 'Centro'),
('Honduras', 'Centro'),
('Nicaragua', 'Centro'),
('Panamá', 'Centro'),
('Canadá', 'Norte'),
('Estados Unidos', 'Norte'),
('México', 'Norte')