package domain;

import java.util.*;

public class Projeto {
	
	private String nomeProjeto;
	private Funcionario responsavel;
	private ArrayList<Ocorrencia> ocorrencias;
	
	
	public Projeto(String nomeProjeto, Funcionario responsavel, ArrayList<Ocorrencia> ocorrencias) {
		this.nomeProjeto=nomeProjeto;
		this.responsavel=responsavel;
		this.ocorrencias= ocorrencias;
	}

}
