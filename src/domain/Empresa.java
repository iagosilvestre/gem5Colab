package domain;
import java.util.*;

public class Empresa {


	private String nome;
	private int id;
	private List<Projeto> Projetos=new ArrayList<Projeto>();
	private List<Funcionario> Funcionarios=new ArrayList<Funcionario>();
	
	
	public Empresa(String string, int id) {
		this.nome=string;
		this.id=id;
		// TODO Auto-generated constructor stub
	}


	public String nome() {
		return this.nome;
	}


	public int id() {
		return this.id;
	}


	public void desenvolveProjeto(Projeto p) {
		Projetos.add(p);
		
	}


	public List<Projeto> listProjetos() {
		return this.Projetos;
	}

}
