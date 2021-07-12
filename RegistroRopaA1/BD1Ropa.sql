Create database BD1Ropa

go

use BD1Ropa

go

Create table Producto
(

      codigo int primary key identity(1,1),
	  producto nvarchar(30),
	  marca nvarchar(20),
	  talla nvarchar(5),
	  sexo nvarchar(2),
	  precio float,
	  estado int default 1 

)

go

Create table Clasificacion
(

      codigo int primary key identity(1,1),
	  Tipo nvarchar(40),
	  codProducto int,
	   estado int default 1




)

go

Insert into Producto (producto, marca , talla,  sexo, precio) values('Camisa', 'Levi,s', 'L', 'M', 20.0  )

insert into Clasificacion(Tipo, codProducto) values ('Deportiva', 1)

select * from Clasificacion
select * from Producto
