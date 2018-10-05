package domain;

public class Funcionario {
	private String nome;
	private Empresa empresa;
	private int id;

	public Funcionario(String nome, Empresa empresa, int id) {
		this.nome=nome;
		this.empresa=empresa;
		this.id=empresa.getIdFunc();
	}

}
