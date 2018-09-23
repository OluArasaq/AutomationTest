package hooks;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Controller;

public class Setup {
//	WebDriver driver; 
	Controller controller;
	
	public Setup(Controller controller){
		
		this.controller = controller; 
	}
	
	
	@Before
	public void Initialisation(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CashConverters\\workspace\\test_automation\\chromedriver.exe");
		controller.driver = new ChromeDriver(); 
		controller.driver.get("https://www.valtech.co.uk/");
		controller.driver.manage().window().maximize();
	
	}
	
	@After
	public void TearDown(){
		
		controller.driver.quit();
		
	}

}
