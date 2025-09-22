package classes;

public class Maratona {

	    protected String nome;
	    protected String sexo;
	    protected int idade;
	    protected double altura;

	    public Maratona(String nome, String sexo, int idade, double altura) {
	        this.nome = nome;
	        this.sexo = sexo;
	        this.idade = idade;
	        this.altura = altura;
	    }

	    // Getters
	    public String getNome() {
	        return nome;
	    }

	    public int getIdade() {
	        return idade;
	    }

	    public double getAltura() {
	        return altura;
	    }

	    // Método toString()
	    @Override
	    public String toString() {
	        return "Nome: " + this.nome + ", Sexo: " + this.sexo + ", Idade: " + this.idade + ", Altura: " + this.altura;
	    }
	    
	    // Método verificaSituacao()
	    public void verificaSituacao() {
	        if (this.idade > 18 || this.altura >= 1.80) {
	            System.out.println(this.nome + " participará da competição.");
	        } else {
	            System.out.println(this.nome + " não participará da competição.");
	        }
	    }
}
	

