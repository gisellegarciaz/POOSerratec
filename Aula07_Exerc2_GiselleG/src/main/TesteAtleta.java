package main;

import classes.Atleta;
import classes.Pais;

public class TesteAtleta {
    public static void main(String[] args) {
       
        Pais paisBrasil = new Pais("Brasil", "BRA");
        Pais paisEUA = new Pais("EUA", "USA");
        
        
        Atleta giselle = new Atleta("Giselle Garcia", 91.0, "A", paisBrasil);
        Atleta jon = new Atleta("Jon Jones", 59.0, "O", paisEUA);
        Atleta vitor = new Atleta("Vitor Belfort", 85.0, "O", paisBrasil);
        
        System.out.println("\n\n"
        		+ "      .,::OOO::,.     .,ooOOOoo,.     .,::OOO::,.\n"
        		+ "    .:'         `:. .8'         `8. .:'         `:.\n"
        		+ "    :\"           \": 8\"           \"8 :\"           \":\n"
        		+ "    :,        .,:::\"\"::,.     .,:o8OO::,.        ,:\n"
        		+ "     :,,    .:' ,:   8oo`:. .:'oo8   :,,`:.    ,,:\n"
        		+ "      `^OOoo:\"O^'     `^88oo:\"8^'     `^O\":ooOO^'\n"
        		+ "            :,           ,: :,           ,:\n"
        		+ "             :,,       ,,:   :,,       ,,:\n"
        		+ "              `^Oo,,,oO^'     `^OOoooOO^'");
        System.out.println("\n\n~~~~~~~~~     GISELLAND OLYMPIC GAMES 2025    ~~~~~~~~~\n\n");
        
        String situacao1 = giselle.verificaSituacao();
        System.out.println(giselle.getSexo() + " atleta " + giselle.getNome() + " " + situacao1 + "\n");
        Atleta.incrementarTotalParticipantes(situacao1);
        
        String situacao2 = jon.verificaSituacao();
        System.out.println(jon.getSexo() + " atleta " + jon.getNome() + " " + situacao2 + "\n");
        Atleta.incrementarTotalParticipantes(situacao2);

        String situacao3 = vitor.verificaSituacao();
        System.out.println(vitor.getSexo() + " atleta " + vitor.getNome() + " " + situacao3 + "\n");
        Atleta.incrementarTotalParticipantes(situacao3);
        
        
        System.out.println("\nTotal de Participantes: " + Atleta.getTotalParticipantes());
    }
}

