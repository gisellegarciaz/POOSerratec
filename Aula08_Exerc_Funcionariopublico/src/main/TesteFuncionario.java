package main;
import classes.FuncionarioPublico;

public class TesteFuncionario {

    public static void main(String[] args) {

        // Criar o primeiro objeto FuncionarioPublico
        FuncionarioPublico funcionario1 = new FuncionarioPublico("Giselle", 10500.00, 2018);

        // Criar o segundo objeto FuncionarioPublico
        FuncionarioPublico funcionario2 = new FuncionarioPublico("Nairobi", 7200.50, 2020);

        // Criar o terceiro objeto
        FuncionarioPublico funcionario3 = new FuncionarioPublico("Yoshi", 7200.50, 2021);

        // Exibir os atributos de cada funcionário
        funcionario1.exibirAtributos();
        funcionario2.exibirAtributos();
        funcionario3.exibirAtributos();
        
    }
}
