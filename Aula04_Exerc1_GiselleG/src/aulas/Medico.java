// Aluna: Giselle Garcia

package aulas;

public class Medico {
    private int crm;
    private String nome;
    private double salario;
    private double valorConsulta;

   
    public Medico(int crm, String nome, double salario, double valorConsulta) {
        this.crm = crm;
        this.nome = nome;
        this.salario = salario;
        this.valorConsulta = valorConsulta;
    }

    
    public void pagamentoDinheiro() {
        this.salario += this.valorConsulta;
        System.out.println("Consulta de Dr." + this.nome + " paga em dinheiro." + "\n" + "Salário atual: R$" + this.salario);
    }

    
    public void pagamentoPlano() {
        double valorRecebido = this.valorConsulta * 0.70;
        this.salario += valorRecebido;
        System.out.println("Consulta de Dr." + this.nome + " paga com plano de saúde." + "\n" + "Salário atual: R$" + this.salario);
    }

    
    public int getCrm() {
        return crm;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }
}


