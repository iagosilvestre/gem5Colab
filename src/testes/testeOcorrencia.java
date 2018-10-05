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
	private Empresa Apple;
	private Empresa AppleR;
	private Projeto p1;
	private Ocorrencia o1;

	@Before
	public void setUp(){
		Apple = new Empresa("Apple");	// Existe a Apple dos computadores e Apple Records da musica
		AppleR = new Empresa("Apple");	// Existe a Apple dos computadores e Apple Records da musica
		Joao = new Funcionario("Joao",Apple);
		Marcio= new Funcionario("Marcio",Apple);
		Cesar= new Funcionario("Cesar",AppleR);
		p1=new Projeto("Macintosh",Apple);
		o1=new Ocorrencia("bug","bug na criacao de threads","alta",p1,Joao);
		return;
	}
	
	@Test
	public void mudaResponsavelOcorrencia() throws Exception {
		o1.mudaResponsavel(Marcio);
		assertEquals(o1.getResponsavel(),Marcio);		
		
	}
	@Test
	public void mudaResponsavelAposTerminoOcorrencia() throws Exception {
		Joao.terminaOcorrencia(o1);
		o1.mudaResponsavel(Marcio);
		assertNotEquals(o1.getResponsavel(),Marcio);		
		
	}
}
