package qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driverfac {
	static WebDriver driver;

	public static WebDriver initbrowser(String browsername) {

		if (browsername.equals("chrome")) {

			driver = new ChromeDriver();

		} else {
			driver = new FirefoxDriver();

		}
		return driver;

	}

	public static WebDriver getbrowser() {
		return driver;
	}
}
