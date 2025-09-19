#!/bin/bash
echo "Compilando o projeto..."
mkdir -p out
javac -cp ".:lib/gson-2.10.1.jar" -d out src/*.java
if [ $? -ne 0 ]; then
    echo "Erro na compilação."
    exit 1
fi
echo "Compilação concluída com sucesso!"
