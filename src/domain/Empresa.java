package domain;

public class Empresa {

	private int sum = 0;
	private String nome;
	private int id;
	
	
	public Empresa(String string) {
		this.nome=string;
		sum=sum+1;
		this.id=sum;
		// TODO Auto-generated constructor stub
	}


	public String nome() {
		return this.nome;
	}


	public int id() {
		return this.id;
	}

}
