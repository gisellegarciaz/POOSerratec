
//Aluna: Giselle P A Garcia

package main;

import javax.swing.JOptionPane;
import classes.Funcionario;
import java.text.DecimalFormat;

public class TestaFuncionario {


	    public static void main(String[] args) {
	        // Instanciando um funcionário
	        Funcionario funcionario = new Funcionario("Giselle Garcia", 10000.0);

	        // Calculando os valores
	        double inss = funcionario.calcularInss();
	        double valeTransporte = funcionario.calcularValeTransporte();
	        double salarioLiquido = funcionario.getSalario() - inss - valeTransporte;

	        // Formato para exibir valores em moeda
	        DecimalFormat df = new DecimalFormat("#,##0.00");

	        // Construindo a mensagem para o JOptionPane
	        String mensagem = "Nome: " + funcionario.getNome() + "\n"
	                        + "Salário: R$" + df.format(funcionario.getSalario()) + "\n"
	                        + "INSS: R$" + df.format(inss) + "\n"
	                        + "Vale Transporte: R$" + df.format(valeTransporte) + "\n"
	                        + "Salário Líquido: R$" + df.format(salarioLiquido);

	        // Exibindo a mensagem
	        JOptionPane.showMessageDialog(null, mensagem, "Folha de Pagamento", JOptionPane.INFORMATION_MESSAGE);
	    }
}

