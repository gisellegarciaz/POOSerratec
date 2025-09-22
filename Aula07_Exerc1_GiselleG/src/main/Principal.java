package main;

import classes.Livro;
import classes.Operacao;

public class Principal {

    public static void main(String[] args) {
        
    	System.out.println("\n\n            .--.                   .---.\n"
    			+ "        .---|__|           .-.     |~~~|\n"
    			+ "     .--|===|--|_          |_|     |~~~|--.\n"
    			+ "     |  |===|  |'\\     .---!~|  .--|   |--|\n"
    			+ "     |MA|   |  |.'\\    |===| |--|GI|   |  |\n"
    			+ "     |TE|   |  |\\.'\\   |   | |__|SE|   |  |\n"
    			+ "     |MA|   |  | \\  \\  |===| |==|LL|   |  |\n"
    			+ "     |TI|   |__|  \\.'\\ |   |_|__|E |~~~|__|\n"
    			+ "     |CA|===|--|   \\.'\\|===|~|--|--|~~~|--|\n"
    			+ "     ^--^---'--^    `-'`---^-^--^--^---'--'");
    	
    	System.out.println("\n==========    GISELLE'S BOOKSTORE     ==========\n\n");
    	
    	
        // 1. Instanciando um livro
        Livro livro1 = new Livro("J.R.R. Tolkien", "O Senhor dos Anéis", 75.50);
        System.out.println(livro1);
        System.out.println("-------------------------------------------------");
        
        // 2. Realizando uma operação de venda
        Operacao venda = new Operacao("Venda", livro1);
        venda.venderLivro(); // Executa o cálculo da venda
        System.out.println("\nDetalhes da Operação de Venda: ");
        System.out.println(venda); // Exibe os detalhes da operação
        System.out.println("\n-------------------------------------------------");
        
        // 3. Realizando uma operação de empréstimo
        Operacao emprestimo = new Operacao("Empréstimo", livro1);
        emprestimo.emprestarLivro(); // Executa o cálculo do empréstimo
        System.out.println("\nDetalhes da Operação de Empréstimo: ");
        System.out.println(emprestimo);
    }
}

