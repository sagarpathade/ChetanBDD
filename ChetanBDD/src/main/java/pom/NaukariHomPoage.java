package pom;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NaukariHomPoage {

	@FindBy(xpath = "//*[@id='login_Layer']")
	WebElement login;

	@FindBy(xpath = "//*[@placeholder='Enter your active Email ID / Username']")
	WebElement EmailID;

	@FindBy(xpath = "//*[@type='password']")
	WebElement Password;

	@FindBy(xpath = "//*[@class='btn-primary loginButton']")
	WebElement loginButton;

	@FindBy(xpath = "")
	WebElement e;

	private WebDriver driver;
	WebDriverWait wait;

//constructor
	public NaukariHomPoage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);//
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}

	public void login() {
		login.click();

	}

	public void emailid() {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Click the element using JavaScript
		js.executeScript("arguments[0].click();", EmailID);

		EmailID.sendKeys("sagarpathadeqa@gmail.com");
	}

	public void password() {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Click the element using JavaScript
		js.executeScript("arguments[0].click();", Password);

		Password.sendKeys("Dattu@2024");
	}

	public void loginButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Click the element using JavaScript
		js.executeScript("arguments[0].click();", loginButton);

		loginButton.click();
	}

}
