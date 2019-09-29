use master;
--drop database Ruta_21;
go

create database Ruta_21;
go

use Ruta_21; 
go

create table ocupacion(
	cod_ocupacion	tinyint not null,
	nombre			varchar(20)not null,
	constraint PK_ocupacion primary key (cod_ocupacion)
);
go

create table personal
(
	cod_usuario		varchar(8) not null,
	nombre_1		varchar(20) not null,
	nombre_2		varchar(20) not null,
	apellidos		varchar(50) not null,
	--describe el tipo de sexo M o F
	genero			char(2)not null,
	correo			varchar(50) not null,
	direccion		varchar(90) not null,
	celular_1		tinyint not null,
	celular_2		tinyint,
	f_ingreso		date not null,
	f_modificacion	date not null,
	cod_ocupacion	tinyint not null,
	constraint PK_usuario primary key (cod_usuario),
	CONSTRAINT fk_ocupacion FOREIGN KEY (cod_ocupacion) REFERENCES ocupacion(cod_ocupacion)
);
go

create table iniciar_sesion(
	usuario			varchar(20) not null,
	contraseña		varchar(64) not null,
	cod_usuario		varchar(8) not null,
	constraint PK_personal primary key (usuario, contraseña),
	CONSTRAINT fk_usuario FOREIGN KEY (cod_usuario) REFERENCES personal(cod_usuario)
);
go

create table servicio(
	cod_servicio	varchar(10) not null,
	nombre			varchar(20),
	descripcion		varchar(255),
	constraint PK_servicio primary key (cod_servicio)
);
go

create table Destinos(
	cod_destinos	tinyint not null,
	nombres			varchar(30),
	constraint PK_destino primary key (cod_destinos)
);
go

create table bus(
	id_placa		char(7) not null,
	marca			char(20) not null,
	modelo			char(20) not null,
	año				char(4) not null,
	n_asientos		tinyint not null,
	estado			char(15) not null,
	f_compra		date not null,
	cod_servicio	varchar(10),
	kilometraje		numeric(14,3),
	constraint PK_placa primary key (id_placa),
	CONSTRAINT fk_servicio FOREIGN KEY (cod_servicio) REFERENCES servicio(cod_servicio)
);
go

create table programacion(
	cod_programa	int not null,
	f_programa		date,
	cod_usuario		varchar(8) not null,
	cod_destinos	tinyint not null,
	id_placa		char(7) not null,

);
go


