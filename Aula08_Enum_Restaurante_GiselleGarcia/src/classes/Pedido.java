package classes;

import java.time.LocalDate;

public class Pedido {

    private LocalDate dataPedido;
    private Bebidas bebida;
    private Sanduiche sanduiche;

    public Pedido(LocalDate dataPedido, Bebidas bebida, Sanduiche sanduiche) {
        this.dataPedido = dataPedido;
        this.bebida = bebida;
        this.sanduiche = sanduiche;
    }

    public static void imprimirCardapio() {
    	System.out.println("                _....----\"\"\"----...._\n"
    			+ "             .-'  o    o    o    o   '-.\n"
    			+ "            /  o    o    o         o    \\  \n"
    			+ "         __/__o___o_ _ o___ _ o_ o_ _ _o_\\__\n"
    			+ "        /                                   \\\n"
    			+ "        \\___________________________________/\n"
    			+ "          \\~`-`.__.`-~`._.~`-`~.-~.__.~`-`/\n"
    			+ "           \\                             /\n"
    			+ "            `-._______________________.-'\n"
    			+ "" + " " + "\n\n            ------ GISELLE LANCHES ------" + "\n\n");
        System.out.println("--- Cardápio ---");
        System.out.println("\nSanduíches (15cm):");
        for (Sanduiche s : Sanduiche.values()) {
            System.out.printf("- %s (%s): R$ %.2f%n", s.name(), s.getTipo(), s.getValor());
        }

        System.out.println("\nBebidas:");
        for (Bebidas b : Bebidas.values()) {
            System.out.printf("- %s (%s): R$ %.2f%n", b.name(), b.getTipo(), b.getValor());
        }
        System.out.println("\n---------------------------------------------");
    }

    public double calcularTotal() {
        return this.bebida.getValor() + this.sanduiche.getValor();
    }
    
    // Método para exibir detalhes do pedido
    public void imprimirDetalhes() {
        System.out.println("\n--- Detalhes do Pedido ---");
        System.out.println("Data do Pedido: " + this.dataPedido);
        System.out.println("Bebida: " + this.bebida.name() + " (R$ " + this.bebida.getValor() + ")");
        System.out.println("Sanduíche: " + this.sanduiche.name() + " (R$ " + this.sanduiche.getValor() + ")");
        System.out.println("Total do Pedido: R$ " + this.calcularTotal());
        System.out.println("--------------------------");
    }
    
    
    public double imprimirDetalhesComCashback() {
        double valorTotal = calcularTotal();
        if (valorTotal > 30.0) {
            return valorTotal * 0.05; // 5% de cashback
        }
        return 0.0; // Nenhum cashback
    }

	//public void () {
		// TODO Auto-generated method stub
		
	//}

}
