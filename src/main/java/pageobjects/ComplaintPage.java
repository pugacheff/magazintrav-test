package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComplaintPage extends BasePage {

    @FindBy(xpath = "//*[@id='complaint_select']")
    private WebElement causeCheckbox;

    @FindBy(xpath = "//*[@value='Интернет магазин (функционал сайта)']")
    private WebElement causeChoiceLabel;

    @FindBy(xpath = "//*[@id='message']")
    private WebElement essenceСomplaintForm;

    @FindBy(xpath = "//*[@id='order']")
    private WebElement numberOrderForm;

    @FindBy(xpath = "//*[@id='name']")
    private WebElement nameUserForm;

    @FindBy(xpath = "//*[@id='phone']")
    private WebElement phoneNumberForm;

    @FindBy(xpath = "//*[@id='email']")
    private WebElement emailForm;

    @FindBy(xpath = "//*[@class='b-yellow__btn']")
    private WebElement sendComplaintBtn;

    public ComplaintPage(WebDriver driver) {
        super(driver);
        this.drvier = driver;
    }

    private ComplaintPage clickCauseCheckbox() {
        clickButton(causeCheckbox);
        return this;
    }

    private ComplaintPage setCauseChoice() {
        clickButton(causeChoiceLabel);
        return this;
    }

    public ComplaintPage setCause() {
        clickCauseCheckbox();
        setCauseChoice();
        return this;
    }

    public ComplaintPage setTextEssenceComplaintForm(String str) {
        essenceСomplaintForm.sendKeys(str);
        return this;
    }

    public ComplaintPage setTextNumberOrderForm(String str) {
        numberOrderForm.sendKeys(str);
        return this;
    }

    public ComplaintPage setNameUserForm(String str) {
        nameUserForm.sendKeys(str);
        return this;
    }

    public ComplaintPage setPhoneNumberForm(String str) {
        phoneNumberForm.sendKeys(str);
        return this;
    }

    public ComplaintPage setEmailForm(String str) {
        emailForm.sendKeys(str);
        return this;
    }

    public ComplaintPage sendClick() {
        clickButton(sendComplaintBtn);
        return this;
    }
}
