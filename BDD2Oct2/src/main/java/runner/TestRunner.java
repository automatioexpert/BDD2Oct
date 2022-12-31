package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "F:\\Oct2022\\BDD2Oct\\src\\test\\resources\\Features\\logintoprod.feature",glue="tests",monochrome = true
)
public class TestRunner {
	
	

	//src/test/resources/cucumber.properties:          cucumber.publish.quiet=true      │
	
}
