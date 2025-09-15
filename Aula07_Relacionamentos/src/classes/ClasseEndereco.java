package classes;

public class ClasseEndereco {
    private String rua;
    private String bairro;
    private String cep;
    private ClasseCidade cidade;

    public ClasseEndereco(String rua, String bairro, String cep, ClasseCidade cidade) {
        super();
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public ClasseCidade getCidade() {
        return cidade;
    }

    public void setCidade(ClasseCidade cidade) {
        this.cidade = cidade;
    }
}