#Autora: Emanuelle L. Tomczyk 
#Descrição: Esse comando imprime os dados do arquivo Lista_Frutas sem os números e em ordem alfabética. 

#!/bin/bash 
cut -d" " -f2,3 Lista_Frutas | sort 
