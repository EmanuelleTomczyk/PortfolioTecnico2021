#!/bin/bash
echo "Digite 2 notas"
read x
read y
i=7

media=$(bc <<< "scale=2;($x+$y)/2")

if [[ $media > $i ]]
then
        echo "Sua média é: $media, você não está de recuperação"

else
        echo "Sua média é: $media, você está de recuperação"
fi
