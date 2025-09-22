package classes;

public class AtletaProfissional extends Maratona {
	
    private double peso;

    public AtletaProfissional(String nome, String sexo, int idade, double altura, double peso) {
        super(nome, sexo, idade, altura);
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString() + ", Peso: " + this.peso;
    }
    
    // Método getter para peso
    public double getPeso() {
        return peso;
    }
}