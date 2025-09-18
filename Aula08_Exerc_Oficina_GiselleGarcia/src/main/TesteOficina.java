package main;

import java.time.LocalDate;
import java.util.Scanner;

import classes.Carro;
import classes.Menu;
import classes.Proprietario;

public class TesteOficina {
	
    	
	public static void main(String[] args) {
    	
	    Scanner scanner = new Scanner(System.in);
	 
	    
    	System.out.println();
    	Proprietario proprietario = new Proprietario("Giselle Garcia");
    	Carro carro = new Carro("VolksWagen", "Fox Connect 1.6", LocalDate.now(), proprietario, "Hatch");
    	
    	Menu.imprimirRecibo(proprietario, carro);
        
    	
}
}

