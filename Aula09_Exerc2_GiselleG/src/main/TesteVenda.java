package main;

import classes.Venda;
import classes.Produto;
import classes.Categoria;

import java.text.DecimalFormat;
import java.time.LocalDate;


public class TesteVenda {
    public static void main(String[] args) {
        
        Produto tv = new Produto(1, "Tv", 3500.0, Categoria.ELETRONICO);
        Produto pneu = new Produto(2, "Pneu", 800.0, Categoria.AUTOMOTIVO);
        Produto celular = new Produto(3, "Celular", 6500.0, Categoria.ELETRONICO);

        
        Venda vendaTv = new Venda(tv, LocalDate.now(), 1);
        Venda vendaPneu = new Venda(pneu, LocalDate.now(), 1);
        Venda vendaCelular = new Venda(celular, LocalDate.now(), 1);

        double totalGeral = 0;
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");

        
        System.out.println("\n_|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_   \n"
        		+ " |       |       |       |       |       |       |       |       |    \n"
        		+ "    _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|\n"
        		+ "     |       |       |       |       |       |       |       |       |\n"
        		+ "_|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_   \n"
        		+ " |       |       |       |       |       |       |       |       |    \n"
        		+ "    _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|\n"
        		+ "     |       |       |       |       |       |       |       |       |\n");
        System.out.println("\n                      GISELLE TEMTUDO LOJAS LTDA.                 \n\n");
        
        		
        System.out.println("Total por Item: \n");
        System.out.println("TV - " + df.format(vendaTv.getTotalVenda()));
        totalGeral += vendaTv.getTotalVenda();

        System.out.println("Pneu - " + df.format(vendaPneu.getTotalVenda()));
        totalGeral += vendaPneu.getTotalVenda();

        System.out.println("iPhone - " + df.format(vendaCelular.getTotalVenda()));
        totalGeral += vendaCelular.getTotalVenda();

        System.out.println("\n--------------------------------");
        System.out.println("\nTotal Geral Venda: " + df.format(totalGeral));
        
        System.out.println("\n\n_|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_   \n"
        		+ " |       |       |       |       |       |       |       |       |    \n"
        		+ "    _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|\n"
        		+ "     |       |       |       |       |       |       |       |       |\n"
        		+ "_|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_   \n"
        		+ " |       |       |       |       |       |       |       |       |    \n"
        		+ "    _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|_     _|\n"
        		+ "     |       |       |       |       |       |       |       |       |\n");
    }
}



