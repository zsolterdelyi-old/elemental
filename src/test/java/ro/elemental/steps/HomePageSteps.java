package ro.elemental.steps;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import ro.elemental.TestBase;
import ro.elemental.pageobjects.Footer;
import ro.elemental.pageobjects.Header;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;

public class HomePageSteps extends TestBase {
    Header header = PageFactory.initElements(driver, Header.class);
    Footer footer = PageFactory.initElements(driver, Footer.class);

    @Then("^The alert message appear$")
    public void theAlertMessageAppear() {
    }

    @When("^User change to the  \"([^\"]*)\" language$")
    public void userChangeTheLanguage(String preffered) {
        header.getRoButtonLink().click();
        assertThat("You are not on the romanian page. ", driver.getCurrentUrl(), startsWith("https://www.elemental.eu/ro"));
        header.getEngButtonLink().click();
        assertThat("You are not on the english page. ", driver.getCurrentUrl(), startsWith("https://www.elemental.eu/en"));
        header.getHuButtonLink().click();
        assertThat("You are not on the hungarian page. ", driver.getCurrentUrl(), startsWith("https://www.elemental.eu/hu"));
    }

    @Then("^The site \"([^\"]*)\" language will be changed to the expected one$")
    public void theSiteLanguageWillBeChangedToTheExpectedOne(String preffered) {
    }

    @And("^I scroll down to the footer$")
    public void iScrollDownToTheFooter() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    @When("^I submit my email adress to the newsletter field and click the submit button$")
    public void iSubmitMyEmailAdressToTheNewsletterFieldAndClickTheSubmitButton() {

        footer.getNewsletterPlaceholder().sendKeys(getEmail());
        footer.getNewsletterButton().click();
    }



    @And("^User accept the gdpr$")
    public void userAcceptTheGdpr() {

        header.getGdpr().click();
    }

    @Then("^I will see a captcha verification$")
    public void iWillSeeACaptchaVerification() {

     //   WebDriverWait wait = new WebDriverWait);

        //  driver.findElement(By.id("#recaptcha-accessible-status"));
       // driver.findElement(By.xpath("//div[@class='alert alert-danger']")):
      //  assertTrue(isElementPresent);



    }


    @Then("^User check out$")
    public void userCheckOut() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//a[@class='linkomlogat']"));
        builder.moveToElement(element).build().perform();
        driver.findElement(By.xpath("//a[contains(text(),'Ieșire')]")).click();
    }
}
