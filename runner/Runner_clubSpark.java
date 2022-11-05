package runner;

import org.testng.xml.dom.Tag;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = {".//src//test//java"},
		glue ="stepdefination",
		tags = " @Postclub",
		dryRun =false,
		monochrome=true,
		plugin= {
				"pretty"
		}
		)

public class Runner_clubSpark extends AbstractTestNGCucumberTests {

}
