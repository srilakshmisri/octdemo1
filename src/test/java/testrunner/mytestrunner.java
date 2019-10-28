package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\s.srinadhuni\\eclipse-workspace\\Selenium_Nextgen\\gitbdddemo1\\features\\multiscenario.feature", 
glue={"stepdefs"},
monochrome=true,
plugin= {"pretty","html:target/cucreports"}
		)


public class mytestrunner {

}
