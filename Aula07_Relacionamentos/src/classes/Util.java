package classes;
import java.util.Scanner;


public class Util {

	    // Método para ler uma String
	    public static String informarString(String msg) {
	        Scanner input = new Scanner(System.in);
	        System.out.println(msg);
	        String texto = input.nextLine();
	        return texto;
	    }

	    // Método para ler um caractere
	    public static char informarChar(String msg) {
	        Scanner input = new Scanner(System.in);
	        System.out.println(msg);
	        char texto = input.nextLine().charAt(0);
	        return texto;
	    }

	    // Método para ler um número inteiro (corrigido)
	    public static int informarInt(String msg) {
	        Scanner input = new Scanner(System.in);
	        System.out.println(msg);
	        String texto = input.nextLine();
	        int numero = Integer.parseInt(texto);
	        return numero;
	    }
	}
}

//usa informarChar e etc para trocar onde tem scanner no main. Tira o scanner e onde tem input coloca Util.informarString(...)