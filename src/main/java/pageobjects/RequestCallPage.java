package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RequestCallPage extends BasePage {

    @FindBy(id = "name_callback")
    private WebElement inputNameCallBack;

    @FindBy(id = "email_callback")
    private WebElement inputEmailCallBack;

    @FindBy(id = "phone_callback")
    private WebElement inputPhoneCallBack;

    @FindBy(id = "order_callback")
    private WebElement inputOrderCallBack;

    @FindBy(xpath = "//form[@id='callbackForm']//button[@type='submit']")
    private WebElement btnSubmit;

    @FindBy(xpath = "//div[@id='callbackmodal']//span[@class='modal_close']")
    private WebElement btnClose;

    @FindBy(id = "callbackmodal")
    private WebElement divRequestCall;

    public RequestCallPage(WebDriver driver) {
        super(driver);
    }

    public RequestCallPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public RequestCallPage sendKeysInputNameCallBack(String name) {
        inputNameCallBack.sendKeys(name);
        return this;
    }

    public RequestCallPage sendKeysInputEmailCallBack(String email) {
        inputEmailCallBack.sendKeys(email);
        return this;
    }

    public RequestCallPage sendKeysInputPhoneCallBack(String phone) {
        inputPhoneCallBack.click();
        inputPhoneCallBack.sendKeys(phone);
        return this;
    }

    public RequestCallPage sendKeysInputOrderCallBack(String order) {
        inputOrderCallBack.sendKeys(order);
        return this;
    }

    public RequestCallPage sendKeysFieldFormCallBack(String name, String email, String phone, String order) {
        sendKeysInputNameCallBack(name);
        sendKeysInputEmailCallBack(email);
        sendKeysInputPhoneCallBack(phone);
        sendKeysInputOrderCallBack(order);
        return this;
    }

    public MainPage clickBtnClose() {
        btnClose.click();
        return new MainPage(driver, driverWait);
    }

    public WebElement getInputNameCallBack() {
        return inputNameCallBack;
    }

    public WebElement getInputEmailCallBack() {
        return inputEmailCallBack;
    }

    public WebElement getInputPhoneCallBack() {
        return inputPhoneCallBack;
    }

    public WebElement getInputOrderCallBack() {
        return inputOrderCallBack;
    }

    public WebElement getBtnSubmit() {
        return btnSubmit;
    }

    public WebElement getBtnClose() {
        return btnClose;
    }

    public WebElement getDivRequestCall() {
        return divRequestCall;
    }
}
