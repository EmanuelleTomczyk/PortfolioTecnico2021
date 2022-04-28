create table cuidam(
	cod_animal int, 
	cod_fun varchar,
	foreign key (cod_animal) references animal,
	foreign key (cod_fun) references funcionarios
);
