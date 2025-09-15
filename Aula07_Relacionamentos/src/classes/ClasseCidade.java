package classes;

public class ClasseCidade {

	 
		private String nomeCidade;
	    private ClasseEstado estado;

	    
	    public ClasseCidade(String nomeCidade, ClasseEstado estado) {
	        super();
	        this.nomeCidade = nomeCidade;
			this.estado = estado;
	    }

	    
	    public String getNomeCidade() {
	        return nomeCidade;
	    }

	    public void setNomeCidade(String nomeCidade) {
	        this.nomeCidade = nomeCidade;
	    }

	    public ClasseEstado getEstado() {
	        return estado;
	    }

	    public void setEstado(ClasseEstado estado) {
	        this.estado = estado;
	    }
	
	
}
