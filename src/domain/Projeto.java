package domain;

import java.util.*;

public class Projeto {
	
	private int idOc=0;
	private String nomeProjeto;
	private Empresa empresa;
	private List<Ocorrencia> ocorrencias=new ArrayList<Ocorrencia>();
	
	
	public Projeto(String nomeProjeto, Empresa EmpresaResponsavel) {
		if(nomeProjeto.isEmpty()) {
			throw new Error("empty name");
		}
		
		this.nomeProjeto=nomeProjeto;
		this.empresa=EmpresaResponsavel;
		this.empresa.desenvolveProjeto(this);
	}


	int getIdOc() {
		idOc=idOc+1;
		return idOc;
	}
	
	public Empresa getEmpresa() {
		return this.empresa;
	}
	
	public String getNome() {
		return this.nomeProjeto;
	}
	
	public List<Ocorrencia> listOcorrencias() {
		return this.ocorrencias;
	}

}
