package domain;

public class Funcionario {
	private String nome;
	private Empresa empresa;
	private int id;

	public Funcionario(String nome, Empresa empresa) {
		this.nome=nome;
		this.empresa=empresa;
		this.id=empresa.getIdFunc();
	}

	public Funcionario(String nome) {
		this.nome=nome;
	}

	public void mudaEmpresa(Empresa empresa) {
		this.empresa=empresa;
		
	}

	public void mudaId(int idFunc) {
		this.id=idFunc;
		
	}

}
