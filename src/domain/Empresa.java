package domain;
import java.util.*;

public class Empresa {


	private String nome;
	private int idFunc=0;
	private List<Projeto> Projetos=new ArrayList<Projeto>();
	private List<Funcionario> Funcionarios=new ArrayList<Funcionario>();
	
	
	public Empresa(String string) {
		if(string.isEmpty()) {
			throw new Error("empty name");
		}
		this.nome=string;
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


	public Object listFuncionarios() {
		return this.Funcionarios;
	}


	void insereFuncionario(Funcionario f) {
		Funcionarios.add(f);
	}

}
