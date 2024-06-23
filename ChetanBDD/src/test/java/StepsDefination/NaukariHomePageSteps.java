package StepsDefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.NaukariHomPoage;
import qa.Driverfac;

public class NaukariHomePageSteps {

	NaukariHomPoage hh = new NaukariHomPoage(Driverfac.getbrowser());
//Implicitwait which apply for all page 
	
	
	
	@Given("user is at home page")
	public void user_is_at_home_page() {
		WebDriver driver = Driverfac.getbrowser();
		driver.get("https://www.naukri.com/");
	}

	@When("user click on Login")
	public void user_click_on_login()  {
		hh.login();
	}

	@When("user givens email id & password")
	public void user_givens_email_id_password()  {

		hh.emailid();
		hh.password();
	}

	@When("user click on login button")
	public void user_click_on_login_button()  {

		hh.loginButton();
	}

	@Then("user land on home page")
	public void user_land_on_home_page() {
		System.out.println("i am at home page ");
	}

}
