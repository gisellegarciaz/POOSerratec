package main;

import java.util.Scanner;

import java.time.LocalDate;
import classes.Bebidas;
import classes.Sanduiche;
import classes.Pedido;

public class FazendoPedido {

	public static void main(String[] args) {
	    
		Scanner scanner = new Scanner(System.in);

        // Imprime o cardápio
        Pedido.imprimirCardapio();

        // 2. Ler a escolha do usuário para o sanduíche
        Sanduiche sanduicheEscolhido = null;
        while (sanduicheEscolhido == null) {
            System.out.print("\nEscolha o seu sanduíche (digite o nome): ");
            String escolhaSanduicheStr = scanner.nextLine().toUpperCase();
            try {
                sanduicheEscolhido = Sanduiche.valueOf(escolhaSanduicheStr);
            } catch (IllegalArgumentException e) {
                System.out.println("Opção inválida. Por favor, digite um sanduíche válido do cardápio.");
            }
        }

        // O usuário escolhe
        Bebidas bebidaEscolhida = null;
        while (bebidaEscolhida == null) {
            System.out.print("Escolha a sua bebida (digite o nome): ");
            String escolhaBebidaStr = scanner.nextLine().toUpperCase();
            try {
                bebidaEscolhida = Bebidas.valueOf(escolhaBebidaStr);
            } catch (IllegalArgumentException e) {
                System.out.println("Opção inválida. Por favor, digite uma bebida válida do cardápio.");
            }
        }

        // Cria o pedido
        LocalDate dataHoje = LocalDate.now();
        Pedido pedidoDoUsuario = new Pedido(dataHoje, bebidaEscolhida, sanduicheEscolhido);

        // Exibe o comprovante
        pedidoDoUsuario.imprimirDetalhes();
        
        //Informa o cashback
        double valorCashback = pedidoDoUsuario.imprimirDetalhesComCashback();
        pedidoDoUsuario.imprimirDetalhesComCashback();
        
        System.out.printf("\nParabéns! Sua compra gerou um cashback de: R$ %.2f%n", valorCashback);
        System.out.printf("\nGiselle Lanches agradece a sua compra!");
        scanner.close();
    }
}	
		

	        /* Imprime o cardápio
	        Pedido.imprimirCardapio();

	        // Gera um pedido
	        Bebidas bebidaEscolhida = Bebidas.REFRI;
	        Sanduiche sanduicheEscolhido = Sanduiche.CARNE;
	        LocalDate dataHoje = LocalDate.now();

	        Pedido pedido1 = new Pedido(dataHoje, bebidaEscolhida, sanduicheEscolhido);


	        // Mostra o resultado
	        double totalPedido = pedido1.calcularTotal();

	        System.out.println("\n--- Resumo da Compra ---");
	        System.out.println("Você pediu: " + sanduicheEscolhido.name() + " e " + bebidaEscolhida.name());
	        System.out.printf("Total a pagar: R$ %.2f%n", totalPedido);
	        
	       
	    	} */

	

