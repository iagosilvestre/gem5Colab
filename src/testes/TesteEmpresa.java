package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import domain.Empresa;

public class TesteEmpresa {
	@Before
	public void setUp(){
		Empresa Apple = new Empresa("Apple");
		Empresa AppleR = new Empresa("Apple");
		return;
	}
	
	
	@Test
	public void nomeDeEmpresa() throws Exception {
		Empresa Gol=new Empresa("Gol");
		assertEquals(Gol.nome(),"Gol");
		
	}
	@Test
	public void idDaEmpresa() throws Exception {
		Empresa Gol = new Empresa("Gol");
		assertEquals(Gol.id(),1);
		Empresa Varig = new Empresa("Gol");
		assertEquals(Gol.id(),1);
	}

}


