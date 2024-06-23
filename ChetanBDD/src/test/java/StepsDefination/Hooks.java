package StepsDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import qa.Driverfac;

public class Hooks {

	WebDriver driver;

	@Before
	public void launchBrowser() {

		Driverfac dd = new Driverfac();
		driver = dd.initbrowser("chrome");
		driver.manage().window().maximize();
		
	}
	@BeforeStep
	public void impliwait() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	
	

//	@After
//	public void teardown() {
//		driver.quit();
	}

