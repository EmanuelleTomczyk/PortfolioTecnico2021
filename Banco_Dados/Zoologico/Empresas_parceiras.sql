create table empresas_parceiras(
	cod serial primary key,
	nome varchar,
	email varchar,
	aluguel decimal(8,2),
	funcao varchar
);

-- ADICIONANDO INFORMAÇÕES A TABELA COM IMPORTAÇÕES:

\copy empresas_parceiras from ‘C:\Users\emanuelle_tomczyk\Documents\empresas_parceiras.csv’ delimiter ';' csv header;

-- INFORMAÇÕES: 
cod;nome;email;aluguel;funcao
64729400;AliZoo;alizoo@gmail.com;2500.00;Alimentacao
64729422;Brinque;brinque@gmail.com;3000.50;Diversao
