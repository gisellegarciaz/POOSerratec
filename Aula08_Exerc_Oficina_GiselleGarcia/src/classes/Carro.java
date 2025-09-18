package classes;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Carro extends Veiculo {
    private String categoria;

    public Carro(String marca, String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
        super(marca, modelo, dataConserto, proprietario);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }
    
    
    public String getMarca() {
        return marca;
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
        if (dataConserto.getDayOfWeek() == DayOfWeek.SATURDAY) {
            valor -= 50.0;
        }
        this.valorCobrado += valor;
        return valor;
    }

    @Override
    public double revisao() {
        double valor = Servico.REVISAO.getPreco();
        if (dataConserto.getMonth() == Month.AUGUST) {
            valor *= 0.90;
        }
        this.valorCobrado += valor;
        return valor;
    }

    @Override
    public String toString() {
        return "\n\tMarca: " + marca + 
               "\n\tModelo: " + modelo +
               "\n\tCategoria: " + categoria + 
               "\n\tData do Conserto: " + dataConserto +
               "\n\tValor total: " + valorCobrado + "\n";
    }

//	public double Servico() {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}