package classes;

import java.time.LocalDate;

public abstract class Veiculo implements Oficina {
	protected String marca;
	protected String modelo;
    protected double valorCobrado;
    protected LocalDate dataConserto;
    protected Proprietario proprietario;

    public Veiculo(String marca, String modelo, LocalDate dataConserto, Proprietario proprietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.dataConserto = dataConserto;
        this.proprietario = proprietario;
        this.valorCobrado = 0.0;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public double getValorCobrado() {
        return valorCobrado;
    }

    @Override
    public String toString() {
        return "Veiculo" +
               "modelo= " + modelo + "\n" +
               "dataConserto=" + dataConserto +
               "proprietario=" + proprietario.getNome() +
               "valorCobrado=" + valorCobrado;
            
    }
}