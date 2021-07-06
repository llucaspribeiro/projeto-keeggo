package login;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resources/features", glue = "login", tags = "@logininvalido",dryRun = false, monochrome = true, plugin = {
				"pretty", "html: target/logininvalido.html" }

)

public class Runner {

}
