package classes;

public enum Bebidas {

	REFRI("Refrigerante", 5.50),
    SUCO("Suco Natural", 7.00),
    AGUA("Água Mineral", 3.00),
    ICETEA("Chá Gelado", 5.00);

    private String tipo;
    private double valor;

    Bebidas(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
	
}