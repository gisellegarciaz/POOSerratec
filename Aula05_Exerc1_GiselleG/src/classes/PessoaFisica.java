
// Aluna: Giselle Garcia

package classes;

public class PessoaFisica extends ImpostoDeRenda {
	
    private String cpf;
    private String rg;

    // Construtor com todos os atributos
    public PessoaFisica(String nome, double rendimentos, String cpf, String rg) {
        super(nome, rendimentos);
        this.cpf = cpf;
        this.rg = rg;
    }

    @Override
    public double calculoIR() {
        return this.rendimentos * 0.12; // 12% de desconto
    }
    
    // Getters
    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }
}