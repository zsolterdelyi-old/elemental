package ro.elemental.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue= "ro.elemental",
        features = "src/test/java/ro/elemental/features/Login.feature",
        plugin = {"html:target/cucumber-html-reports", "json:target/json-reports/login.json", "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/LoginSteps-report.html"}
)



public class LoginStepsRunner {



}
