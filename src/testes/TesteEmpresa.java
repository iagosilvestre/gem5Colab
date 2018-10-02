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

public class TesteEmpresa {
	private Empresa Apple;
	private Empresa AppleR;
	private Funcionario Joao;
	
	@Before
	public void setUp(){
		Apple = new Empresa("Apple",1);	// Existe a Apple dos computadores e Apple Records da musica
		AppleR = new Empresa("Apple",2); //
		Joao = new Funcionario("Joao",Apple,1);
		return;
	}
	
	
	@Test
	public void nomeDeEmpresa() throws Exception {
		assertThat(Apple.nome(),equalToIgnoringCase("Apple"));
		assertThat(AppleR.nome(),equalToIgnoringCase("apple"));
		
	}
	@Test
	public void idDaEmpresa() throws Exception {
		assertThat(Apple.id(),is(1));
		assertThat(AppleR.id(),is(2));
	}

	@Test
	public void checkProjects() throws Exception {
		List<Projeto> testeProjeto = new ArrayList<Projeto>();
		Projeto p1=new Projeto("Macintosh",Joao);
		Projeto p2=new Projeto("Macintosh",Joao);
		testeProjeto.add(p1);
		testeProjeto.add(p2);
		Apple.desenvolveProjeto(p1);
		Apple.desenvolveProjeto(p2);
		assertThat(Apple.listProjetos(),hasItem(p1));
		assertThat(Apple.listProjetos(),hasItem(p2));
		assertFalse(Apple.listProjetos().contains(new Projeto("Ipod",Joao)));
	}
}


