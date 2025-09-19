package classes;

import java.text.DecimalFormat;

public class Produto {
    private String descricao;
    private double valor;
    private int quantidade;

    // Construtor
    public Produto(String descricao, double valor, int quantidade) {
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    // Método para calcular ICMS (12% do total)
    public double calcularIcms() {
        double total = this.valor * this.quantidade;
        return total * 0.12;
    }

    // Métodos getters
    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    public double getTotal() {
        return this.valor * this.quantidade;
    }
}