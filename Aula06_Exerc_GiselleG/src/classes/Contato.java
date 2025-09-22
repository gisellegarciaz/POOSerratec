package classes;

import java.util.ArrayList;

public class Contato {
    private String nome;
    private Endereco endereco;
    private ArrayList<Telefone> telefones;

    public Contato(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefones = new ArrayList<>();
    }

    public void adicionarTelefone(Telefone telefone) {
        this.telefones.add(telefone);
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }
}