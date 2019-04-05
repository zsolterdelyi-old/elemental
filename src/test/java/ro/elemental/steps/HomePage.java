package ro.elemental.steps;



import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import ro.elemental.TestBase;
import ro.elemental.pageobjects.Header;

public class HomePage extends TestBase {
    Header header = PageFactory.initElements(driver, Header.class);


    @Then("^The alert message appear$")
    public void theAlertMessageAppear() {


    }

    @When("^User change to the  \"([^\"]*)\" language$")
    public void userChangeTheLanguage(String preffered) {
        System.out.printf(driver.getTitle());



    }

    @Then("^The site \"([^\"]*)\" language will be changed to the expected one$")
    public void theSiteLanguageWillBeChangedToTheExpectedOne(String preffered) {
    }
 }
