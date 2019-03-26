package ro.elemental.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import ro.elemental.Appconfig;
import ro.elemental.TestBase;
import ro.elemental.pageobjects.Header;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Login extends TestBase {

    private Header header = PageFactory.initElements(driver, Header.class);
    private ro.elemental.pageobjects.Login login = PageFactory.initElements(driver, ro.elemental.pageobjects.Login.class);

    @Given("^User start the homepage$")
    public void userStartTheHomepage() {
        driver.get(Appconfig.getSiteUrl());
        driver.manage().window().maximize();
    }


    @And("^User click to the my account link$")
    public void userClickToTheMyAccountLink() {

        header.clickONlogin();
    }

    @When("^User submit the correct password and username and click to subbmit button$")
    public void userSubmitTheCorrectPasswordAndUsernameAndClickToSubbmitButton() {


        String email = "erdelyizsoltcsaba@gmail.com";
        String password = "Joshua12";


        login.loginToMyAccount(email, password);

    }

    @Then("^User will be logged in my account area$")
    public void userWillBeLoggedInMyAccountArea() {

        String pageTitle = driver.getTitle();
        String expactedTitle = "Contul Meu - Elemental";

        assertThat("You are not in the account page. ", pageTitle, is(expactedTitle));


    }
}

