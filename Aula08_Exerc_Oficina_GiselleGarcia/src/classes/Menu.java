package classes;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;


public class Menu {

	public static void imprimirRecibo(Proprietario proprietario, Carro carro) {


        // Data
        String mesVigente = carro.dataConserto.getMonth().getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));


        // Impressão
        System.out.println("  ______\n"
				+ " /|_||_\\`.__\n"
				+ "(   _    _ _\\\n"
				+ "=`-(_)--(_)-'"
				+ "" + " " + "\n--------------- OFICINA DA GISELLE ----------" + "\n\n");
        
        
        System.out.println("------ Serviços realizados em " + mesVigente + " ------");
      
        double valorOleo = carro.trocarOleo();
        System.out.println("\nTroca de óleo: R$ " + valorOleo);

        double valorRevisao = carro.revisao();
        System.out.println("Revisão: R$ " + valorRevisao);
        
        double valorLavarEcologico = carro.lavarEcologico();
        System.out.println("Lavagem: R$ " + valorLavarEcologico);


        // Informações finais
        System.out.println("\n\n------ Resumo do Serviço --------------------\n");
        System.out.println("Proprietário: " + carro.getProprietario().getNome());
        System.out.println("\nDados do veículo: " + carro.toString());
        System.out.println("Valor total a cobrar: R$ " + carro.getValorCobrado());
        System.out.println("\n---------------------------------------------");
    }
}


