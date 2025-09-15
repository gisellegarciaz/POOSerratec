package Classes;

public class Galo extends Animal implements EmiteSom {

	public Galo() {
        super("galo", 'M', "cocoricó");
        this.setAnimal("galo");
        this.setSexo('M');
        this.setSom("cocoricó");
    }


    public void fazerSom() {
        System.out.println("E " + this.getArtigo() + " " + this.getAnimal() + " " + this.getSom());
    }
}
