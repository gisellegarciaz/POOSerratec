package Classes;

public class Cachorro extends Animal implements EmiteSom {

		public Cachorro() {
	        super("cachorro", 'M', "auau");
	        this.setAnimal("cachorro");
	        this.setSexo('M');
	        this.setSom("auau");
	    }


	    public void fazerSom() {
	        System.out.println("E " + this.getArtigo() + " " + this.getAnimal() + " " + this.getSom());
	    }
}

