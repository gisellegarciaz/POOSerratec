
// Aluna: Giselle Garcia

package classes;

public class ImpostoDeRenda {
 protected String nome;
 protected String telefone;
 protected String email;
 protected double rendimentos;


 public ImpostoDeRenda(String nome, double rendimentos) {
     this.nome = nome;
     this.rendimentos = rendimentos;
 }


 public double calculoIR() {
     return 0; 
 }

 // Getters para exibir os dados
 public String getNome() {
     return nome;
 }
 
 public double getRendimentos() {
     return rendimentos;
 }
}