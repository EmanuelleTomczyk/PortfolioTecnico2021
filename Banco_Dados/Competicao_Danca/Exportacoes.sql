-- EXPORTAÇÃO EQUIPES-COMPANHIA_DANCA-CATEGORIAS ONDE O NOME DA COMPANHIA É DANCACIA: 
\copy (select * from equipes inner join companhia_danca on companhia_danca.id = equipes.id_companhia 
inner join categorias on categorias.id = equipes.id_categoria where nome ilike '%dancacia%') to 
'C:\Users\emanuelle_tomczyk\Documents\companhia_categoria_equipes.csv' delimiter ';' csv header; 


-- EXPORTAÇÃO APRESENTAÇÃO-EQUIPES-COMPANHIA_DANCA-CATEGORIAS-DANCARINOS
\copy (select apresentacao.id, apresentacao.horario, apresentacao.data, equipes.id as id_equipe, equipes.professor, 
companhia_danca.cidade, companhia_danca.nome, dancarinos.nome, categorias.estilo from apresentacao  inner join equipes 
on equipes.id = apresentacao.id_equipe inner join companhia_danca on companhia_danca.id = equipes.id_companhia inner 
join dancarinos on dancarinos.id_equipe = equipes.id inner join categorias on categorias.id = equipes.id_categoria) 
to 'C:\Users\emanuelle_tomczyk\Documents\apresentacao_geral.csv' delimiter ';' csv header; 


-- EXPORTAÇÃO DANÇARINOS-EQUIPES ONDE ID_DANCARINO FOR >= 15 E <=40
\copy (select * from dancarinos inner join equipes on equipes.id = dancarinos.id_equipe where dancarinos.id >= 15 
and dancarinos.id <= 40 order by dancarinos.id desc) to 'C:\Users\emanuelle_tomczyk\Documents\dancarino_equipe.csv' 
delimiter ';' csv header; 

