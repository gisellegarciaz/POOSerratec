package classes;

import java.util.ArrayList;
import java.util.List;

public class ClassePessoa {

    private String nome;
    private String cpf;
    private ClasseEndereco endereco; // Tipo de dado corrigido
    private List<ClasseTelefone> telefones;

    public ClassePessoa(String nome, String cpf, ClasseEndereco endereco, List<ClasseTelefone> telefones) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco; // Atribuição corrigida
        this.telefones = telefones;
    }

    public void adicionarTelefone(ClasseTelefone telefone) {
        if (this.telefones == null) {
            this.telefones = new ArrayList<>();
        }
        this.telefones.add(telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ClasseEndereco getEndereco() {
        return endereco;
    }

    public void setEndereco(ClasseEndereco endereco) {
        this.endereco = endereco;
    }

    public List<ClasseTelefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<ClasseTelefone> telefones) {
        this.telefones = telefones;
    }
}
