package domain;
import java.util.*;

public class Empresa {


	private String nome;
	private int id;
	private ArrayList<Projeto> Projetos=new ArrayList<Projeto>();
	private ArrayList<Funcionario> Funcionarios=new ArrayList<Funcionario>();
	
	
	public Empresa(String string, int id,ArrayList<Funcionario> funcionarios,ArrayList<Projeto> projetos) {
		this.nome=string;
		this.id=id;
		this.Projetos=projetos;
		this.Funcionarios=funcionarios;
		// TODO Auto-generated constructor stub
	}


	public String nome() {
		return this.nome;
	}


	public int id() {
		return this.id;
	}


	public void desenvolveProjeto(String nomeProjeto, Funcionario responsavel) {
		Projeto p=new Projeto(nomeProjeto,responsavel,new ArrayList<Ocorrencia>());
		Projetos.add(p);
		
	}


	public Object listProjetos() {
		return this.Projetos;
	}

}
