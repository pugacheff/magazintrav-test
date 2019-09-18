package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ThankPage extends BasePage {

    @FindBy(xpath = "//select[@id='complaint_select']")
    WebElement complaintSelector;

    @FindBy(xpath = "//select[@id='complaint_select']/option[1]")
    WebElement selectedElement;

    @FindBy(id = "message")
    WebElement messageInputField;

    @FindBy(id = "order")
    WebElement orderInputField;

    @FindBy(id = "email")
    WebElement emailInputField;

    @FindBy(className = "b-yellow__btn")
    WebElement sendButton;

    @FindBy(xpath = "//button[@type='submit', contains(text(), 'Как купить и как получить покупку?')]")
    WebElement success;

    public ThankPage(WebDriver driver) {
        super(driver);
    }

    public ThankPage openComplaint() {
        complaintSelector.click();
        return this;
    }

    public ThankPage selectComplaint() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(selectedElement));
        selectedElement.click();
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
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(sendButton));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sendButton.click();
        return this;
    }

    public ThankPage waitingForSuccess() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(success));
        return this;
    }

}
