package Classes;

public class Gato extends Animal implements EmiteSom {

	public Gato() {
        super("gato", 'M', "miau");
        this.setAnimal("gato");
        this.setSexo('M');
        this.setSom("miau");
    }


    public void fazerSom() {
        System.out.println("E " + this.getArtigo() + " " + this.getAnimal() + " " + this.getSom());
    }
}

