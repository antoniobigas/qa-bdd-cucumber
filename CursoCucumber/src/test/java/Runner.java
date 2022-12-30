import org.junit.runner.RunWith;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = "pretty",
		language = "pt",
		monochrome = true,
		snippets = SnippetType.CAMELCASE			
		)
public class Runner{


}

