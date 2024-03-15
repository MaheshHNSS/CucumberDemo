package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"features"},
        glue = {"steps"},
        dryRun = false,
      //  name = "login", //scenario name has this text
        tags = "@demo_scenariooutline",
        plugin = {"pretty","html:MyTestReport.html"}
)
public class TestRunner {
}
