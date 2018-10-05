package domain;

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
		this.tipo=tipo;
		this.estado="aberta";
		this.resumo=resumo;
		this.prioridade=prioridade;
		this.projeto=p;
		this.id=this.projeto.getIdOc();
		this.responsavel=f;
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

	public void finaliza() {
		this.estado="completada";
		
	}

}
