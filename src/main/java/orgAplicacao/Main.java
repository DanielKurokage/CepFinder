package orgAplicacao;

import java.io.IOException;

import orgAplicacao.dto.EnderecoDto;
import orgAplicacao.servico.ApiServico;

public class Main {

public static void main(String[] args){

    ApiServico apiServico = new ApiServico();

    //=============================================================================CEP============================================================================================

    try{
        //Cep
       EnderecoDto enderecoDto = apiServico.getEndereco("72503607"); //COLOQUE o seu Cep Aqui | Put your Cep Here
       System.out.println(enderecoDto.getLogradouro());
    }
     //=============================================================================CEP============================================================================================
    catch(IOException e){
        throw new RuntimeException(e);
    }catch(InterruptedException e){
        throw new RuntimeException(e);
    }


}

}
