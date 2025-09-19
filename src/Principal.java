import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultaCEP consultaCEP = new ConsultaCEP();
        
        int opcao = 0;
        while (opcao != 2) {
            exibirMenu();
            System.out.print("\nDigite a opção desejada: ");
            
            try {
                if (!scanner.hasNextLine()) {
                    System.out.println("\nNenhuma entrada disponível. Encerrando...");
                    break;
                }
                
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    System.out.println("\nPor favor, digite uma opção válida.");
                    continue;
                }
                
                try {
                    opcao = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("\nPor favor, digite apenas números para a opção do menu.");
                    continue;
                }
                
                switch (opcao) {
                    case 1:
                        buscarEndereco(consultaCEP, scanner);
                        break;
                    case 2:
                        System.out.println("\nSaindo do sistema...");
                        break;
                    default:
                        System.out.println("\nOpção inválida! Tente novamente.");
                }
                
                // Não é mais necessário esperar por Enter aqui
                
            } catch (Exception e) {
                System.out.println("\nOcorreu um erro inesperado: " + e.getMessage());
                break; // Encerra o loop em caso de erro inesperado
            }
        }
        
        scanner.close();
    }
    
    private static void exibirMenu() {
        System.out.println("""
                
                ************************************
                Bem-vindo ao Buscador de CEP
                ************************************
                
                1 - Buscar endereço por CEP
                2 - Sair
                
                ************************************
                """);
    }
    
    private static void buscarEndereco(ConsultaCEP consultaCEP, Scanner scanner) {

        try {
            System.out.print("\nDigite o CEP (apenas números): ");
            String cep = scanner.nextLine().trim();
            
            if (cep.isEmpty()) {
                System.out.println("\nCEP não pode estar vazio!");
                return;
            }
            
            Endereco endereco = consultaCEP.buscaEndereco(cep);
            System.out.println("\nEndereço encontrado:");
            System.out.println("CEP: " + endereco.cep());
            System.out.println("Logradouro: " + endereco.logradouro());
            System.out.println("Complemento: " + (endereco.complemento() != null && !endereco.complemento().isEmpty() ? endereco.complemento() : "Nenhum"));
            System.out.println("Bairro: " + endereco.bairro());
            System.out.println("Cidade: " + endereco.localidade());
            System.out.println("UF: " + endereco.uf());
            
        } catch (CepInvalidoException e) {
            System.out.println("\nErro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("\nErro ao processar o CEP: " + e.getMessage());
        }
    }
}
