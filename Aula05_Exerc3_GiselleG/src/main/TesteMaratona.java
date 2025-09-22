package main;

import classes.AtletaAmador;
import classes.AtletaProfissional;
import classes.Maratona;

public class TesteMaratona {
    public static void main(String[] args) {
    	
        
        Maratona atleta1 = new AtletaAmador("Giselle", "F", 25, 1.65, true);
        Maratona atleta2 = new AtletaProfissional("Nairobi", "F", 7, 0.45, 3.0);
        Maratona atleta3 = new AtletaAmador("Arthur", "M", 20, 1.75, false);

        System.out.println("--- Situação dos Atletas ---");
        
 
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