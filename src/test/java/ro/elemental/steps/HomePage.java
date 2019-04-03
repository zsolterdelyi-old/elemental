package ro.elemental.steps;


import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ro.elemental.TestBase;

public class HomePage extends TestBase {
    @Then("^The alert message appear$")
    public void theAlertMessageAppear() {


    }

    @When("^User change the  ([^\"]*) language$")
    public void userChangeTheLanguage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^The site ([^\"]*) language will be changed to the expected one$")
    public void theSiteLanguageWillBeChangedToTheExpectedOne(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
