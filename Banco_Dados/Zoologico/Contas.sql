create table contas(
	codigo int primary key,
	estoque_total int, 
	mes_ano date,
	bilheteria_total decimal(9,2), 
	gastos_extras decimal(9,2),
	lucro decimal(9,2),
	func_total decimal(9,2)
); 

-- ADICIONANDO INFORMAÇÕES A TABELA COM IMPORTAÇÕES:

\copy contas from ‘C:\Users\emanuelle_tomczyk\Documents\contas.csv’ delimiter ';' csv header;

-- INFORMAÇÕES: 
estoque_total;mes_ano;bilheteria_total;gastos_extras;lucro;func_total
450;30/01/2022;12000.50;1500.75;798.75;9700.50
300;28/02/2022;15000.75;1000.75;4299.50;9700.50
