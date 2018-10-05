package domain;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
	private String nome;
	private Empresa empresa;
	private int id;
	private int numOc=0;
	private List<Ocorrencia> ocorrencias=new ArrayList<Ocorrencia>();

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

	public void removeOcorrencia() {
		this.numOc=this.numOc-1;
		
	}

	public void adicionaOcorrencia() {
		this.numOc=this.numOc+1;
	}

	public int getOc() {
		return this.numOc;
	}

}
