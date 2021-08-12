#!/bin/bash
i=0
echo "Os números pares entre 1 a 20 são:"

while ((i < 20))
do
        let i=i+1
        if (($i % 2 == 0))
        then
                echo "$i"
        fi
done
