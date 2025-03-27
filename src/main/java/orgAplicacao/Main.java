package orgAplicacao;

import java.io.IOException;

import orgAplicacao.dto.EnderecoDto;
import orgAplicacao.servico.ApiServico;

public class Main {

public static void main(String[] args){

    ApiServico apiServico = new ApiServico();

    try{
        //Cep
       EnderecoDto enderecoDto = apiServico.getEndereco("72410239");
       System.out.println(enderecoDto.getLogradouro());
    }
    
    catch(IOException e){
        throw new RuntimeException(e);
    }catch(InterruptedException e){
        throw new RuntimeException(e);
    }


}

}
