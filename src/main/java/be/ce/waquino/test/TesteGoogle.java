package be.ce.waquino.test;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteGoogle {

	@Test
	public void teste() {
		System.setProperty("webdriver.gecko.driver", "/Users/Katiri/Downloads/Drivers/geckodriver/geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "/Users/Katiri/Downloads/#Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().setPosition(new Point(100, 100)); 
		driver.manage().window().setSize(new org.openqa.selenium.Dimension(1200, 765));
		//driver.manage().window().maximize(); 
		driver.get("http://www.google.com");
		//System.out.println(driver.getTitle());
		Assert.assertEquals("Google", driver.getTitle());
		driver.quit(); 
	}
}
