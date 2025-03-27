package orgAplicacao.servico;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import orgAplicacao.dto.EnderecoDto;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ApiServico {

    EnderecoDto enderecoDto = new EnderecoDto();

    public EnderecoDto getEndereco(String cep) throws IOException, InterruptedException{
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://viacep.com.br/ws/"+cep+ "/json/")).build();
                

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

             // teste da resposta da api 
             System.out.println("Resposta da API: " + response.body());

            ObjectMapper mapper = new ObjectMapper();
            enderecoDto = mapper.readValue(response.body(), EnderecoDto.class);

        }catch(Exception e){
                System.out.println("Erro ao buscar endereco" +e.getMessage());
                
        }

        return enderecoDto;
    }

}
