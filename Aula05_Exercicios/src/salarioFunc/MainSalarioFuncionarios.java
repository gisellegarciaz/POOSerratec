package salarioFunc;

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class MainSalarioFuncionarios {

	ClasseSalarioFuncionarios f = new ClasseSalarioFuncionarios("Giselle", 40000.0);
	
	double mensagem = f.calcularSalarioLiquido();

	JOptionPane.showMessageDialog(
            null, 
            mensagem, 
            "Dados do Funcionário", 
            JOptionPane.INFORMATION_MESSAGE
        );
}


/*public static void main(String[] args) {
	        
	        // Cria um objeto Scanner para ler a entrada do usuário
	        Scanner scanner = new Scanner(System.in);
	        
	        // Pede os dados ao usuário
	        System.out.println("--- Cadastro de Funcionário ---\n");
	        System.out.print("Digite o nome do funcionário: ");
	        
	        String nome = scanner.next();
	        
	        System.out.print("Digite o salário bruto: ");
	        double salario = scanner.nextDouble();
	        
	        //scanner.nextLine();
	        
	        // Instancia um objeto Funcionario com os dados fornecidos pelo usuário
	        ClasseSalarioFuncionarios funcionario = new ClasseSalarioFuncionarios(nome, salario);
	
	        // Imprime o resumo salarial usando o método da classe Funcionario
	        funcionario.calcularSalarioLiquido();
	        
	        scanner.close();
	    }
	    
*/