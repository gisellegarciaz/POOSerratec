
public class Aula03_Exercicios_NumParesImpares {

public static void main(String[] args) {
        
        // Variaveis
        int contadorPares = 0;
        int contadorImpares = 0;

        // Loop
        for (int i = 0; i <= 30; i++) {
            
            
            if (i % 2 == 0) {
                // Se for par, incrementa o contador de pares
                contadorPares++;
            } else {
                // Se for ímpar, incrementa o contador de ímpares
                contadorImpares++;
            }
        }
        
        // Exibe o resultado final no console
        System.out.println("Quantidade de números pares entre 0 e 30: " + contadorPares);
        System.out.println("Quantidade de números ímpares entre 0 e 30: " + contadorImpares);
    }

}

