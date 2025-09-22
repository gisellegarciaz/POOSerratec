package classes;

public class Pais {
	
    private String nome;
    private String sigla;

    // Construtor
    public Pais(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    // Getters
    public String getNome() { return nome; }
    public String getSigla() { return sigla; }
}

