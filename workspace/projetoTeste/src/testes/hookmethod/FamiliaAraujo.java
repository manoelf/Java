package testes.hookmethod;

public abstract class FamiliaAraujo {
	
	private String sobrenome;
	
	public FamiliaAraujo() {
		setSobrenome("Araujo");
	}
	
	public  void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public final String getSobrenome() {
		return this.sobrenome;
	}

	public final String getNomeCompleto() {
		return getNome() + " " +  this.sobrenome; //hook method
	}

	public abstract String getNome();

}
