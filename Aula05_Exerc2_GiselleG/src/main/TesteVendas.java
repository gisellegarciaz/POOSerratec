
// Giselle P A Garcia

package main;

import java.util.Scanner;
import classes.Fixo;
import java.text.DecimalFormat;

public class TesteVendas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");
        
        // Instanciando os vendedores fixos
        Fixo vendedor1 = new Fixo("Joana", "111.111.111-11", 2000.0, 0.075);
        Fixo vendedor2 = new Fixo("Maria", "222.222.222-22", 1800.0, 0.11);
        
        String encerrar = "N";
        double totalVendido = 0;

        do {
            
        	System.out.println("\n                  ⢀⣀⣀⣀⣀⣀⣀⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⣀⣀⣀⣀⣀⣀⡀⠀⠀\n"
        			+ "        	⠀⠀⢠⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⡄⠀⠀\n"
        			+ "        	⠀⠀⣿⣿⣿⣿⣿⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⢹⣿⣿⣿⣿⡟⣿⣿⣿⣿⣿⠀⠀\n"
        			+ "        	⠀⠀⣿⣿⣿⣿⡟⢸⣿⣿⣿⣿⢹⣿⣿⣿⣿⡘⣿⣿⣿⣿⡇⢻⣿⣿⣿⣿⠀⠀\n"
        			+ "        	⠀⢀⣛⣛⣛⣛⠃⣛⣛⣛⣛⡋⠈⣛⣛⣛⣛⠁⢛⣛⣛⣛⣛⠘⣛⣛⣛⣛⡀⠀\n"
        			+ "        	⠀⠈⠻⠿⠿⠋⣀⠈⠻⠿⠟⢁⡀⠙⠿⠿⠋⢀⡈⠻⠿⠟⠁⣀⠙⠿⠿⠟⠁⠀\n"
        			+ "        	⠀⢸⣷⣦⣶⣿⣿⣿⣶⣤⣶⣿⣿⣷⣦⣴⣾⣿⣿⣶⣤⣶⣿⣿⣿⣶⣴⣾⡇⠀\n"
        			+ "        	⠀⢸⣿⡏⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⣉⡉⢹⣿⠉⣉⣉⣉⣉⣉⢹⣿⡇⠀\n"
        			+ "        	⠀⢸⣿⡇⣿⠉⢉⣩⣭⣽⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⠀⣿⣿⣿⣿⣿⢸⣿⡇⠀\n"
        			+ "        	⠀⢸⣿⡇⣿⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⠀⠿⠿⠿⠿⠿⢸⣿⡇⠀\n"
        			+ "        	⠀⢸⣿⡇⣿⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⢸⣿⠀⠶⠶⠶⠶⠶⢸⣿⡇⠀\n"
        			+ "        	⠀⢸⣿⡇⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⢸⣿⠀⣶⣶⣶⣶⣶⢸⣿⡇⠀\n"
        			+ "        	⠀⢸⣿⣷⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣾⣿⠀⣿⣿⣿⣿⣿⢸⣿⡇⠀\n"
        			+ "        	⠀⠈⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠀⠉⠉⠉⠉⠉⠈⠉⠁⠀\n");
        	System.out.println("\n                  ------ GISELLE'S STORE ------\n");
        	System.out.println("\n                 ------ Sistema de Vendas ------\n");
        	System.out.println("\nVendedoras: ");
        	System.out.println("1 - " + vendedor1.getNome());
            System.out.println("2 - " + vendedor2.getNome());
            System.out.print("\nQuem fez o atendimento? ");
            
            int escolha = scanner.nextInt();
            System.out.print("Digite o valor da venda: ");
            double valorVenda = scanner.nextDouble();
            scanner.nextLine(); // Consome a quebra de linha

            switch (escolha) {
                case 1:
                    vendedor1.calcularSalario(valorVenda);
                    break;
                case 2:
                    vendedor2.calcularSalario(valorVenda);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            totalVendido += valorVenda;
            
            System.out.print("Deseja encerrar o programa? (S/N) ");
            encerrar = scanner.nextLine();

        } while (!encerrar.equalsIgnoreCase("S"));

        System.out.println("\n--- Salário dos Vendedores ---\n");
        System.out.println("Nome:" + vendedor1.getNome());
        System.out.println("Salário Bruto: " + df.format(vendedor1.getSalarioBruto()));
        System.out.println("\nNome:" + vendedor2.getNome());
        System.out.println("Salário Bruto: " + df.format(vendedor2.getSalarioBruto()));
        
        System.out.println("\n--- Total Vendido ---");
        System.out.println(df.format(totalVendido));
        
        scanner.close();
    }
}

