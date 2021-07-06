package criarConta;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resources/features", glue = "criarConta", tags = "@executa2",dryRun = false, monochrome = true, plugin = {
				"pretty", "html: reports/cadastroinvalido.html" }

)

public class Runner {

}
