//Aluna: Giselle Garcia

package main;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculoPessoas {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        DecimalFormat df = new DecimalFormat("#.##");

	        String nomeMaiorPeso = "";
	        double maiorPeso = -1.0;
	        String nomeMaiorAltura = "";
	        double maiorAltura = -1.0;

	        double somaPesos = 0.0;
	        double somaAlturas = 0.0;

	        // Loop para ler os dados das 4 pessoas
	        for (int i = 1; i <= 4; i++) {
	            System.out.println("\n--- Dados da Pessoa " + i + " ---");
	            System.out.print("Nome: ");
	            String nome = scanner.nextLine();
	            System.out.print("Peso (kg): ");
	            double peso = scanner.nextDouble();
	            System.out.print("Altura (m): ");
	            double altura = scanner.nextDouble();
	            scanner.nextLine(); // Consome a linha pendente

	            // Lógica para encontrar o maior peso
	            if (peso > maiorPeso) {
	                maiorPeso = peso;
	                nomeMaiorPeso = nome;
	            }

	            // Lógica para encontrar a maior altura
	            if (altura > maiorAltura) {
	                maiorAltura = altura;
	                nomeMaiorAltura = nome;
	            }

	            // Soma para o cálculo da média
	            somaPesos += peso;
	            somaAlturas += altura;
	        }

	        double mediaPeso = somaPesos / 4;
	        double mediaAltura = somaAlturas / 4;

	        System.out.println("\n--- Resultados ---");
	        System.out.println("Pessoa com maior peso: " + nomeMaiorPeso + " (" + df.format(maiorPeso) + " kg)");
	        System.out.println("Pessoa com maior altura: " + nomeMaiorAltura + " (" + df.format(maiorAltura) + " m)");
	        System.out.println("Média de peso: " + df.format(mediaPeso) + " kg");
	        System.out.println("Média de altura: " + df.format(mediaAltura) + " m");

	        scanner.close();
	    }
	
}

