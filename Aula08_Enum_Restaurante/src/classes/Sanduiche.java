package classes;

public enum Sanduiche {

    CARNE("Carne, queijo e saladinha", 42.00),
    FRANGO("Frango desfiado com uma lapada de catupiry", 32.50),
    VEGETARIANO("Vegetais Grelhados", 28.00),
    ESPECIAL("Bacon crocante com ovos e muito queijo", 42.00);

    private String tipo;
    private double valor;

    Sanduiche(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}