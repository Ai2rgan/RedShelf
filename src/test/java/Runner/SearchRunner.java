package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber.json", "junit:target/cucumber.xml"},
        features ="src/test/resources/com.cucumber.features.redshelf/Search.feature" ,
        glue = "StepDefinitions",
        tags="@4"

)

public class SearchRunner {
}
