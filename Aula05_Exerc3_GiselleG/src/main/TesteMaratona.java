package main;

import classes.AtletaAmador;
import classes.AtletaProfissional;
import classes.Maratona;

public class TesteMaratona {
    public static void main(String[] args) {
    	
        
        Maratona atleta1 = new AtletaAmador("Giselle", "F", 32, 1.65, true);
        Maratona atleta2 = new AtletaProfissional("Nairobi", "F", 7, 0.45, 3.0);
        Maratona atleta3 = new AtletaAmador("Arthur", "M", 33, 1.75, false);

        System.out.println("\n======= MARATONA TERESOPOLIS RACE =======\n");
        System.out.println("-------   Situação dos Atletas   --------\n");
        
 
        System.out.println(atleta1);
        atleta1.verificaSituacao();
        System.out.println();

        System.out.println(atleta2);
        atleta2.verificaSituacao();
        System.out.println();

        System.out.println(atleta3);
        atleta3.verificaSituacao();
        System.out.println();
    }
}