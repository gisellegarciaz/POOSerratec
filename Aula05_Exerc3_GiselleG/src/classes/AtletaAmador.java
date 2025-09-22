package classes;

public class AtletaAmador extends Maratona {
    
	private boolean atestado;

    public AtletaAmador(String nome, String sexo, int idade, double altura, boolean atestado) {
        super(nome, sexo, idade, altura);
        this.atestado = atestado;
    }
    

    @Override
    public String toString() {
        return super.toString() + ", Atestado: " + this.atestado;
    }
    
    // Método getter para atestado
    public boolean getAtestado() {
        return atestado;
    }
}