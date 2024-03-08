package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"features"},
        glue = {"steps"},
        dryRun = false,
       // name = "Login", //scenario name has this text
        tags = "@login",
        plugin = {"pretty","html:MyTestReport.html"}
)
public class TestRunner {
}
