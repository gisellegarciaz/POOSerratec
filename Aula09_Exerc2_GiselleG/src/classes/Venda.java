package classes;

import java.time.LocalDate;

public class Venda implements FinalizarVenda {
    private Produto produto;
    private LocalDate dataDaCompra;
    private int quantidade;
    private double totalVenda;

    public Venda(Produto produto, LocalDate dataDaCompra, int quantidade) {
        this.produto = produto;
        this.dataDaCompra = dataDaCompra;
        this.quantidade = quantidade;
        this.totalVenda = calcularVenda();
    }
    
    @Override
    public double calcularVenda() {
        return this.produto.getValor() * this.quantidade;
    }
    
    public double getTotalVenda() {
        return this.totalVenda;
    }
}

