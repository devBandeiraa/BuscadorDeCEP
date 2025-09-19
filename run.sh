#!/bin/bash
echo "Executando o Buscador de CEP..."
java -cp "out:lib/gson-2.10.1.jar" Principal
if [ $? -ne 0 ]; then
    echo "Ocorreu um erro ao executar o programa."
    exit 1
fi
