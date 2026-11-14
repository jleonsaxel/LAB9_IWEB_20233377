DROP DATABASE IF EXISTS lab9_biblioteca;
CREATE DATABASE lab9_biblioteca CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE lab9_biblioteca;

CREATE TABLE usuario (
  id_usuario     INT AUTO_INCREMENT PRIMARY KEY,
  nombres        VARCHAR(80)  NOT NULL,
  apellidos      VARCHAR(80)  NOT NULL,
  email          VARCHAR(120) NOT NULL,
  password_hash  VARCHAR(255) NOT NULL,
  rol            ENUM('BIBLIOTECARIO','LECTOR') NOT NULL DEFAULT 'LECTOR',
  estado         ENUM('ACTIVO','BLOQUEADO') NOT NULL DEFAULT 'ACTIVO',
  UNIQUE KEY uk_usuario_email (email)
);

CREATE TABLE genero (
  id_genero   INT AUTO_INCREMENT PRIMARY KEY,
  nombre      VARCHAR(60) NOT NULL UNIQUE
);

CREATE TABLE libro (
  id_libro            INT AUTO_INCREMENT PRIMARY KEY,
  id_genero           INT NOT NULL,
  titulo              VARCHAR(150) NOT NULL,
  autor               VARCHAR(120) NOT NULL,
  anio_publicacion    INT NOT NULL,
  CONSTRAINT fk_libro_genero FOREIGN KEY (id_genero) REFERENCES genero(id_genero)
    ON UPDATE CASCADE ON DELETE RESTRICT
);

CREATE TABLE prestamo (
  id_prestamo     INT AUTO_INCREMENT PRIMARY KEY,
  id_usuario      INT NOT NULL,
  id_libro        INT NOT NULL,
  fecha_prestamo  DATE NOT NULL,
  fecha_limite    DATE NOT NULL,
  CONSTRAINT fk_prestamo_usuario FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario)
    ON UPDATE CASCADE ON DELETE CASCADE,
  CONSTRAINT fk_prestamo_libro   FOREIGN KEY (id_libro)   REFERENCES libro(id_libro)
    ON UPDATE CASCADE ON DELETE RESTRICT
);

INSERT INTO genero (nombre) VALUES
  ('Novela'), ('Ciencia'), ('Historia'), ('Programación');

INSERT INTO libro (id_genero, titulo, autor, anio_publicacion) VALUES
  (1, 'La ciudad y los perros',            'Mario Vargas Llosa',     1963),
  (1, 'Los ríos profundos',                'José María Arguedas',    1958),
  (1, 'Cien años de soledad',              'Gabriel García Márquez', 1967),
  (2, 'Breve historia del tiempo',         'Stephen Hawking',        1988),
  (2, 'Cosmos',                            'Carl Sagan',             1980),
  (3, 'Historia de la República del Perú', 'Jorge Basadre',          1939),
  (4, 'Clean Code',                        'Robert C. Martin',       2008),
  (4, 'Head First Servlets and JSP',       'Bryan Basham',           2008);
