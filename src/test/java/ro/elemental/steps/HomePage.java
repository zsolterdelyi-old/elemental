package ro.elemental.steps;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ro.elemental.TestBase;

public class HomePage extends TestBase {
    @Then("^The alert message appear$")
    public void theAlertMessageAppear() {


    }

    @When("^User change the <\"([^\"]*)\">$")
    public void userChangeThe(String language) {


    }

    @Then("^The site <\"([^\"]*)\"> will be changed to the preferred one$")
    public void theSiteWillBeChangedToThePreferredOne(String language) {


    }
}
