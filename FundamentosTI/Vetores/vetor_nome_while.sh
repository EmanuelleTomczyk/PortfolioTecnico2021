# Autor: Emanuelle L. Tomczyk 
# Descrição: Vetor utilizando while.

#!/bin/bash 
vetor[0]="Ísis"
vetor[1]="Lívia"
vetor[2]="Mabel"

tam_vetor=${#vetor[@]}

nome=0
while [ $nome -lt $tam_vetor ] 
do
      echo "Oi, eu sou ${vetor[nome]}"
      nome=$((nome+1))
done
