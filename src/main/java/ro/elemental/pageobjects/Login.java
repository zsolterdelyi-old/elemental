package ro.elemental.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Login {

    @FindBy(id = "email_create")
    private WebElement emailCreate;

    @FindBy(id = "email")
    private WebElement loginEmail;

    @FindBy(id = "passwd")
    private WebElement loginPassword;

    @FindBy(xpath = "//a[@title='Recover your forgotten password']")
    private WebElement passwordRecoveryLink;

    @FindBy(xpath = "//div[@class='alert alert-danger']//li")
    private WebElement alertMessage;


    @FindBy(name = "SubmitLogin")
    private WebElement submitButton;

    public WebElement getEmailCreate() {
        return emailCreate;
    }

    public WebElement getLoginEmail() {
        return loginEmail;
    }

    public WebElement getLoginPassword() {
        return loginPassword;
    }

    public WebElement getPasswordRecoveryLink() {
        return passwordRecoveryLink;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public WebElement getAlertMessage() { return alertMessage; }

    public void loginToMyAccount(String email, String password) {



        getLoginEmail().sendKeys(email);
        getLoginPassword().sendKeys(password);
        getSubmitButton().click();

    }
}
