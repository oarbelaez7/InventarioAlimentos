CREATE DATABASE inventario_alimentos;

USE inventario_alimentos;

CREATE TABLE Sucursales (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    direccion VARCHAR(150),
    telefono VARCHAR(15)
);

CREATE TABLE Productos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    descripcion VARCHAR(255),
    precio DECIMAL(10,2)
);

INSERT INTO Sucursales (nombre, direccion, telefono) VALUES
('Sucursal Norte', 'Calle 10 #20-30, Bogotá', '3001234567'),
('Sucursal Sur', 'Carrera 15 #45-60, Cali', '3807654321');

INSERT INTO Productos (nombre, descripcion, precio) VALUES
('Arroz 500g', 'Arroz blanco empacado', 2500.00),
('Aceite 1L', 'Aceite vegetal', 8000.00),
('Leche 1L', 'Leche entera', 4200.00);
