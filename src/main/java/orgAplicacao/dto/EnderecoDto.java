package orgAplicacao.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EnderecoDto {

        private String cep;
        private String logradouro;
        private String complemento;
        private String bairro;
        private String localidade;
        private String uf;
        private String ibge;
        private String gia;
        private String ddd;
        private String siafi;


        //get and set Cep
        public String getCep() {
            return cep;
        }
        public void setCep(String cep) {
            this.cep = cep;
        }
    
        //get and set Logradouro
        public String getLogradouro() {
            return logradouro;
        }
        public void setLogradouro(String logradouro) {
            this.logradouro = logradouro;
        }
    
        //get and set complemento
        public String getComplemento() {
            return complemento;
        }
        public void setComplemento(String complemento) {
            this.complemento = complemento;
        }
    
        //get and set Bairoo
        public String getBairro() {
            return bairro;
        }
        public void setBairro(String bairro) {
            this.bairro = bairro;
        }
    
        //get and set Localidade
        public String getLocalidade() {
            return localidade;
        }
        public void setLocalidade(String localidade) {
            this.localidade = localidade;
        }
    
        //get and set UF
        public String getUf() {
            return uf;
        }
        public void setUf(String uf) {
            this.uf = uf;
        }
    
        //get and set IBGE
        public String getIbge() {
            return ibge;
        }
        public void setIbge(String ibge) {
            this.ibge = ibge;
        }
    
        //get and set Gia
        public String getGia() {
            return gia;
        }
        public void setGia(String gia) {
            this.gia = gia;
        }
    
        //get and set DDD
        public String getDdd() {
            return ddd;
        }
        public void setDdd(String ddd) {
            this.ddd = ddd;
        }
    
        //get and set Siafi
        public String getSiafi() {
            return siafi;
        }
        public void setSiafi(String siafi) {
            this.siafi = siafi;
        }

    //to String     
    @Override
    public String toString() {
        return "{" +
            " cep='" + getCep() + "'" +
            ", logradouro='" + getLogradouro() + "'" +
            ", complemento='" + getComplemento() + "'" +
            ", bairro='" + getBairro() + "'" +
            ", localidade='" + getLocalidade() + "'" +
            ", uf='" + getUf() + "'" +
            ", ibge='" + getIbge() + "'" +
            ", gia='" + getGia() + "'" +
            ", ddd='" + getDdd() + "'" +
            ", siafi='" + getSiafi() + "'" +
            "}";
    }
        
}
