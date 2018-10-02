package domain;

import java.util.*;

public class Projeto {
	
	private String nomeProjeto;
	private Funcionario responsavel;
	private List<Ocorrencia> ocorrencias=new ArrayList<Ocorrencia>();
	
	
	public Projeto(String nomeProjeto, Funcionario responsavel) {
		this.nomeProjeto=nomeProjeto;
		this.responsavel=responsavel;
	}

}
