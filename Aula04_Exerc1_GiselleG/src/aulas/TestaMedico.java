package aulas;

public class TestaMedico {
    
    public static int totalDeMedicos = 0;

    public static void main(String[] args) {
        
    	// Incrementa o contador de médicos
        totalDeMedicos += 2; 
        
        
        Medico medico1 = new Medico(12345, "Giselle Garcia", 0, 250);
        Medico medico2 = new Medico(456789, "Nairobi", 0, 300);

        System.out.println("\n------------------------------------");
        System.out.println("\n           /_]  [_\\\n"
        		+ "          //      \\\\\n"
        		+ "          \\\\      //\n"
        		+ "           \\`-..-'/\n"
        		+ "            `\\  /`\n"
        		+ "              ||    _\n"
        		+ "              ||   ( )\n"
        		+ "              \\\\___//\n"
        		+ "               `---`\n");
        
        
        System.out.println("       Bem-vindos à Clinica\n"
        		+ "         Gi.necocologia    \n");
        System.out.println("---------------------------------------\n\n");
        
        System.out.println("--- Consulta de Dr. " + medico1.getNome() + " ---\n");
        medico1.pagamentoDinheiro();
        System.out.println("Salário após a consulta: R$" + medico1.getSalario());

        
        System.out.println("\n\n--- Consulta de Dr. " + medico2.getNome() + " ---\n");
        medico2.pagamentoPlano();
        System.out.println("Salário após a consulta: R$" + medico2.getSalario());

        
        // Exibe dados dos médicos
        System.out.println("\n-----------------------------");
        System.out.println("\n----- Dados dos Médicos -----");
        System.out.println("CRM: " + medico1.getCrm() + ", Nome: " + medico1.getNome() + ", Salário: R$" + medico1.getSalario());
        System.out.println("CRM: " + medico2.getCrm() + ", Nome: " + medico2.getNome() + ", Salário: R$" + medico2.getSalario());

        
        System.out.println("\nNúmero total de médicos: " + totalDeMedicos);
    }
}


