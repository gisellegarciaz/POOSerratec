package classes;

public enum Servico {

	TROCA_OLEO(150.0),
    LAVAGEM_SIMPLES(50.0),
    LAVAGEM_ECOLOGICA(80.0),
    REVISAO(200.0);

    private double preco;

    Servico(double preco) {
        this.preco = preco;
    }

	public double getPreco() {
		return preco;
	}

	/*public void setPreco(double preco) {
		this.preco = preco;
	}*/
	
	
	
}
