create table equipes(
	id int primary key,
	id_categoria int,
	id_companhia int,
	professor varchar,
	num_participantes int,
	foreign key (id_categoria) references categoria (id),
	foreign key (id_companhia) references companhia_danca(id)
);

insert into equipes
(id, id_categoria, id_companhia, professor, num_participantes)
values
insert into equipes
(id, id_categoria, id_companhia, professor, num_participantes)
values
(1, 5, 1, 'Maggie', 4),
(2, 2, 1, 'Margaret', 4),
(3, 1, 1, 'Robson', 3),
(4, 10, 1, 'Julie', 3),
(5, 8, 2, 'João', 4),
(6, 7, 2, 'Liza', 3),
(7, 6, 2, 'Mia', 4),
(8, 9, 3, 'Lucas', 4),
(9, 3, 3, 'Lucy', 4),
(10, 7, 3, 'Britany', 3),
(11, 4, 3, 'Lexi', 4),
(12, 5, 4, 'Kelly', 3),
(13, 13, 4, 'Margerine', 4),
(14, 12, 4, 'Lia', 3);
