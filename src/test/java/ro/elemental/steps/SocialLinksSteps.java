package ro.elemental.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import ro.elemental.TestBase;
import ro.elemental.pageobjects.Footer;

import java.util.Iterator;
import java.util.Set;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


public class SocialLinksSteps extends TestBase {

    Footer footer = PageFactory.initElements(driver, Footer.class);

    @When("^I select the facebook link in footer$")
    public void iSelectTheFacebookLink() throws InterruptedException {
        footer.getFacebookLink().click();
    }

    @When("^I select the youtube link in footer$")
    public void iSelectTheYoutubeLinkInFooter() {
        footer.getYoutubeLink().click();
    }

    @When("^I select the gplus link in footer$")
    public void iSelectTheGplusLinkInFooter() {
        footer.getGplusLink().click();
    }

    @When("^I select the instagram link in footer$")
    public void iSelectTheInstagramLinkInFooter() {
        footer.getInstagramLink().click();
    }

    public void windowHandleChild() {
        Set<String> windowId = driver.getWindowHandles();
        Iterator<String> iterator = windowId.iterator();
        String parentId = iterator.next();
        String childId = iterator.next();
        driver.switchTo().window(childId);
    }

    public void windowHandleBack() {
        Set<String> windowId = driver.getWindowHandles();
        Iterator<String> iterator = windowId.iterator();
        String parentId = iterator.next();
        String childId = iterator.next();
        driver.switchTo().window(parentId);
    }


    @Then("^A new window with the facebook page will be opened$")
    public void aNewWindowWithTheFacebookPageWillBeOpened() throws InterruptedException {
        windowHandleChild();
        Thread.sleep(2000);
        String currentUrl = driver.getCurrentUrl();
        String waitedUrl = "https://www.facebook.com/ElementalEU";

        assertThat("The facebook page is not opened. ", currentUrl, is(equalTo(waitedUrl)));
        windowHandleBack();
    }


    @Then("^A new window with the youtube page will be opened$")
    public void aNewWindowWithTheYoutubePageWillBeOpened() throws InterruptedException {
        windowHandleChild();
        Thread.sleep(2000);
        String currentUrl = driver.getCurrentUrl();
        String waitedUrl = "https://www.youtube.com/user/ElementalHDTV";
        assertThat("The youtube page is not opened. ", currentUrl, is(equalTo(waitedUrl)));
        windowHandleBack();
    }


    @Then("^A new window with the gplus page will be opened$")
    public void aNewWindowWithTheGplusPageWillBeOpened() throws InterruptedException {
        windowHandleChild();
        Thread.sleep(2000);
        String currentUrl = driver.getCurrentUrl();
        assertThat("The Gplus page is not opened. ", currentUrl, containsString("accounts.google.com"));
        windowHandleBack();
    }

    @Then("^A new window with the instagram page will be opened$")
    public void aNewWindowWithTheInstagramPageWillBeOpened() throws InterruptedException {
        windowHandleChild();
        Thread.sleep(2000);
        String currentUrl = driver.getCurrentUrl();
        String waitedUrl = "https://www.instagram.com/elemental_eu/";
        assertThat("The instagram page is not opened. ", currentUrl, is(equalTo(waitedUrl)));
        windowHandleBack();
    }
}
