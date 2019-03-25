package ro.elemental.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.support.PageFactory;
import ro.elemental.Appconfig;
import ro.elemental.TestBase;
import ro.elemental.pageobjects.Header;

public class Login extends TestBase{

    private Header header = PageFactory.initElements(driver, Header.class);

    @Given("^User start the homepage$")
    public void userStartTheHomepage() {
        driver.get(Appconfig.getSiteUrl());
    }


    @And("^User click to the my account link$")
    public void userClickToTheMyAccountLink() {

        header.clickONlogin();
    }
}
