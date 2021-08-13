#!/bin/bash 
echo "Esses usuários não são humanos"
cut -d : -f1 /etc/passwd | head -n39 
