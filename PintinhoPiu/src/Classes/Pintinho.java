package Classes;

public class Pintinho extends Animal implements EmiteSom {

	public Pintinho() {
        super("pintinho", 'M', "piu");
         
        this.setAnimal("pintinho");
        this.setSexo('M');
        this.setSom("piu");
    }


    public void fazerSom() {
        System.out.println("E " + this.getArtigo() + " " + this.getAnimal() + " " + this.getSom());
    }
}
