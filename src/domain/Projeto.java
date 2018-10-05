package domain;

import java.util.*;

public class Projeto {
	
	private int idOc=0;
	private String nomeProjeto;
	private Empresa empresa;
	private List<Ocorrencia> ocorrencias=new ArrayList<Ocorrencia>();
	
	
	public Projeto(String nomeProjeto, Empresa responsavel) {
		this.nomeProjeto=nomeProjeto;
		this.empresa=responsavel;
		this.empresa.desenvolveProjeto(this);
	}


	public int getIdOc() {
		idOc=idOc+1;
		return idOc;
	}
	
	public Empresa getEmpresa() {
		return this.empresa;
	}

}
