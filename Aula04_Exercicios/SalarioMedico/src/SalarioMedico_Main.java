import SalarioMedico_Classe;

public class SalarioMedico_Main {

	public class App {
	    public static void main(String[] args) {
	        // Cria dois objetos Medico usando o construtor
	        Medico medico1 = new Medico("CRM123", "Dr. João Silva", 5000.0, 150.0);
	        Medico medico2 = new Medico("CRM456", "Dra. Maria Souza", 6000.0, 180.0);

	        System.out.println("--- Simulação de Pagamentos ---");
	        
	        // Imprime os dados iniciais dos médicos usando o novo método
	        medico1.imprimir();
	        medico2.imprimir();
	        System.out.println("---------------------------------");
	        
	        // Simula uma consulta particular para o Medico 1
	        System.out.println(medico1.nome + " realizou uma consulta particular.");
	        double novoSalario1 = medico1.pagamentoDinheiro();
	        System.out.printf("Novo salário de %s: R$%.2f%n", medico1.nome, novoSalario1);
	        System.out.println("---------------------------------");

	        // Simula uma consulta por plano para o Medico 2
	        System.out.println(medico2.nome + " realizou uma consulta por plano de saúde.");
	        double novoSalario2 = medico2.pagamentoPlano();
	        System.out.printf("Novo salário de %s: R$%.2f%n", medico2.nome, novoSalario2);
	        System.out.println("---------------------------------");

	        // Simula mais uma consulta para cada médico
	        System.out.println(medico1.nome + " realizou mais uma consulta particular.");
	        double salarioFinal1 = medico1.pagamentoDinheiro();
	        System.out.printf("Salário final de %s: R$%.2f%n", medico1.nome, salarioFinal1);
	        System.out.println("---------------------------------");

	        System.out.println(medico2.nome + " realizou mais uma consulta por plano de saúde.");
	        double salarioFinal2 = medico2.pagamentoPlano();
	        System.out.printf("Salário final de %s: R$%.2f%n", medico2.nome, salarioFinal2);
	    }
	}

	
}
