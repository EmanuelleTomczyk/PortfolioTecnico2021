#!/bin/bash 
info=$(ls -ld $1)
permr=${info:7:1}
permw=${info:8:1}
permx=${info:9:1}

if [[ $permr == "r" ]] 
then 
	echo "O arquivo tem permissão de leitura"
else 
	echo "O arquivo não tem permissçao de leitura"
fi 

if [[ $permw == "w" ]]
then 
	echo "O arquivo tem permissão de escrita"
else 
	echo "O arquivo não tem permissão de escrita"
fi 

if [[ $permx == "x" ]] 
then 
	echo "O arquivo tem permissão de execução"
else 
	echo "O arquivo não tem permissão de execução"
fi 

