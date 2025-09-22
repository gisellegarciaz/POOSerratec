package classes;

import java.text.DecimalFormat;

public class Livro {
	
    private String autor;
    private String titulo;
    private double valor;

    // Construtor
    public Livro(String autor, String titulo, double valor) {
        this.autor = autor;
        this.titulo = titulo;
        this.valor = valor;
    }

    // Método de reajuste do valor
    public void reajuste(double percentual) {
        this.valor *= (1 + percentual / 100);
    }
    
    // Getters e Setters
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    // Método toString()
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");
        return "Livro: " + titulo + " | " +
                "Autor: " + autor + " | " +
                
                "Valor: " + df.format(valor) +
                "\n";
    }
}

