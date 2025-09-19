
//Aluna: Giselle P A Garcia

package classes;

import java.text.DecimalFormat;

public class Funcionario {

private String nome;
    private double salario;

    
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    
    // 11% do salário (INSS)
    public double calcularInss() {
        return this.salario * 0.11;
    }

    // 6% do salário (Vale Transporte)
    public double calcularValeTransporte() {
        return this.salario * 0.06;
    }

    
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}