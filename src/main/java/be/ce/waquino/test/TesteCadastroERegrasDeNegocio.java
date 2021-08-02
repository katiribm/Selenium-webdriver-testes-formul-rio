package be.ce.waquino.test;
import static br.ce.waquino.core.DriverFactory.getDriver;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.ce.waquino.core.BaseTest;
import br.ce.waquino.page.CampoTreinamentoPage;

public class TesteCadastroERegrasDeNegocio extends BaseTest {
	
	private CampoTreinamentoPage page;
	
	@Before
	public void inicializa( ) { 
		getDriver().get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		page = new CampoTreinamentoPage();
	}
		
	@Test 
	public void  deveRealizarCadastroComSucesso() {
		page.setNome("Katiri");
		page.setSobrenome("Bardini");
		page.setSexoFeminino();
		page.setComidaPizza();
		page.setEscolaridade("Mestrado");
		page.setEsporte("Natacao");
		page.cadastrar();
		
		//Assert.assertTrue(page.obterResultadoCadastro().startsWith("Cadastrado!"));
		Assert.assertEquals("Cadastrado!", page.obterResultadoCadastro());
		Assert.assertEquals("Katiri", page.obterNomeCadastro());
		//Assert.assertEquals("Sobrenome: Bardini", page.obterSobrenomeCadastro());	
		Assert.assertEquals("Bardini", page.obterSobrenomeCadastro());	
		//Assert.assertEquals("Sexo: Feminino", page.obterSexoCadastro());	
		Assert.assertEquals("Feminino", page.obterSexoCadastro());	
		//Assert.assertEquals("Comida: Pizza", page.obterComidaCadastro());	
		Assert.assertEquals("Pizza", page.obterComidaCadastro());	
		//Assert.assertEquals("Escolaridade: mestrado", page.obterEscolaridadeCadastro());	
		Assert.assertEquals("mestrado", page.obterEscolaridadeCadastro());	
		//Assert.assertEquals("Esportes: Natacao", page.obterEsporteCadastro());	
		Assert.assertEquals("Natacao", page.obterEsporteCadastro());	
	}
	
}
