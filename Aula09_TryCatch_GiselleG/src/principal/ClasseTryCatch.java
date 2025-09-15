package principal;

public class ClasseTryCatch {

	public static void main(String[] args) {

        // 1. Inicializa os dois arrays de inteiros
        int[] vetor1 = {1, 2, 3, 4, 5};
        int[] vetor2 = {3, 0, 2};

        // 2. Determina o número de iterações do loop
        // Usamos o comprimento do vetor menor para evitar o erro de 'ArrayIndexOutOfBoundsException'.
        int numIteracoes = Math.min(vetor1.length, vetor2.length);

        System.out.println("Iniciando o processo de divisão...");
        System.out.println("------------------------------------");

        // 3. Loop 'for' para percorrer os arrays e realizar a divisão
        for (int i = 0; i < numIteracoes; i++) {

        	// O bloco 'try' contém o código que pode gerar uma exceção
            try {
                // Tenta realizar a divisão.
                int resultado = vetor1[i] / vetor2[i];
                System.out.printf("Divisão de %d por %d: %d%n", vetor1[i], vetor2[i], resultado);

            // 4. Blocos 'catch' para tratar as exceções
            // Este bloco captura a exceção de divisão por zero.
            } catch (ArithmeticException e) {
                System.out.printf("Erro! Não foi possível dividir %d por %d no índice %d.%n", vetor1[i], vetor2[i], i);
                System.out.println("Motivo: Divisão por zero não é permitida.");

            // Embora a lógica com 'Math.min' evite este erro,
            // é uma boa prática mostrar como ele seria tratado.
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.printf("Erro! O índice %d está fora dos limites de um dos arrays.%n", i);
            
            // Este bloco captura qualquer outra exceção inesperada.
            } catch (Exception e) {
                System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
            } finally {
                // O bloco 'finally' sempre é executado, com ou sem exceção.
                // É útil para fechar recursos ou limpar dados.
                // Neste caso, não é estritamente necessário, mas demonstra o uso.
                System.out.println("---");
            }

            System.out.println("Processo finalizado.");
        }
	}
}        

        
        
        
        
      