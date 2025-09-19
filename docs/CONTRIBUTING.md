# 👋 Contribuindo para o Buscador de CEP

Obrigado pelo seu interesse em contribuir para o Buscador de CEP! Este guia irá ajudá-lo a começar a contribuir com o projeto.

## 📋 Pré-requisitos

- Java 17 ou superior
- Git
- Uma conta no GitHub

## 🛠️ Configuração do Ambiente

1. Faça um fork do repositório
2. Clone o repositório para sua máquina local:
   ```bash
   git clone https://github.com/seu-usuario/BuscadorDeCEP.git
   cd BuscadorDeCEP
   ```

3. Importe o projeto para sua IDE preferida (IntelliJ IDEA, Eclipse, etc.)

## 🔧 Estrutura do Código

- `src/`: Contém todo o código-fonte do projeto
  - `CepInvalidoException.java`: Exceção personalizada para CEPs inválidos
  - `ConsultaCEP.java`: Classe responsável por fazer a consulta à API do ViaCEP
  - `Endereco.java`: Classe que representa um endereço
  - `Principal.java`: Classe principal com a interface de linha de comando
- `lib/`: Contém as dependências do projeto (Gson)
- `docs/`: Documentação adicional

## 🚀 Como Contribuir

1. Crie uma branch para sua feature/correção:
   ```bash
   git checkout -b feature/nova-feature
   ```

2. Faça commit das suas alterações:
   ```bash
   git commit -m "Adiciona nova funcionalidade"
   ```

3. Faça push para o repositório remoto:
   ```bash
   git push origin feature/nova-feature
   ```

4. Abra um Pull Request no GitHub

## 📝 Padrões de Código

- Siga as convenções de código do Java
- Use nomes descritivos para variáveis e métodos
- Comente o código quando necessário
- Mantenha as classes e métodos pequenos e focados em uma única responsabilidade

## 🧪 Testes

Antes de enviar um Pull Request, certifique-se de que:

1. O código está compilando corretamente
2. As alterações não quebram funcionalidades existentes
3. O código está formatado de acordo com as convenções

## 📜 Código de Conduta

Este projeto segue o [Código de Conduta do Contribuidor](CODE_OF_CONDUCT.md). Ao participar, espera-se que você siga este código.

## 📬 Dúvidas?

Se tiver alguma dúvida, sinta-se à vontade para abrir uma issue no repositório.
