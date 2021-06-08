#Autora: Emanuelle L. Tomczyk 
#Descrição: Esse comando é capaz de determinar as pessoas que já possuem idade para votar. 

#bin/bash
echo "Qual é o ano atual?" 
read ano_atual
echo "Qual ano que você nasceu?" 
read ano_nasc

ano_18=$((ano_atual-18))
ano_16=$((ano_atual-16))

if [ $ano_nasc -le $ano_18 ]
then 
      echo "Você deve votar!"
      
elif [ $ano_nasc -le $ano_16 ] 
      echo "Você pode votar!"

else 
      echo "Você não pode votar!" 
fi
