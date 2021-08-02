package be.ce.waquino.test;
import static br.ce.waquino.core.DriverFactory.getDriver;
import static br.ce.waquino.core.DriverFactory.killDriver;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.ce.waquino.core.DSL;

public class TesteSincronismo {

	private DSL dsl;
	
	@Before
	public void inicializa( ) { 
		getDriver().get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		dsl = new DSL();
	}
	
	
	@After
		public void finaliza() {
		killDriver();
	}
	
	@Test
	public void deveUtilizarEsperaFixa() throws InterruptedException {
		dsl.clicarBotao("buttonDelay");
		Thread.sleep(5000);
		dsl.escrever("novoCampo", "Deu certo?"); 
	}
	
	@Test
	public void deveUtilizarEsperaImplicita() throws InterruptedException {
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //liga a espera
		dsl.clicarBotao("buttonDelay");
		dsl.escrever("novoCampo", "Deu certo?"); 
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); //desliga a espera 
	}
	
	@Test
	public void deveUtilizarEsperaExplicita() throws InterruptedException {
		dsl.clicarBotao("buttonDelay");
		WebDriverWait wait = new WebDriverWait(getDriver(), 30); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("novoCampo"))); 
		dsl.escrever("novoCampo", "Deu certo?"); 
	}
	
}
