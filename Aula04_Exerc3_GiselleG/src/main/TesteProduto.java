package main;

import javax.swing.JOptionPane;
import classes.Produto;
import java.text.DecimalFormat;

public class TesteProduto {


    public static void main(String[] args) {
        String resposta = "";
        DecimalFormat df = new DecimalFormat("#,##0.00");

        do {
            // Lendo dados do produto
            String descricao = JOptionPane.showInputDialog("Produto:");
            String valorStr = JOptionPane.showInputDialog("Valor:");
            String quantidadeStr = JOptionPane.showInputDialog("Quantidade:");

            try {
                // Convertendo String para numéricos
                double valor = Double.parseDouble(valorStr);
                int quantidade = Integer.parseInt(quantidadeStr);

                // Instanciando o produto
                Produto produto = new Produto(descricao, valor, quantidade);

                // Exibindo os dados do produto
                String mensagem = "Descrição: " + produto.getDescricao() + "\n"
                                + "Valor: " + df.format(produto.getValor()) + "\n"
                                + "Total: " + df.format(produto.getTotal()) + "\n"
                                + "ICMS: " + df.format(produto.calcularIcms());

                JOptionPane.showMessageDialog(null, mensagem);

                // Perguntando se deseja encerrar
                resposta = JOptionPane.showInputDialog("Deseja encerrar o programa? (S/N)");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro: Digite apenas números nos campos de valor e quantidade.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
                resposta = "N"; // Para continuar o loop em caso de erro
            }

        } while (!resposta.equalsIgnoreCase("S"));
    }
}