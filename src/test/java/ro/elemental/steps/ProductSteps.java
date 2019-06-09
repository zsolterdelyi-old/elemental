package ro.elemental.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import ro.elemental.TestBase;
import ro.elemental.pageobjects.Footer;
import ro.elemental.pageobjects.Header;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


public class ProductSteps extends TestBase {
    Header header = PageFactory.initElements(driver, Header.class);
    Footer footer = PageFactory.initElements(driver, Footer.class);




    @And("^I search for the wished \"([^\"]*)\"$")
    public void iSearchForTheWished(String keyword) {

        header.search(keyword);

        keyword="Hamamelis";


    }

    @And("^I open the product page and I add the item to the cart$")
    public void iOpenTheProductPageAndIAddTheItemToTheCart() {

        driver.findElement(By.xpath("//a[contains(text(),'Hamamelis')]")).click();
        driver.findElement(By.xpath("//button[@name='Submit']")).sendKeys(Keys.ENTER);


    }

    @Then("^The selected \"([^\"]*)\" should be added to the cart$")
    public void theSelectedShouldBeAddedToTheCart(String keyword) {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement cart = driver.findElement(By.xpath("//span[@class='cart_text']"));
    cart.click();

        String productName="Apă de Hamamelis Bio";
        String currentItem=driver.findElement(By.xpath("//p[@class='product-name s_title_block']//a[contains(text(),'Hamamelis')]")).getText();


          assertThat("The item is not added to cart", currentItem, is(equalTo(productName)));




    }

    @And("^I open the product page and I change the size$")
    public void iOpenTheProductPageAndIChangeTheSize() {

        driver.findElement(By.xpath("//a[contains(text(),'Bază lavantă blândă')]")).click();
        header.getGdpr().click();
        WebElement radio1 = driver.findElement(By.xpath("//div[@id='st-container']//li[2]//div[1]//span[1]//input[1]"));
        radio1.click();
        WebElement radio2 = driver.findElement(By.xpath("//div[@id='st-container']//li[3]//div[1]//span[1]//input[1]"));
        radio2.click();




    }

    @Then("^Size should be changed$")
    public void sizeShouldBeChanged() {

        String check = driver.findElement(By.xpath("//span[contains(@class,'checked')]//input[contains(@name,'group_1')]")).getText();

        Assert.assertTrue(check,true);
    }
}
