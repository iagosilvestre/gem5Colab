package testes;

public class TesteEmpresa {
	@Test
	public void nomeDeEmpresa() throws Exception {
	Empresa Gol=new Empresa("Gol");
	assertEquals(Empresa.nome(),"Gol");
		
	}

}


