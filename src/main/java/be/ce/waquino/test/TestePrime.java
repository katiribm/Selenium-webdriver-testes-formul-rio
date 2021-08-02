package be.ce.waquino.test;
import static br.ce.waquino.core.DriverFactory.getDriver;
import static br.ce.waquino.core.DriverFactory.killDriver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.ce.waquino.core.DSL;

public class TestePrime {
	
	private DSL dsl;
		
	@Before
	public void inicializa( ) { 
		getDriver().get("https://www.primefaces.org/showcase/ui/input/oneRadio.xhtml");
		dsl = new DSL();
		}
		
	@After
		public void finaliza() {
		killDriver();
	}
	
	@Test
	public void deveInteragirComRadioPrime() {
		dsl.clicarRadio(By.xpath("//input[@id='j_idt303:city:0']/../..//span"));
		Assert.assertTrue(dsl.isRadioMarcado("j_idt303:city:0"));
	}
	

}
