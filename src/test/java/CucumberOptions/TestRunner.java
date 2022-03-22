package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//features


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "stepDefinations", stepNotifications = true, tags= "@PortalTest",dryRun= true,monochrome = true,
		plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json", "junit:target/report.xml" })
public class TestRunner {


	
}
