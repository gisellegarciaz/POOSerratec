package classes;

public class ClasseEstado {

	    private String nomeEstado;
	    private String sigla;

	 
	    
	    public ClasseEstado(String nomeEstado, String sigla) {
			super();
			this.nomeEstado = nomeEstado;
			this.sigla = sigla;
		}

	    
	    
		public String getNomeEstado() {
	        return nomeEstado;
	    }

	    public void setNomeEstado(String nomeEstado) {
	        this.nomeEstado = nomeEstado;
	    }

	    public String getSigla() {
	        return sigla;
	    }

	    public void setSigla(String sigla) {
	        this.sigla = sigla;
	    }
	
	
	
}

