package Classes;

public class Animal {

	protected String animal;
    public Animal(String animal, char sexo, String som) {
		super();
		this.animal = animal;
		this.sexo = sexo;
		this.som = som;
	}
	protected char sexo;
    protected String som;
	
    
    //colocar o sexo
    public String getArtigo() {
        if (this.sexo == 'M') {
            return "o";
        } else {
            return "a";
        }
    }
        
    
    
    //getters & setters
    public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	} 
   
}
