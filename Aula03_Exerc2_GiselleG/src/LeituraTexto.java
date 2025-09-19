import java.util.Scanner;

public class LeituraTexto {

	public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        
        System.out.println("Digite um número inteiro: ");
        int numeroInteiro = scanner.nextInt();

        
        System.out.println("Digite um número real: ");
        double numeroReal = scanner.nextDouble();

        
        scanner.close();

        // Exibindo os dados digitados
        System.out.println("\n--- Dados Digitados ---");
        System.out.println("Olá, " + nome + ", aqui estão seus números: ");
        System.out.println("Número inteiro: " + numeroInteiro);
        System.out.println("Número real: " + numeroReal);
    }
}

