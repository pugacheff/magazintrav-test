package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

    public PayOrderOnlinePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
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

    public void waitInvisibilityOfElementLocated(String xpath) {
        driverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
    }

    public void waitVisibilityOfElementLocated(String xpath) {
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

}
