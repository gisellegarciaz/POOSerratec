package main;
import classes.FuncionarioPublico;

public class TesteFuncionario {

    public static void main(String[] args) {

        // Func1
        FuncionarioPublico funcionario1 = new FuncionarioPublico("Giselle", 10500.00, 2018);

        // Func2
        FuncionarioPublico funcionario2 = new FuncionarioPublico("Nairobi", 7200.50, 2020);

        // func3
        FuncionarioPublico funcionario3 = new FuncionarioPublico("Yoshi", 7200.50, 2021);

        // Exibe os atributos
        funcionario1.exibirAtributos();
        funcionario2.exibirAtributos();
        funcionario3.exibirAtributos();
        
    }
}
