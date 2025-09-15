package main;

import classes.ClasseCidade;
import classes.ClasseEndereco;
import classes.ClasseEstado;
import classes.ClassePessoa;
import classes.ClasseTelefone;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*
         * FORMA PROCEDURAL
         * 
         * // Dados Pessoa 1 (Giselle Carioca) ---
        
        ClasseEstado estado1 = new ClasseEstado("Rio de Janeiro", "RJ");
        ClasseCidade cidade1 = new ClasseCidade("Rio de Janeiro", estado1);
        ClasseEndereco endereco1 = new ClasseEndereco("Avenida Alfredo Balthazar da Silveira, 339", "Recreio", "22790710", cidade1);

        ClasseTelefone tel1 = new ClasseTelefone("21", "99999-9999");
        ClasseTelefone tel2 = new ClasseTelefone("21", "98888-8888");
        List<ClasseTelefone> listaTel1 = new ArrayList<>();
        listaTel1.add(tel1);
        listaTel1.add(tel2);

        // Dados Pessoa 2 (Giselle Serrana) ---
        ClasseEstado estado2 = new ClasseEstado("Rio de Janeiro", "RJ");
        ClasseCidade cidade2 = new ClasseCidade("Teresópolis", estado2);
        ClasseEndereco endereco2 = new ClasseEndereco("Rua Emille Ducumunn", "Várzea", "01000-000", cidade2);

        ClasseTelefone tel3 = new ClasseTelefone("21", "99999-1234");
        ClasseTelefone tel4 = new ClasseTelefone("21", "98888-1234");
        List<ClasseTelefone> listaTel2 = new ArrayList<>();
        listaTel2.add(tel3);
        listaTel2.add(tel4);

       // Criando Pessoa
        ClassePessoa p1 = new ClassePessoa("Giselle Carioca", "123.456.789-99", endereco1, listaTel1);
        ClassePessoa p2 = new ClassePessoa("Giselle Serrana", "999.999.999-99", endereco2, listaTel2); 

        // Exibindo os dados da Pessoa 1
        System.out.println("Nome: " + p1.getNome() + " - CPF: " + p1.getCpf());
        System.out.println("Endereço: " + p1.getEndereco().getRua() + ", "
                + p1.getEndereco().getBairro() + ", " + p1.getEndereco().getCidade().getNomeCidade()
                + " - " + p1.getEndereco().getCidade().getEstado().getSigla());
        
        System.out.println("Telefones:");
        for (ClasseTelefone tel : p1.getTelefones()) {
            System.out.println("(" + tel.getDdd() + ") " + tel.getNumero());
        }

        System.out.println("\n--------------------------------\n");

        // Exibindo os dados da Pessoa 2
        System.out.println("Nome: " + p2.getNome() + " - CPF: " + p2.getCpf());
        System.out.println("Endereço: " + p2.getEndereco().getRua() + ", "
                + p2.getEndereco().getBairro() + ", " + p2.getEndereco().getCidade().getNomeCidade()
                + " - " + p2.getEndereco().getCidade().getEstado().getSigla());

        System.out.println("Telefones:");
        for (ClasseTelefone tel : p2.getTelefones()) {
            System.out.println("(" + tel.getDdd() + ") " + tel.getNumero());
        } */
    }
}