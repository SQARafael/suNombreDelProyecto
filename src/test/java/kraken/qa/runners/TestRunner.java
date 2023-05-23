package kraken.qa.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/Test.feature",glue="kraken.qa.stepdefinitions",
snippets= CucumberOptions.SnippetType.CAMELCASE)
public class TestRunner {

}
