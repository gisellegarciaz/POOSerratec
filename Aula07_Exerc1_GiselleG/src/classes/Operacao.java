package classes;

import java.text.DecimalFormat;

public class Operacao {
	
    private String tipo;
    private double valorOperacao;
    private Livro livro;

    // Construtor
    public Operacao(String tipo, Livro livro) {
        this.tipo = tipo;
        this.livro = livro;
    }

    // Método para vender um livro
    public void venderLivro() {
        // Valor do livro + 9% de imposto
        this.valorOperacao = this.livro.getValor() * 1.09;
    }

    // Método para emprestar um livro
    public void emprestarLivro() {
        // 2% do valor do livro + taxa de empréstimo (2.8)
        this.valorOperacao = (this.livro.getValor() * 0.02) + 2.8;
    }

    // Getters e Setters
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public double getValorOperacao() { return valorOperacao; }
    public void setValorOperacao(double valorOperacao) { this.valorOperacao = valorOperacao; }
    public Livro getLivro() { return livro; }
    public void setLivro(Livro livro) { this.livro = livro; }

    // Método toString()
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");
        return "\nTipo: " + tipo + " | "
               + df.format(valorOperacao);
              
    }
}

