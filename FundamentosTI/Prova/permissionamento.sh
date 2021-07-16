#!/bin/bash
if [ $# -eq 1 ]
then
        ls -l $1
else
        echo "Quantidade de parâmetros errada"
fi
