package ro.elemental.steps;

import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import ro.elemental.TestBase;
import ro.elemental.pageobjects.Header;

public class Language extends TestBase {
    @When("^User change the site language$")
    public void userChangeTheSiteLanguage() {

        Header header = PageFactory.initElements(driver, Header.class);

        System.out.printf(header.getAlertMessage().getText());

    }
}
