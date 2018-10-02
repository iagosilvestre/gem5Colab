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
	private boolean add;
	
	@Before
	public void setUp(){
		Apple = new Empresa("Apple",1,null,null);	// Existe a Apple dos computadores e Apple Records da musica
		AppleR = new Empresa("Apple",2,null,null); //
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
		ArrayList<Projeto> testeProjeto = new ArrayList<Projeto>();
		testeProjeto.add(new Projeto("Macintosh",Joao,new ArrayList<Ocorrencia>()));
		testeProjeto.add(new Projeto("Ipod",Joao,new ArrayList<Ocorrencia>()));
		Apple.desenvolveProjeto("Macintosh",Joao);
		Apple.desenvolveProjeto("Ipod",Joao);
		assertThat(Apple.listProjetos(),is(testeProjeto));
	}
}


