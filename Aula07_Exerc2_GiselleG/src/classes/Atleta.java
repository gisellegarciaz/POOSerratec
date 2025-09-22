package classes;

public class Atleta implements Olimpiadas {
    private String nome;
    private double peso;
    private String sexo; // Novo atributo para o sexo
    private String modalidade;
    private Pais pais;
    private static int totalParticipantes = 0;

    // Construtor atualizado para incluir o sexo
    public Atleta(String nome, double peso, String sexo, Pais pais) {
        this.nome = nome;
        this.peso = peso;
        this.sexo = sexo; // Atribui o novo valor
        this.pais = pais;
        setModalidade(getModalidade());
    }

    // Lógica para determinar a modalidade e a situação
    @Override
    public String verificaSituacao() {
        if (this.peso > 90) {
            this.modalidade = "Peso pesado";
            return "participará";
        } else if (this.peso >= 60 && this.peso <= 90) {
            this.modalidade = "Peso médio";
            return "participará";
        } else {
            this.modalidade = "Não se classificou";
            return "não participará";
        }
    }

    // Novos métodos getters para o sexo
    public String getNome() { return nome; }
    public double getPeso() { return peso; }
    public String getSexo() { return sexo; } // Getter para o sexo
    public String getModalidade() {
        if (this.peso > 90) {
            return "Peso pesado";
        } else if (this.peso >= 60 && this.peso <= 90) {
            return "Peso médio";
        } else {
            return "Não se classificou";
        }
    }
    public void setModalidade(String modalidade) { this.modalidade = modalidade; }
    public Pais getPais() { return pais; }
    public static int getTotalParticipantes() { return totalParticipantes; }

    public static void incrementarTotalParticipantes(String situacao) {
        if (situacao.equals("participará")) {
            totalParticipantes++;
        }
    }
}

