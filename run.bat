@echo off
echo Executando o Buscador de CEP...
java -cp "out;lib/gson-2.10.1.jar" Principal
if %errorlevel% neq 0 (
    echo Ocorreu um erro ao executar o programa.
    pause
    exit /b %errorlevel%
)
