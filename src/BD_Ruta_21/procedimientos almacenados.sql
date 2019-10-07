create procedure ingresar_ocupacion
@codigo tinyint,
@nombre varchar(20)
as
begin
 
 OPEN SYMMETRIC KEY MiLlaveSimetrica  
 DECRYPTION BY CERTIFICATE MiPrimerCertificado

insert into personal.ocupacion(cod_ocupacion,nombre)
values (@codigo, ENCRYPTBYKEY(KEY_GUID('MiLlaveSimetrica'),@nombre))

CLOSE SYMMETRIC KEY MiLlaveSimetrica
end
go

--drop procedure ingresar_ocupacion

execute ingresar_ocupacion 001,'Administrador'
execute ingresar_ocupacion 002,'Gerente'
execute ingresar_ocupacion 003,'RR.HH'

select * from personal.ocupacion


insert into bus.destinos values(001,'Trujillo','paname 519. Urb. Torres araujo')