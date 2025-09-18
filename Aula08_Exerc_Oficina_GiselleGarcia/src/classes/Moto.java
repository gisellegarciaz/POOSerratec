package classes;

import java.time.LocalDate;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, LocalDate dataConserto, Proprietario proprietario, int cilindradas) {
        super(marca, modelo, dataConserto, proprietario);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public double lavarSimples() {
        double valor = Servico.LAVAGEM_SIMPLES.getPreco();
        this.valorCobrado += valor;
        return valor;
    }
    
   
    public double lavarEcologico() {
        double valor = Servico.LAVAGEM_ECOLOGICA.getPreco();
        this.valorCobrado += valor;
        return valor;
    }
    

    @Override
    public double trocarOleo() {
        double valor = Servico.TROCA_OLEO.getPreco();
        this.valorCobrado += valor;
        return valor;
    }

    @Override
    public double revisao() {
        double valor = Servico.REVISAO.getPreco();
        this.valorCobrado += valor;
        return valor;
    }

    @Override
    public String toString() {
        return "Moto{" +
               "modelo='" + modelo + '\'' +
               ", cilindradas=" + cilindradas +
               ", dataConserto=" + dataConserto +
               ", valorCobrado=" + valorCobrado +
               ", proprietario=" + proprietario.getNome() +
               '}';
    }

}