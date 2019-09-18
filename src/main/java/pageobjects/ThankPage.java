package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ThankPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"complaint_select\"]/option[2]")
    WebElement complaintSelector;

    @FindBy(id = "message")
    WebElement messageInputField;

    @FindBy(id = "order")
    WebElement orderInputField;

    @FindBy(id = "email")
    WebElement emailInputField;

    @FindBy(className = "b-yellow__btn")
    WebElement sendButton;

    @FindBy(xpath = "//*[@class=\"jGrowl-message\"]")
    WebElement success;

    public ThankPage(WebDriver driver) {
        super(driver);
    }

    public ThankPage selectComplaint() {
        complaintSelector.click();
        return this;
    }

    public ThankPage inputMessage(String message) {
        messageInputField.sendKeys(message);
        return this;
    }

    public ThankPage inputOrder(String order) {
        orderInputField.sendKeys(order);
        return this;
    }

    public ThankPage inputEmail(String email) {
        emailInputField.sendKeys(email);
        return this;
    }

    public ThankPage sendComplaints() {
        sendButton.click();
        return this;
    }

    public ThankPage waitingForSuccess() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOf(success));
        return this;
    }


}
