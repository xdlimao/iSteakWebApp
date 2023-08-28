create database lospolloshermanos

use lospolloshermanos

create table ADMLOGIN
(
USUARIO VARCHAR(50) PRIMARY KEY NOT NULL,
SENHA VARCHAR (50) NOT NULL
)

insert into ADMLOGIN(USUARIO, SENHA) values
('peralta', 'alimento')

select *from ADMLOGIN