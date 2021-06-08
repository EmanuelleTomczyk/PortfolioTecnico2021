#Autora: Emanuelle L. Tomczyk 
#Descrição: Esse comando é imprime os valores inteiros entre 1 e x. 

#!/bin/bash 
echo "Digite um número."
read x 
if [ $x -gt 0 ] 
then 
      for i in $(seq 1 $x)
      do 
            echo "- $i" 
      done 
else 
      echo "Digite um número maior que 0." 
fi  
