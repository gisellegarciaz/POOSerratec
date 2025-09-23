import java.util.InputMismatchException;
import java.util.Scanner;

public class LerNumero {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");

        try {
            int numero = scanner.nextInt();
            System.out.println("\nSucesso! O número '" + numero + "' digitado é valido!");
        } catch (InputMismatchException e) {
            System.out.println(" ! Falha ao ler o número. O número informado não é inteiro.");
        } finally {
            scanner.close();
        }
    }
}