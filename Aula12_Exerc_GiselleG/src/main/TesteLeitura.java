package main;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class TesteLeitura {

	    public static void main(String[] args) {
	        String nomeDoArquivo = "GiselleApresentacao.txt";
	        
	        try (BufferedReader leitor = new BufferedReader(new FileReader(nomeDoArquivo))) {
	            
	            // Armazena o conteúdo do arquivo
	            StringBuilder conteudo = new StringBuilder();
	            
	            int totalCaracteres = 0;
	            String linhaAtual;
	            
	            // Le o arquivo
	            while ((linhaAtual = leitor.readLine()) != null) {
	                
	                conteudo.append(linhaAtual).append("\n");
	                
	                totalCaracteres += linhaAtual.length();
	                
	                totalCaracteres++; 
	            }
	            
	            
	            System.out.println("  ------ Conteúdo do Arquivo ------  \n");
	            System.out.println(conteudo.toString());
	            System.out.println("-------------------------------------");
	            
	            
	            System.out.println("\nO arquivo '" + nomeDoArquivo + "' possui " + totalCaracteres + " caracteres.");
	            
	        } catch (IOException e) {
	            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
	    }
	    
	    }
}