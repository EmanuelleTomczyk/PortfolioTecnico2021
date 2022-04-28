create table Categorias(
	id serial primary key,
	estilo varchar,
	faixa_etaria varchar
);

-- IMPORTANDO TABELA CATEGORIAS: 
\copy categorias from ‘C:\Users\emanuelle_tomczyk\Documents\categorias.csv’ delimiter ',' csv header;

-- INFORMAÇÕES:
id,estilo,faixa_etaria
1,Jazz Adoslecente,12 a 17
2,Balé  Adoslecente,12 a 17
3,Hip Hop  Adoslecente,12 a 17
4,Contemporânea  Adoslecente,12 a 17
5,Sapateado  Adoslecente,12 a 17
6,Tango  Adoslecente,12 a 17
7,Jazz Adulto,18 a 45
8,Balé Adulto,18 a 45
9,Hip Hop Adulto,18 a 45
10,Contemporânea Adulto,18 a 45
12,Sapateado Adulto,18 a 45
13,Tango Adulto,18 a 45
