package TesteHamcrest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.ufsc.ine.leb.projetos.estoria.Fixture;
import br.ufsc.ine.leb.projetos.estoria.FixtureSetup;

import br.ufsc.ine.leb.sistemaBancario.Agencia;
import br.ufsc.ine.leb.sistemaBancario.Banco;
import br.ufsc.ine.leb.sistemaBancario.Conta;
import br.ufsc.ine.leb.sistemaBancario.Dinheiro;
import br.ufsc.ine.leb.sistemaBancario.EstadosDeOperacao;
import br.ufsc.ine.leb.sistemaBancario.Moeda;
import br.ufsc.ine.leb.sistemaBancario.Operacao;
import br.ufsc.ine.leb.sistemaBancario.ValorMonetario;
import br.ufsc.ine.leb.sistemaBancario.Entrada;
import br.ufsc.ine.leb.sistemaBancario.Saida;
import br.ufsc.ine.leb.sistemaBancario.SistemaBancario;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@FixtureSetup(UnitTestCase1.class)
public class UnitTestCase2 {
	
	@Fixture private SistemaBancario sistemaBancario;
	private Banco bb;
	
	@Before
	public void before() {
		this.bb = sistemaBancario.criarBanco("Banco do Brasil", Moeda.BRL);
	}
	
	@Test
	public void criacaoDeAgencia() throws Exception {
		Agencia bbCentro = bb.criarAgencia("Centro");
		assertThat(bbCentro.obterIdentificador(),is(equalTo("001")));
		assertThat(bbCentro.obterNome(),is(equalToIgnoringCase("Centro")));
		assertThat(bbCentro.obterBanco(),is(equalTo(bb)));
	}

}
