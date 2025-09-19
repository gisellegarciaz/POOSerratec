
public class Fatorial {

	public static void main(String[] args) {
		
	
	        for (int i = 1; i <= 10; i++) {
	            long fatorial = 1;

	            // Loop interno para calcular o fatorial de 'i'
	            for (int j = 1; j <= i; j++) {
	                fatorial *= j;
	            }
	            System.out.println("O Fatorial de " + i + " é : " + fatorial);
	        }
	 }

}



