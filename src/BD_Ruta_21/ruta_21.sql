use master;
--drop database Ruta_21;
go

create database Ruta_21;
go

use Ruta_21; 
go

/*
	************************************************ datos de Personal ***************************************************
*/

create table ocupacion(
	cod_ocupacion	tinyint not null,
	nombre			varchar(20)not null,

	constraint PK_ocupacion primary key (cod_ocupacion)
);
go

insert into ocupacion values(001,'Ventanilla');


create table personal
(
	cod_personal	varchar(8) not null,
	nombre_1		varchar(20) not null,
	nombre_2		varchar(20) not null,
	apellidos		varchar(50) not null,
	--describe el tipo de sexo M o F
	genero			char(2)not null,
	correo			varchar(50) not null,
	direccion		varchar(90) not null,
	celular_1		varchar(9) not null,
	celular_2		varchar(9),
	f_ingreso		date not null,
	f_modificacion	date not null,
	cod_ocupacion	tinyint not null,

	constraint PK_usuario primary key (cod_personal),
	CONSTRAINT fk_ocupacion FOREIGN KEY (cod_ocupacion) REFERENCES ocupacion(cod_ocupacion)
);
go

insert into personal values('snayder','snayder','bryan','rosario', 'M','snayder_bryan_29@hotmail.com','panama 519','957049975','0000000','2018-12-24','2018-12-24',001);

create table iniciar_sesion(
	usuario			varchar(20) not null,
	contraseña		varchar(64) not null,
	cod_personal	varchar(8) not null,

	constraint PK_personal primary key (usuario, contraseña),
	CONSTRAINT fk_personal FOREIGN KEY (cod_personal) REFERENCES personal(cod_personal)
);
go

--insert into iniciar_sesion values(001,'Ventanilla');

/*
	********************************************* venta de Pasajes ***************************************************
*/


create table asiento(
	cod_asiento		tinyint not null,
	descripcion		varchar(15) not null,

	constraint PK_asiento primary key (cod_asiento)
);
go

create table pasajero(
	cod_cliente		tinyint not null,
	nombres			varchar(50) not null,
	apellidos		varchar(50) not null,
	cod_asiento		tinyint not null,

	constraint PK_cliente primary key (cod_cliente),
	CONSTRAINT fk_asiento FOREIGN KEY (cod_asiento) REFERENCES asiento(cod_asiento)
);
go


/*
	************************************************ Bus ********************************************************
*/


create table servicio(
	cod_servicio	varchar(10) not null,
	fecha			date not null,
	nombre			varchar(20),
	descripcion		varchar(255),

	constraint PK_servicio primary key (cod_servicio)
);
go

create table Destinos(
	cod_destinos	tinyint not null,
	nombres			varchar(30) not null,
	direccion		varchar(60) not null,

	constraint PK_destino primary key (cod_destinos)
);
go

create table tipo_bus(
	cod_tipo		tinyint not null,
	descripccion	varchar(15) not null,

	constraint PK_tipo primary key (cod_tipo)
);
go

create table bus(
	id_placa		char(7) not null,
	marca			char(20) not null,
	modelo			char(20) not null,
	cod_tipo		tinyint not null,
	año				char(4) not null,
	n_asientos		tinyint not null,
	estado			char(15) not null,
	f_compra		date not null,
	kilometraje		numeric(14,3),
	constraint PK_placa primary key (id_placa),
	CONSTRAINT fk_tipo FOREIGN KEY (cod_tipo) REFERENCES tipo_bus(cod_tipo),
);
go

create table h_servicio(
	id_placa		char(7) not null,
	cod_servicio	varchar(10) not null,

	CONSTRAINT fk_placa FOREIGN KEY (id_placa) REFERENCES bus(id_placa),
	CONSTRAINT fk_servicio FOREIGN KEY (cod_servicio) REFERENCES servicio(cod_servicio)
);
go


/*
	************************************************ Programación de rutas ********************************************************
*/


create table programacion(
	cod_programa	int not null,
	f_programa		date,
	cod_personal	varchar(8) not null,
	ruta			varchar(30) not null,
	id_placa		char(7) not null,
	hora_salida		date,
	hora_llegada	date,
	punto_partida	varchar(60) not null,
	punto_llegada	varchar(60) not null,
	cod_destinos	tinyint not null,

	CONSTRAINT fk_bus FOREIGN KEY (id_placa) REFERENCES bus(id_placa),
	CONSTRAINT fk_usuario FOREIGN KEY (cod_personal) REFERENCES personal(cod_personal),
	CONSTRAINT fk_ruta FOREIGN KEY (cod_destinos) REFERENCES destinos(cod_destinos)
);
go



/*
	************************************************ Lista de pasajeros ********************************************************
*/

create table boletos(
	id_placa		char(7) not null,
	cod_asiento		tinyint not null,

	CONSTRAINT fk_codigo FOREIGN KEY (id_placa) REFERENCES bus(id_placa),
	CONSTRAINT fk_lugar FOREIGN KEY (cod_asiento) REFERENCES asiento(cod_asiento),

);
go