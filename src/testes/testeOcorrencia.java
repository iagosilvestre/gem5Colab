package testes;

import java.util.*;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;

import domain.Empresa;
import domain.Funcionario;
import domain.Ocorrencia;
import domain.Projeto;

public class testeOcorrencia {
		
	private Funcionario Joao;
	private Funcionario Marcio;
	private Funcionario Cesar;
	private Empresa AppleR;
	private Empresa Apple;

	@Before
	public void setUp(){
		Apple = new Empresa("Apple",1);	// Existe a Apple dos computadores e Apple Records da musica
		AppleR = new Empresa("Apple",2); //
		Joao = new Funcionario("Joao");
		Marcio= new Funcionario("Marcio");
		Cesar= new Funcionario("Cesar");
		return;
	}
	
	@Test
	public void geraOcorrencia() throws Exception {
		Projeto p1=new Projeto("Macintosh",Apple);
		Ocorrencia o1=new Ocorrencia("bug","aberta","bug na criacao de threads","alta",p1,Joao);
		o1.mudaResponsavel(Marcio);
		
		
	}
}
