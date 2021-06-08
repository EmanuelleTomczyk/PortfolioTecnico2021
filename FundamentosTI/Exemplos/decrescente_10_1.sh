#Autora: Emanuelle L. Tomczyk 
#Descrição: Esse algoritmo imprime os números de 1 a 10 em ordem decrescente. 

#!/bin/bash
i=10
while [ $i -ge 1 ] 
do 
      echo " - $i" 
      i=$((i-1))
done 
