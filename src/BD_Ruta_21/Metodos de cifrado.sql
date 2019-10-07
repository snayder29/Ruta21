
CREATE MASTER KEY ENCRYPTION BY PASSWORD = '23987hxJ#KL95234nl0zBe';
GO
-- Creamos el certificado
CREATE CERTIFICATE MiPrimerCertificado
	ENCRYPTION BY PASSWORD = 'pGFD4bb925DGvbd2439587y'
   WITH SUBJECT = 'prueba' 
GO 


-- drop SYMMETRIC KEY MiLlaveSimetrica
--Creamos la llave simetrica

CREATE SYMMETRIC KEY MiLlaveSimetrica
	WITH
	KEY_SOURCE = 'MyKeySource',
	IDENTITY_VALUE = 'MyIdentityValue',
	ALGORITHM = AES_256
	ENCRYPTION BY CERTIFICATE MiPrimerCertificado;
GO

--alteramos el certificado, Cambiar la protección de la clave privada de una contraseña a la clave maestra de la base de datos
ALTER CERTIFICATE MiPrimerCertificado
     WITH PRIVATE KEY ( DECRYPTION BY PASSWORD = 'pGFD4bb925DGvbd2439587y' );  
go

--abrimos la llave
--OPEN SYMMETRIC KEY MiLlaveSimetrica  
 --  DECRYPTION BY CERTIFICATE MiPrimerCertificado

--INSERT INTO personal.ocupacion (cod_ocupacion, nombre)
--VALUES ('002', ENCRYPTBYKEY(KEY_GUID('MiLlaveSimetrica'),'Mecanico'))
--GO

--cierro la llave
--CLOSE SYMMETRIC KEY MiLlaveSimetrica

SELECT * FROM sys.symmetric_keys
go

insert into bus.destinos values(001,'Trujillo','paname 519. Urb. Torres araujo')