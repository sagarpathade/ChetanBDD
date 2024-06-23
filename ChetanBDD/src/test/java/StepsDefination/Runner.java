package StepsDefination;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"src\\test\\resources\\featurefile\\Naukari.feature"},
		glue= {"StepsDefination"},
		plugin= {"pretty"})


public class Runner extends AbstractTestNGCucumberTests{

}
