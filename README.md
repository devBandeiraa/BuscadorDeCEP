# 🔍 Buscador de CEP

![Java](https://img.shields.io/badge/Java-17%2B-orange)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

Um aplicativo de linha de comando (CLI) em Java para buscar informações de endereço a partir de um CEP, utilizando a API do ViaCEP.

## 🚀 Funcionalidades

- 🔎 Busca de endereço por CEP
- ✅ Validação de CEP
- 🖥️ Interface amigável via terminal
- 🛡️ Tratamento de erros robusto
- 📦 Fácil de usar e configurar

## 🛠️ Pré-requisitos

- Java 17 ou superior
- Conexão com a internet (para acessar a API do ViaCEP)
- Gson 2.10.1 (incluído no projeto)

## 📦 Estrutura do Projeto

```
BuscadorDeCEP/
├── lib/
│   └── gson-2.10.1.jar
├── src/
│   ├── CepInvalidoException.java
│   ├── ConsultaCEP.java
│   ├── Endereco.java
│   └── Principal.java
└── README.md
```

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/BuscadorDeCEP.git
   cd BuscadorDeCEP
   ```

2. Compile o projeto:
   ```bash
   javac -cp ".;lib/gson-2.10.1.jar" -d out src/*.java
   ```

3. Execute o programa:
   ```bash
   java -cp "out;lib/gson-2.10.1.jar" Principal
   ```

## 🎯 Como Usar

1. Ao iniciar o programa, você verá um menu com as seguintes opções:
   - 1 - Buscar endereço por CEP
   - 2 - Sair

2. Digite `1` e pressione Enter para buscar um endereço.

3. Informe o CEP (apenas números) e pressione Enter.

4. O programa exibirá as informações do endereço correspondente ou uma mensagem de erro, caso o CEP seja inválido.

5. Para sair do programa, digite `2` no menu principal.

## 🧪 Testando

Você pode testar com os seguintes CEPs de exemplo:
- 01001000 (São Paulo/SP)
- 20040000 (Rio de Janeiro/RJ)
- 70002900 (Brasília/DF)


## 📧 Contato

Jhordan Bandeira - (15) 99250-9779 - jhordanbandeira1@gmail.com

