
// Aluna: Giselle Garcia

package classes;

public class PessoaJuridica extends ImpostoDeRenda {
	
	
    private String cnpj;
    private String inscEstadual;

    // Construtor com todos os atributos
    public PessoaJuridica(String nome, double rendimentos, String cnpj, String inscEstadual) {
        super(nome, rendimentos);
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
    }

    @Override
    public double calculoIR() {
        return this.rendimentos * 0.15; // 15% de desconto
    }
    
    // Getters
    public String getCnpj() {
        return cnpj;
    }

    public String getInscEstadual() {
        return inscEstadual;
    }
}