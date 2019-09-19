package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PayOrderOnlinePage extends BasePage {

    @FindBy(xpath = "//div[@id='online_payment']//input[@name='phone']")
    private WebElement inputPhone;

    @FindBy(xpath = "//div[@id='online_payment']//input[@name='orderid']")
    private WebElement inputOrderid;

    @FindBy(xpath = "//div[@id='online_payment']//span[@class='modal_close']")
    private WebElement btnClose;

    @FindBy(xpath = "//div[@id='online_payment']//button[@type='submit']")
    private WebElement btnSubmit;

    @FindBy(id = "online_payment")
    private WebElement divOnlinePayment;

    public PayOrderOnlinePage(WebDriver driver) {
        super(driver);
    }

    public PayOrderOnlinePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public PayOrderOnlinePage sendKeysInputPhone(String phone) {
        inputPhone.click();
        inputPhone.sendKeys(phone);
        return this;
    }

    public PayOrderOnlinePage sendKeysInputOrderid(String orderid) {
        inputOrderid.sendKeys(orderid);
        return this;
    }

    public MainPage clickBtnClose() {
        btnClose.click();
        return new MainPage(driver, driverWait);
    }

    public PayOrderOnlinePage sendKeysFieldForm(String phone, String orderid) {
        sendKeysInputPhone(phone);
        sendKeysInputOrderid(orderid);
        return this;
    }

    public WebElement getInputPhone() {
        return inputPhone;
    }

    public WebElement getInputOrderid() {
        return inputOrderid;
    }

    public WebElement getBtnClose() {
        return btnClose;
    }

    public WebElement getBtnSubmit() {
        return btnSubmit;
    }

    public WebElement getDivOnlinePayment() {
        return divOnlinePayment;
    }

}
