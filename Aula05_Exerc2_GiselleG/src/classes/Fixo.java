
// Giselle P A Garcia

package classes;

public class Fixo extends Vendedor {
	
    private double salarioBase;
    private double comissao;
    private double salarioBruto;

    public Fixo(String nome, String cpf, double salarioBase, double comissao) {
        super(nome, cpf);
        this.salarioBase = salarioBase;
        this.comissao = comissao;
        this.salarioBruto = salarioBase;
    }


    public void calcularSalario(double valorVenda) {
        this.salarioBruto += valorVenda * this.comissao;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + ", Salario Bruto: " + this.salarioBruto;
    }

    // Getters e Setters
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
}