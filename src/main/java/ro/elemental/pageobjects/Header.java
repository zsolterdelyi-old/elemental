package ro.elemental.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header {

    @FindBy(xpath = "//span[contains(text(),'Intră în cont')]")
    private WebElement loginButton;

    public void clickONlogin(){

        loginButton.click();
    }

    public WebElement getLoginButton() {
        return loginButton;
    }
}
