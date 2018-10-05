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
	private Funcionario Marcio;
	private Funcionario Cesar;
	
	@Before
	public void setUp(){
		Apple = new Empresa("Apple");	// Existe a Apple dos computadores e Apple Records da musica
		AppleR = new Empresa("Apple"); //
		Joao = new Funcionario("Joao",Apple);
		Marcio= new Funcionario("Marcio",Apple);
		Cesar= new Funcionario("Cesar",AppleR);
		return;
	}
	
	
	@Test
	public void nomeDeEmpresa() throws Exception {
		assertThat(Apple.nome(),equalToIgnoringCase("Apple"));
		assertThat(AppleR.nome(),equalToIgnoringCase("apple"));
		
	}
	
	@Test
	public void nomeVazioEmpresa() throws Exception {
		Empresa EmpresaVazia = new Empresa(""); 
	}
	
}


