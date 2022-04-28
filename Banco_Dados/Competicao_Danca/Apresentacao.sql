create table apresentacao(
	id int primary key,
	tema varchar,
	horario varchar,
	Data date,
	musica varchar,
	id_equipe int,
	foreign key (id_equipe) references equipes
);

-- IMPORTANDO TABELA APRESENTAÇÃO: 
\copy apresentacao from ‘C:\Users\emanuelle_tomczyk\Documents\apresentacao.csv’ delimiter ',' csv header;

-- INFORMAÇÕES:
id,tema,horario,data,musica,equipe
1,Noite Estrelada,17:00:00,2022-02-01,Talking to the moon,1
2,Celestial,17:30:00,2022-02-01,Isn't She Lovely,2
3,Rock,18:00:00,2022-02-01,so what,3
4,Monocromático,18:30:00,2022-02-01,Lovely,4
5,Trovoada,19:00:00,2022-02-01,Gayaneh-Suite: Sabre dance,5
6,Praia,19:30:00,2022-02-01,Don’t Know Why,6
7,Vermelho,20:00:00,2022-02-01,Mi Buenos Aires Querido,7
8,Hip Hop,17:00:00,2022-02-02,The Breaks,8
9,Hip Hop,17:30:00,2022-02-02,Ego Trippin,9
10,Floresta,18:00:00,2022-02-02,Strange Fruit,10
11,Sia,18:30:00,2022-02-02,Chandelier,11
12,Las vegas,19:00:00,2022-02-02,24K Magic,12
13,Azul,19:30:00,2022-02-02,Cambalache,13
14,Lobos,20:00:00,2022-02-02,Runaway baby,14
