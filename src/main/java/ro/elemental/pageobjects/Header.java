package ro.elemental.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header {

    @FindBy(xpath = "//span[contains(text(),'Intră în cont')]")
    private WebElement loginButton;

    @FindBy(id = "search_query_top")
    private WebElement searchField;

    @FindBy(xpath = "//div[@id='searchbox_inner']//button[@class='button-search']")
    private WebElement searchButton;

    @FindBy(xpath = "//a[@id='logo_left']")
    private WebElement mainLogo;

    @FindBy(xpath = "//a[@title='Ajutor']")
    private WebElement help;

    @FindBy(xpath = "//span[@class='cart_text']")
    private WebElement cart;

    @FindBy(xpath = "//div[@class='banner']//h6")
    private WebElement AlertMessage;

    @FindBy(xpath = "//span[contains(text(), 'Română')]")
    private WebElement roButtonLink;

    @FindBy(xpath = "//span[contains(text(),'English')]")
    private WebElement engButtonLink;

    @FindBy(xpath = "//span[contains(text(),'Magyar')]")
    private WebElement huButtonLink;


    public void clickONlogin() {

        loginButton.click();
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getSearchField() {
        return searchField;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getMainLogo() {
        return mainLogo;
    }

    public WebElement getHelp() {
        return help;
    }

    public WebElement getCart() {
        return cart;
    }

    public WebElement getRoButtonLink() {
        return roButtonLink;
    }

    public WebElement getAlertMessage() {
        return AlertMessage;

    }

    public WebElement getEngButtonLink() {
        return engButtonLink;
    }

    public WebElement getHuButtonLink() {
        return huButtonLink;
    }
}
