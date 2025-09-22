
public class MainMultiplos {

	public class MultiplosWhile {
	    public static void main(String[] args) {
	        int numero = 1;
	        int totalMultiplos = 0;

	        while (numero <= 22) {
	            if (numero % 2 == 0) {
	                System.out.println("Java");
	                totalMultiplos++;
	            }
	            numero++;
	        }

	        System.out.println("\nTotal de múltiplos de 2 encontrados: " + totalMultiplos);
	    }
	}
	
}
