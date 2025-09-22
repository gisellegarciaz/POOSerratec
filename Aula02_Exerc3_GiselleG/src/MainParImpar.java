
public class MainParImpar {

	    public static void main(String[] args) {
	        int numero = 0;
	        int contadorPares = 0;
	        int contadorImpares = 0;

	        while (numero <= 30) {
	            // Verifica se o número é par com o modulo
	            if (numero % 2 == 0) {
	                contadorPares++;
	            } else {
	                contadorImpares++;
	            }
	            numero++;
	        }

	        System.out.println("Quantidade de números pares: " + contadorPares);
	        System.out.println("Quantidade de números ímpares: " + contadorImpares);
	    }
}
