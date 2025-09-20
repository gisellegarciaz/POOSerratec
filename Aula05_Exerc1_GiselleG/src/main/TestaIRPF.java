// Aluna: Giselle Garcia

package main;

import java.text.DecimalFormat;
import classes.PessoaFisica;
import classes.PessoaJuridica;


public class TestaIRPF {
	
    public static void main(String[] args) {
        // Criando os objetos
        PessoaFisica pessoaFisica = new PessoaFisica("Giselle Garcia", 50000.0, "111.222.333-44", "987654321");
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Giselle Dev & Design Services LTDA", 150000.0, "99.888.777/0001-66", "12345");

        DecimalFormat df = new DecimalFormat("R$ #,##0.00");

        // Pessoa Física
        System.out.println("--- Dados e IR de Pessoa Física ---");
        System.out.println("\nNome: " + pessoaFisica.getNome());
        System.out.println("CPF: " + pessoaFisica.getCpf());
        System.out.println("Rendimentos: " + df.format(pessoaFisica.getRendimentos()));
        System.out.println("Valor a pagar de IR (12%): " + df.format(pessoaFisica.calculoIR()));
        System.out.println("\n------------------------------------\n");

        // Pessoa Jurídica
        System.out.println("--- Dados e IR de Pessoa Jurídica ---");
        System.out.println("Nome: " + pessoaJuridica.getNome());
        System.out.println("CNPJ: " + pessoaJuridica.getCnpj());
        System.out.println("Rendimentos: " + df.format(pessoaJuridica.getRendimentos()));
        System.out.println("Valor a pagar de IR (15%): " + df.format(pessoaJuridica.calculoIR()));
        System.out.println("------------------------------------");
    }
}