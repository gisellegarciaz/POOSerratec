public class MultiplosDeDois {
	
    public static void main(String[] args) {
        int totalMultiplos = 0;

        for (int i = 1; i <= 22; i++) {
            if (i % 2 == 0) {
                System.out.println("Java");
                totalMultiplos++;
            }
        }

        System.out.println("\nTotal de múltiplos de 2 encontrados: " + totalMultiplos);
    }
}