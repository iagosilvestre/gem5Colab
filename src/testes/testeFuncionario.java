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

public class testeFuncionario {
	
	private Funcionario Joao;
	private Funcionario Marcio;
	private Funcionario Cesar;
	private Empresa AppleR;
	private Empresa Apple;

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
	public void insereFuncionario() throws Exception {
		List<Funcionario> testeFuncionario=new ArrayList<Funcionario>();
		testeFuncionario.add(Joao);
		testeFuncionario.add(Marcio);
		assertThat(Apple.listFuncionarios(),is(testeFuncionario));
	}
	
	@Test
	public void idDoFuncionario() throws Exception {
		
		
	}

}
