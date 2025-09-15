package Main;

import Classes.EmiteSom; // Importe da interface
import Classes.Animal; // Importe classe pai

import Classes.Pintinho; 
import Classes.Galinha;
import Classes.Galo;
import Classes.Cachorro;
import Classes.Gato;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	
	public static void main(String[] args) {
		
		int i, j, k;
		
		List<EmiteSom> animais = new ArrayList<>();

	        animais.add(new Pintinho());
	        animais.add(new Galo());
	        animais.add(new Galinha());
	        animais.add(new Cachorro());
	        animais.add(new Gato());
	        
	     // Round pintinho
	        for (i = 0; i < 2; i++) {
	            System.out.println("Lá em casa tinha um " + ((Pintinho) animais.get(0)).getAnimal());
	        }
	        for (i = 0; i < 6; i++) {
	            animais.get(0).fazerSom();
	        }
	       
	        
	     // Loop principal para as outras estrofes (Galo, Galinha, etc.)
	        for (i = 1; i < animais.size(); i++) {

	            // Imprime a estrofe inicial "Lá em casa tinha..."
	            System.out.println("Lá em casa tinha um " + ((Animal) animais.get(i)).getAnimal());
	            System.out.println("Lá em casa tinha um " + ((Animal) animais.get(i)).getAnimal());
	            
	            // Loop para imprimir os sons de forma cumulativa, do animal atual para trás
	            for (j = i; j > 0; j--) {
	                animais.get(j).fazerSom();
	            }

	            // Loop para repetir o som do Pintinho 4 vezes
	            for (k = 0; k < 4; k++) {
	                animais.get(0).fazerSom();
	            }
	        }    
	       
	        
	        
	        
	        
	        
	        
	       
     
	        
	        
	/*
	// Estrofe do Pintinho (inicio)
	        for (int i = 0; i < 2; i++) {
	            System.out.println("Lá em casa tinha um " + ((Pintinho) animais.get(0)).getAnimal());
	        }
	
    // Pintinho piu 6 vezes
	        Pintinho pintinho = new Pintinho();

	        for (int i = 0; i < 6; i++) {
	            pintinho.fazerSom();
	        }
	 
	// Estrofe do galo
	        for (int i = 0; i < 2; i++) {
	            System.out.println("Lá em casa tinha um " + ((Galo) animais.get(1)).getAnimal());
	        }             
	 
	// Pintinho piu 5 vezes
	        for (int i = 0; i < 5; i++) {
	            pintinho.fazerSom();
	        }    
	        
	//Estrofe galinha
	        for (int i = 0; i < 2; i++) {
	            System.out.println("Lá em casa tinha um " + ((Galinha) animais.get(2)).getAnimal());
	        }  
	        
	// Pintinho piu 4 vezes
	        for (int i = 0; i < 4; i++) {
	            pintinho.fazerSom();
	        }    
	*/       
	        
	        
	}
}