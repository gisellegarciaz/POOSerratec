package classes;

public class FuncionarioPublico {

	String nome;
    double salario;
    final int anoConcurso;

    // Construtor
    public FuncionarioPublico(String nome, double salario, int anoConcurso) {
        this.nome = nome;
        this.salario = salario;
        this.anoConcurso = anoConcurso; 
    }

    // Método para exibir os atributos do funcionário
    public void exibirAtributos() {
        System.out.println("--- Dados do Funcionário ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: R$ " + this.salario);
        System.out.println("Ano do Concurso: " + this.anoConcurso);
        System.out.println("\n----------------------------\n");
    }
	
}

