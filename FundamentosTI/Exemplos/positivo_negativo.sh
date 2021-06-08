#Autora: Emanuelle L. Tomczyk 
#Descrição: Esse comando é capaz de detectar se um número é positivo ou negativo. 

#!/bin/bah 
echo "Digite um número"
read x 
if [ $x -lt 0 ] 
then 
      echo "Esse número é negativo"
      
else [ $x -ge 0 ] 
      echo "Esse número é positivo"
fi 
