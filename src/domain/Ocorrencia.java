package domain;

import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.junit.Assert.assertThat;

import java.util.*;
public class Ocorrencia {
	private String tipo;
	private String estado;
	private String resumo;
	private String prioridade;
	private Funcionario responsavel;
	private Projeto projeto;
	private int id;

	public Ocorrencia(String tipo, String resumo, String prioridade, Projeto p, Funcionario f) {
		if(tipo.isEmpty()) {
			throw new Error("tipo vazio");
		}
		if(resumo.isEmpty()) {
			throw new Error("resumo vazio");
		}
		if(prioridade.isEmpty()) {
			throw new Error("prioridade vazia");
		}
		if(!(prioridade == "alta") | (prioridade == "media") | (prioridade == "baixa")) {
			throw new Error("prioridade invalida");
		}
		if(f.getOc()>=10) {
			throw new Error("Funcionario ja tem 10 ocorrencias");
		}
		
		this.tipo=tipo;
		this.estado="aberta";
		this.resumo=resumo;
		this.prioridade=prioridade;
		this.projeto=p;
		this.id=this.projeto.getIdOc();
		this.responsavel=f;
		this.responsavel.adicionaOcorrencia(this);
	}

	public void mudaResponsavel(Funcionario f) {
		if(f.getOc()<10) {
			if(this.estado=="aberta") {
				this.responsavel.removeOcorrencia(this);
				f.adicionaOcorrencia(this);
				this.responsavel=f;
			}
		}
		
	}

	void finaliza() {
		this.estado="completada";
		
	}

	public Funcionario getResponsavel() {
		return this.responsavel;
	}
	
	public String getPrioridade() {
		return this.prioridade;
	}

	public String getEstado() {
		return this.estado;
	}
	
	public void setPrioridadeAlta() {
		if(this.estado=="aberta") {
			this.prioridade="alta";
		}
	}
	public void setPrioridadeMedia() {
		if(this.estado=="aberta") {
			this.prioridade="media";
		}
	}
	public void setPrioridadeBaixa() {
		if(this.estado=="aberta") {
			this.prioridade="baixa";
		}
	}

}
