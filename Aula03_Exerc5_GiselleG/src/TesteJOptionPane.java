import javax.swing.JOptionPane;
import java.text.DecimalFormat;


public class TesteJOptionPane {
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Digite o seu nome:");
        String telefone = JOptionPane.showInputDialog("Digite o seu telefone:");
        String email = JOptionPane.showInputDialog("Digite o seu email:");
        String salarioStr = JOptionPane.showInputDialog("Digite o seu salário:");

        // Convertendo o salário de String para Double
        double salario = Double.parseDouble(salarioStr);
        double salarioComAumento = salario * 1.10; // Adiciona 10%

        // Formatando o salário para exibir como moeda
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");

 
        String mensagem = "--- Informações Digitadas ---\n" +
                          "Nome: " + nome + "\n" +
                          "Telefone: " + telefone + "\n" +
                          "Email: " + email + "\n" +
                          "Salário original: " + df.format(salario) + "\n" +
                          "Salário com acréscimo de 10%: " + df.format(salarioComAumento);

        // Exibindo a mensagem em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, mensagem);
    }
}

