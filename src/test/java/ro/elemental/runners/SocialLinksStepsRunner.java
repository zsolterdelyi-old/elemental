package ro.elemental.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue= "ro.elemental",
        features = "src/test/java/ro/elemental/features/SocialLinks.feature",
        plugin = {"html:target/social-html-reports", "json:target/json-reports/socialLinks.json",
                "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/SocialLinks-report.html"}
)



public class SocialLinksStepsRunner {
}
