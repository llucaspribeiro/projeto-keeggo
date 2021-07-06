package criarConta;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resources/features", glue = "criarConta", tags = "@executa", dryRun = false, monochrome = true, plugin = {
				"pretty", "html: reports/cadastro.html" }

)

public class Executa {

}
