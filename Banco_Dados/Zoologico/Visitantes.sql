create table visitantes(
	cpf varchar primary key, 
	nome varchar,
	idade int, 
	checkin date
);

# ADICIONANDO INFORMAÇÕES A TABELA COM IMPORTAÇÕES:

\copy visitantes from ‘C:\Users\emanuelle_tomczyk\Documents\visitantes1.csv’ delimiter ';' csv header;

# INFORMAÇÕES: 
cpf;nome;idade;checkin
255.655.525-52;Ana Moreira;31;2022-03-04
555.666.522-97;Joana Moreira;12;2022-03-04
255.655.582-45;Antonio Silva;40;2021-12-15
638.885.319-53;Rosana Silva;61;2021-12-15
