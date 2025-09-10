
public class SalarioMedico_Classe {

	public class Medico {
	    // Atributos
	    String crm;
	    String nome;
	    double salario;
	    double valorConsulta;

	   
	public Medico(String crm, String nome, double salario, double valorConsulta) {
	        this.crm = crm;
	        this.nome = nome;
	        this.salario = salario;
	        this.valorConsulta = valorConsulta;
	    }

	    /**
	     * Calcula o pagamento quando a consulta é em dinheiro.
	     * O valor total é adicionado ao salário.
	     * @return O novo salário do médico após a consulta.
	     */
	    public double pagamentoDinheiro() {
	        this.salario += this.valorConsulta;
	        return this.salario;
	    }

	    /**
	     * Calcula o pagamento quando a consulta é por plano de saúde.
	     * O médico recebe 70% do valor da consulta.
	     * @return O novo salário do médico após a consulta.
	     */
	    public double pagamentoPlano() {
	        double valorRecebido = this.valorConsulta * 0.70;
	        this.salario += valorRecebido;
	        return this.salario;
	    }
	    
	    /**
	     * Imprime os dados do médico de forma formatada.
	     */
	    public void imprimir() {
	        System.out.println("DADOS DO MÉDICO");
	        System.out.println("-------------------------");
	        System.out.printf("CRM: %s - %s%n", crm, nome);
	        System.out.printf("Salário: %.2f%n", salario);
	    }
	}
	
}
