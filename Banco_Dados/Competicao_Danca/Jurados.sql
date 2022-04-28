create table jurados(
	id int primary key,
	nome varchar,
	especialidade varchar,
	formacao varchar,
	idade int
);

-- IMPORTANDO TABELA JURADOS:
\copy jurados from ‘C:\Users\emanuelle_tomczyk\Documents\jurados.csv’ delimiter ',' csv header;

-- INFORMAÇÕES:
id,nome,especialidade,formacao,idade
1,José Saraiva,Jazz,Música,54
2,Maria Steffens,Balé,Dança,28
3,Davi Grasel,Hip Hop ,Moda,32
4,Ana Matos,Contemporânea,Artes Cênicas ,25
5,Gabriel Pizzanelli ,Sapateado ,Artes Plásticas ,41
6,Júlia Heinz ,Tango ,Dança ,36
