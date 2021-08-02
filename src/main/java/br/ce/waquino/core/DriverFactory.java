package br.ce.waquino.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	private static WebDriver driver; 
	
	private DriverFactory() {}
	
	public static WebDriver getDriver() {
		if(driver == null  ) {
			//switch (Propriedades.browser) {
			//case FIREFOX: driver = new FirefoxDriver(); break; 
			//case CHROME: driver = new ChromeDriver(); break;
			//}
			System.setProperty("webdriver.gecko.driver", "/Users/Katiri/Downloads/Drivers/geckodriver/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().setSize(new org.openqa.selenium.Dimension(1200, 765));
		}
		return driver; 
	}
	
	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null; 
		}

	}
}
