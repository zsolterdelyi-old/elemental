package ro.elemental.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import ro.elemental.TestBase;
import ro.elemental.pageobjects.Footer;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class Social extends TestBase {

    Footer footer = PageFactory.initElements(driver, Footer.class);

    @When("^I select the facebook link in footer$")
    public void iSelectTheFacebookLink() throws InterruptedException {

        footer.getFacebookLink().click();

    }

    @Then("^A new window with the facebook page will be opened$")
    public void aNewWindowWithTheFacebookPageWillBeOpened() {
        Set<String> windowId = driver.getWindowHandles();
        Iterator<String> iterator = windowId.iterator();
        String parentId = iterator.next();
        String childId = iterator.next();
        driver.switchTo().window(childId);
     //   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String currentUrl = driver.getCurrentUrl();
        String waitedUrl = "https://www.facebook.com/ElementalEU";

        assertThat("The facebook page is not opened. ", currentUrl, is(equalTo(waitedUrl)));

        driver.switchTo().window(parentId);
    }

}
