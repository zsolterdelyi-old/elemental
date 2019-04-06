package ro.elemental.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Footer {

    @FindBy(xpath = "//i[@class='icon-facebook icon-large']")
    private WebElement facebookLink;

    @FindBy(id = "stsocial_youtube")
    private WebElement youtubeLink;

    @FindBy(id = "stsocial_google")
    private WebElement gplusLink;

    @FindBy(id = "stsocial_instagram")
    private WebElement instagramLink;

    @FindBy(xpath = "//footer//img[@alt='Google Play']")
    private WebElement googlePlayLink;

    @FindBy(xpath = "//input[contains(@placeholder,'Adresa de email')]")
private WebElement newsletterPlaceholder;

    @FindBy(xpath = "//footer//button[@name='submitStNewsletter']")
    private WebElement newsletterButton;

    @FindBy(xpath = "//a[@title='Contact us']")
    private WebElement contactUs;

    @FindBy(xpath = "//a[@title='Despre noi']")
    private WebElement aboutUs;

    @FindBy(xpath = "//a[@title='Cariere']")
    private WebElement carier;

    @FindBy(xpath = "//a[@title='Termeni și condiții']")
    private WebElement conditions;

    public WebElement getFacebookLink() {
        return facebookLink;
    }

    public WebElement getYoutubeLink() {
        return youtubeLink;
    }

    public WebElement getGplusLink() {
        return gplusLink;
    }

    public WebElement getInstagramLink() {
        return instagramLink;
    }

    public WebElement getGooglePlayLink() {
        return googlePlayLink;
    }

    public WebElement getNewsletterPlaceholder() {
        return newsletterPlaceholder;
    }

    public WebElement getNewsletterButton() {
        return newsletterButton;
    }

    public WebElement getContactUs() {
        return contactUs;
    }

    public WebElement getAboutUs() {
        return aboutUs;
    }

    public WebElement getCarier() {
        return carier;
    }

    public WebElement getConditions() {
        return conditions;
    }
}
