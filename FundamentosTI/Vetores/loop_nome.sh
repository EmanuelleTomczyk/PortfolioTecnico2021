# Autora: Emanuelle L. Tomczyk 
# Descrição: Código utilizando loops com código de parada. Solicita nomes que serão armazenados em um vetor.

#!/bin/bash
cod_parada="exit"
nome=""
echo "O código de parada é: exit"
while [[ $nome != $cod_parada ]] 
do 
      echo "Escreva um nome:"
      read nome 
      if [[ $nome != $cod_parada ]] 
      then 
            vetor[$i]=$nome
            i=$((i+1))
            echo "O nome escolhido foi $nome
__________________________________"
       fi 
done 
echo 
echo "Valores do vetor: ${#vetor[@]}
