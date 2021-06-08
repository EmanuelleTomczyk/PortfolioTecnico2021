#Autora: Emanuelle L. Tomczyk 
#Descrição: Esse comando lê o valor de 15 produtos, imprimindo no final o maior dos preços e a média aritmética dos produtos. 

#!/bin/bash 
soma=0
maior=0
for i in $(seq 1 15) 
do 
      echo "O preço do $iº produto é:"
      read val 
      if [ $val -gt $maior ] 
      then 
            maior=$val 
      fi 
      
      soma=$((soma+i)) 
done 
media=$(bc <<< "scale=2;$soma/15") 
echo "A média dos preços é: $media" 
echo "O maior valor é: $maior" 
