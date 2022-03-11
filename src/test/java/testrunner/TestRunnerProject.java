package testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		
	features = "src/test/java/features",
	glue = {"stepdefination"},
	monochrome = true,
	plugin={"pretty","html:reports/cucumber-pretty"}
	
		
		)
public class TestRunnerProject {

}
