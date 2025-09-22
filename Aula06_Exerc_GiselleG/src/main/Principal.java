package main;

import classes.Cidade;
import classes.Contato;
import classes.Endereco;
import classes.Estado;
import classes.Telefone;

public class Principal {

	public static void main(String[] args) {
     
        Estado estado = new Estado("Rio de Janeiro", "RJ");

        
        Cidade cidade = new Cidade("Teresópolis", estado);

       
        Endereco endereco = new Endereco("Rua Araujo Regadas", "Centro", "25685-110", cidade);

       
        Contato contato = new Contato("Giselle Garcia", endereco);

       
        Telefone telefone1 = new Telefone("2222-1234");
        Telefone telefone2 = new Telefone("2876-5432");
        contato.adicionarTelefone(telefone1);
        contato.adicionarTelefone(telefone2);

        
        System.out.println("\n         ,..........   ..........,         \n"
        		+ "     ,..,'          '.'          ',..,     \n"
        		+ "    ,' ,'            :            ', ',    \n"
        		+ "   ,' ,'             :             ', ',   \n"
        		+ "  ,' ,'              :              ', ',  \n"
        		+ " ,' ,'............., : ,.............', ', \n"
        		+ ",'  '............   '.'   ............'  ',\n"
        		+ " '''''''''''''''''';''';'''''''''''''''''' \n"
        		+ "                    '''                     ");
        
        System.out.println("\n    ----- GISELLE'S LISTA AMARELA ----- \n");
        System.out.println("Nome: " + contato.getNome());
        System.out.println(contato.getEndereco().getRua() + "," + " 181 " + "- " + contato.getEndereco().getBairro() + ", " + contato.getEndereco().getCidade().getNomeCidade() + ", " + contato.getEndereco().getCidade().getEstado().getNomeEstado());

       
        for (Telefone tel : contato.getTelefones()) {
            System.out.println("Telefone: " + tel.getNumero());
        }
    }
}

 
