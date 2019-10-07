--use master;
--drop database Ruta_21;
--go

--create database Ruta_21;
--go

--use Ruta_21; 
--go

/*
	************************************************ datos de Personal ***************************************************
*/


create schema personal; 
go

create schema pasajes;
go

create schema bus; 
go

create schema programacion; 
go


create table personal.ocupacion(
	cod_ocupacion	tinyint not null,
	nombre			varchar(20) not null,

	constraint PK_ocupacion primary key (cod_ocupacion)
);
go

--insert into personal.ocupacion values(001,'Ventanilla');
--go

create table personal.personal
(
	cod_personal	tinyint not null,
	doc_identidad	tinyint not null,
	tipo_doc		varbinary(200) not null,
	nombre_1		varbinary(200) not null,
	nombre_2		varbinary(200)  not null,
	apellidos		varbinary(200)  not null,
	edad			varbinary(200) not null,
	--describe el tipo de sexo M o F
	genero			varbinary(200) not null,
	correo			varbinary(200)  not null,
	direccion		varbinary(200)  not null,
	celular_1		varbinary(200) not null,
	celular_2		varbinary(200) ,
	f_ingreso		varbinary(200) not null,
	f_modificacion	varbinary(200) ,
	cod_ocupacion	tinyint not null,

	constraint PK_usuario primary key (cod_personal),
	CONSTRAINT fk_ocupacion FOREIGN KEY (cod_ocupacion) REFERENCES personal.ocupacion(cod_ocupacion)
);
go

--insert into personal.personal values('snayder','snayder','bryan','rosario', 'M','snayder_bryan_29@hotmail.com','panama 519','957049975','0000000','2018-12-24','2018-12-24','001');
--go

create table personal.iniciar_sesion(
	usuario			varchar(50)  not null,
	contraseña		varchar(70)  not null,
	cod_personal	tinyint not null,

	constraint PK_personal primary key (usuario, contraseña),
	CONSTRAINT fk_personal FOREIGN KEY (cod_personal) REFERENCES personal.personal(cod_personal)
);
go

--insert into iniciar_sesion values(001,'Ventanilla');


/*
	************************************************ Bus ********************************************************
*/


create table bus.servicio(
	cod_servicio	varchar(20) not null,
	fecha			date not null,
	nombre			varchar(20) ,
	descripcion		varchar(200) ,

	constraint PK_servicio primary key (cod_servicio)
);
go

create table bus.Destinos(
	cod_destinos	tinyint not null,
	nombres			varchar(20)  not null,
	direccion		varchar(50)  not null,

	constraint PK_destino primary key (cod_destinos)
);
go

create table bus.tipo_bus(
	cod_tipo		tinyint not null,
	descripccion	varchar(20)  not null,

	constraint PK_tipo primary key (cod_tipo)
);
go

create table bus.bus(
	id_placa		char(7) not null,
	marca			varchar(20)  not null,
	modelo			varchar(20)  not null,
	cod_tipo		tinyint not null,
	año				varchar(4) not null,
	n_asientos		tinyint not null,
	estado			varchar(20)  not null,
	f_compra		date not null,
	kilometraje		numeric(14,3),
	constraint PK_placa primary key (id_placa),
	CONSTRAINT fk_tipo FOREIGN KEY (cod_tipo) REFERENCES bus.tipo_bus(cod_tipo),
);
go

create table bus.h_servicio(
	id_placa		char(7) not null,
	cod_servicio	varchar(20)  not null,

	CONSTRAINT fk_placa FOREIGN KEY (id_placa) REFERENCES bus.bus(id_placa),
	CONSTRAINT fk_servicio FOREIGN KEY (cod_servicio) REFERENCES bus.servicio(cod_servicio)
);
go


/*
	************************************************ Programación de rutas ********************************************************
*/


create table programacion.programacion(
	cod_programa	int not null,
	f_programa		date,
	cod_personal	tinyint not null,
	ruta			varchar(40) not null,
	id_placa		char(7) not null,
	hora_salida		date,
	hora_llegada	date,
	punto_partida	varchar(80)  not null,
	punto_llegada	varchar(80)  not null,
	cod_destinos	tinyint not null,

	CONSTRAINT fk_bus FOREIGN KEY (id_placa) REFERENCES bus.bus(id_placa),
	CONSTRAINT fk_usuario FOREIGN KEY (cod_personal) REFERENCES personal.personal(cod_personal),
	CONSTRAINT fk_ruta FOREIGN KEY (cod_destinos) REFERENCES bus.destinos(cod_destinos)
);
go



/*
	************************************************ Lista de pasajeros ********************************************************
*/


create table pasajes.asiento(
	cod_asiento		tinyint not null,
	descripcion		varbinary(200) not null,

	constraint PK_asiento primary key (cod_asiento)
);
go

create table pasajes.pasajero(
	cod_cliente		tinyint not null,
	nombres			varbinary(200) not null,
	apellidos		varbinary(200) not null,
	cod_asiento		tinyint not null,

	constraint PK_cliente primary key (cod_cliente),
	CONSTRAINT fk_asiento FOREIGN KEY (cod_asiento) REFERENCES pasajes.asiento(cod_asiento)
);
go

create table pasajes.boletos(
	id_placa		char(7) not null,
	cod_asiento		tinyint not null,

	CONSTRAINT fk_codigo FOREIGN KEY (id_placa) REFERENCES bus.bus(id_placa),
	CONSTRAINT fk_lugar FOREIGN KEY (cod_asiento) REFERENCES pasajes.asiento(cod_asiento),

);
go