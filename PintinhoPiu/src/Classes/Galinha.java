package Classes;

public class Galinha extends Animal implements EmiteSom {

	    public Galinha() {
	        super("galinha",'F',"có");
	        this.setAnimal("galinha");
	        this.setSexo('F');
	        this.setSom("có");
	    }

	    @Override
	    public void fazerSom() {
	        System.out.println("E " + this.getArtigo() + " " + this.getAnimal() + " " + this.getSom());
	    }
}

