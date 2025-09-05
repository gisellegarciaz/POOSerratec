
public class SituacaoAluno {
	
	public static void main(String[] args) {
	        
	        // Variaveis/ Notas
	        double nota1 = 6.7;
	        double nota2 = 9.0;
	        
	        // Calculo da media
	        double media = (nota1 + nota2) / 2;
	        
	        // Exibe a media 
	        System.out.println("A média do aluno é: " + media);
	        
	        // Estrutura de decisão para a situação do aluno
	        if (media == 10) {
	            System.out.println("Aprovado! Parabéns!");
	        } else if (media >= 7) {
	            System.out.println("Aprovado");
	        } else {
	            System.out.println("Reprovado");
	        }
	}
}
