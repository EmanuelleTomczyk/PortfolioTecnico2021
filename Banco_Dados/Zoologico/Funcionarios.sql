create table funcionarios(
	pis varchar primary key,
	nome varchar,
	carga_horaria int, 
	salario decimal(7,2),
	cpf varchar, 
	cargo varchar, 
	email varchar
); 

insert into funcionarios
(pis, nome, carga_horaria, salario, cpf, cargo, email)
values 
('33.55555.22-1', 'Vanessa Martin', 8, 7500.50, '255.655.582-45', 'Administradora', 'vanessa_martin@gmail.com'),
('55.55555.22-8', 'Igor Machado', 5, 2200.00, '638.885.319-53', 'Cuidador', 'igor_machado@gmail.com');

select * from funcionarios
