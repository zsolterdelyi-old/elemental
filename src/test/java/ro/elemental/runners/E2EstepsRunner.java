package ro.elemental.runners;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue= "ro.elemental",
        features = "src/test/java/ro/elemental/features/E2E.feature",
        plugin = {"html:target/cucumber-html-reports", "json:target/json-reports/E2E.json", "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/E2ESteps-report.html"}
)




public class E2EstepsRunner {
}
