package salarioFunc;

public class ClasseSalarioFuncionarios {

	/*  Atributos encapsulados  */
    private String nome;
    private double salario;

    /*  Construtor da classe Funcionario.  */
    
    public ClasseSalarioFuncionarios(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
    
	/*  Calcula o valor do INSS (11% do salário)  */
   public double calcularInss() {
       return this.salario * 0.11;
   }

   /*  Calcula o valor do vale-transporte (6% do salário).  */
   public double calcularValeTransporte() {
       return this.salario * 0.06;
   }
   
   /*  Salário Líquido = Salário Bruto - INSS - Vale Transporte.  */
  public double calcularSalarioLiquido() {
      return this.salario - calcularInss() - calcularValeTransporte();
  }
    
}
