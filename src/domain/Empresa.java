package domain;
import java.util.*;
import java.lang.IllegalArgumentException;

public class Empresa {


	private String nome;
	private int idFunc=0;
	private List<Projeto> Projetos=new ArrayList<Projeto>();
	private List<Funcionario> Funcionarios=new ArrayList<Funcionario>();
	
	
	public Empresa(String nome) {
		if(nome.isEmpty()) {
			throw new Error("empty name");
		}
		this.nome=nome;
	}




	public String nome() {
		return this.nome;
	}


	public void desenvolveProjeto(Projeto p) {
		Projetos.add(p);
		
	}


	public List<Projeto> listProjetos() {
		return this.Projetos;
	}


	public int getIdFunc() {
		idFunc=idFunc+1;
		return idFunc;
	}


	public List<Funcionario> listFuncionarios() {
		return this.Funcionarios;
	}


	void insereFuncionario(Funcionario f) {
		Funcionarios.add(f);
	}
	
	void removeFuncionario(Funcionario f) {
		Funcionarios.remove(f);
	}

}
