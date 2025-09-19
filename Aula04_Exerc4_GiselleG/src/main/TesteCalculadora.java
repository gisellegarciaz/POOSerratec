// Aluna: Giselle P A Garcia

package main;

import javax.swing.JOptionPane;
import classes.Calculadora;
import java.text.DecimalFormat;

public class TesteCalculadora {


    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int opcao = 0;
        DecimalFormat df = new DecimalFormat("#,##0.00");

        do {
            try {
                String menu = "Escolha a operação:\n"
                            + "1 - Soma\n"
                            + "2 - Subtração\n"
                            + "3 - Multiplicação\n"
                            + "4 - Divisão\n"
                            + "5 - Sair";
                
                String opcaoStr = JOptionPane.showInputDialog(null, menu);
                if (opcaoStr == null) { // Se o usuário cancelar a caixa de diálogo
                    break;
                }
                opcao = Integer.parseInt(opcaoStr);

                if (opcao >= 1 && opcao <= 4) {
                    String valor1Str = JOptionPane.showInputDialog("Digite o primeiro valor:");
                    String valor2Str = JOptionPane.showInputDialog("Digite o segundo valor:");

                    double valor1 = Double.parseDouble(valor1Str);
                    double valor2 = Double.parseDouble(valor2Str);

                    double resultado = calculadora.calcular(valor1, valor2, opcao);

                    if (!Double.isNaN(resultado)) {
                        JOptionPane.showMessageDialog(null, "O resultado é: " + df.format(resultado));
                    }
                } else if (opcao != 5) {
                    JOptionPane.showMessageDialog(null, "Opção inválida. Digite um número de 1 a 5.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Digite apenas números.");
                opcao = 0; // Continua o loop
            }
        } while (opcao != 5);

        JOptionPane.showMessageDialog(null, "Calculadora encerrada.");
    }
}

