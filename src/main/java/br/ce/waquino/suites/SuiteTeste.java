package br.ce.waquino.suites;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import be.ce.waquino.test.TesteCadastroERegrasDeNegocio;
import be.ce.waquino.test.TesteRegrasCadastro;
import br.ce.waquino.core.DriverFactory;

@RunWith(Suite.class)
@SuiteClasses({
	TesteCadastroERegrasDeNegocio.class,
	TesteRegrasCadastro.class
})
public class SuiteTeste {
	
	@AfterClass
	public static void finalizaTudo() {
		DriverFactory.killDriver();
	}

}
