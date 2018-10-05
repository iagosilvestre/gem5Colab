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

	public Ocorrencia(String tipo, String estado, String resumo, String prioridade, Projeto p) {
		this.tipo=tipo;
		this.estado=estado;
		this.resumo=resumo;
		this.prioridade=prioridade;
		this.projeto=p;
		this.id=this.projeto.getIdOc();
	}

}
