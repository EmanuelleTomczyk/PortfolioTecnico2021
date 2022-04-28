create table espectador (
	num_cadeira varchar primary key,
	valor_ingresso decimal (7,2),
	nome_cliente varchar,
	id_func varchar,
	foreign key (id_func) references funcionarios
);

insert into espectador
(num_cadeira, valor_ingresso, nome_cliente, id_func)
values
('A12', 180.00, 'Carla', '33.55555.22-1'),
('B15', 150.00, 'Lucas', '55.55555.22-8'),
('D13', 60.50, 'Roberta', '11.59385.15-6'),
('E4', 180.00, 'Wagner', '15.2765.62-5'),
('F14', 120.00, 'Larissa', '12.93574.26-4'),
('G24', 180.00, 'Kloe', '36.15243.10-3'),
('I10', 120.00, 'João', '42.21964.52-1'),
('H17', 120.00, 'Robson', '55.55555.22-8')
