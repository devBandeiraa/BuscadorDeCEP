import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCEP {
    
    private void validaCep(String cep) throws CepInvalidoException {
        if (cep == null || cep.trim().isEmpty()) {
            throw new CepInvalidoException("CEP não pode ser vazio!");
        }
        
        // Remove caracteres não numéricos
        String cepNumerico = cep.replaceAll("\\D", "");
        
        if (cepNumerico.length() != 8) {
            throw new CepInvalidoException("CEP deve conter 8 dígitos!");
        }
        
        try {
            Long.parseLong(cepNumerico);
        } catch (NumberFormatException e) {
            throw new CepInvalidoException("CEP deve conter apenas números!");
        }
    }

    public Endereco buscaEndereco(String cep) throws CepInvalidoException {
        try {
            // Valida o formato do CEP
            validaCep(cep);
            
            URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json");
            
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(endereco)
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            
            // Verifica se o CEP existe
            if (response.body().contains("erro")) {
                throw new CepInvalidoException("CEP não encontrado!");
            }
            
            return new Gson().fromJson(response.body(), Endereco.class);
            
        } catch (IOException | InterruptedException e) {
            throw new CepInvalidoException("Erro ao conectar com o serviço de CEP. Verifique sua conexão com a internet.");
        } catch (JsonSyntaxException e) {
            throw new CepInvalidoException("Erro ao processar a resposta do servidor de CEP.");
        } catch (IllegalArgumentException e) {
            throw new CepInvalidoException("Formato de CEP inválido!");
        }
    }
}