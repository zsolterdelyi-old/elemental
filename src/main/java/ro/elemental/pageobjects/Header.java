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

    @FindBy(xpath = "//div[@class='banner']//h6[contains(text(), 'In the following period our company will move to a new location, consequently there will be delays in sending orders and replying to emails, and some phone numbers will not work temporarily.')]")
    private WebElement engAlert;

    @FindBy(xpath = "//div[@class='banner']//h6[contains(text(), 'Suntem în curs de mutare într-o locație nouă, ceea ce va cauza în zilele următoare întârzieri la expedierea coletelor. La emailuri vom răspunde cu o mică întârziere și unele numere de telefon nu vor funcționa temporar.')]")
    private WebElement roAlert;

    @FindBy(xpath = "//div[@class='banner']//h6[contains(text(), 'In the following period our company will move to a new location, consequently there will be delays in sending orders and replying to emails, and some phone numbers will not work temporarily.')]")
    private WebElement huAlert;






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



}
