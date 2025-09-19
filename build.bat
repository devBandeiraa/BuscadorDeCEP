@echo off
echo Compilando o projeto...
mkdir out 2>nul
javac -cp ".;lib/gson-2.10.1.jar" -d out src/*.java
if %errorlevel% neq 0 (
    echo Erro na compilação.
    pause
    exit /b %errorlevel%
)
echo Compilação concluída com sucesso!
