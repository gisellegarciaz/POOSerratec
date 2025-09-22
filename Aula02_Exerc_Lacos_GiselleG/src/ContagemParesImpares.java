public class ContagemParesImpares {
	
    public static void main(String[] args) {
        int pares = 0;
        int impares = 0;

        for (int i = 0; i <= 30; i++) {
            if (i % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }
}