package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage{


    @FindBy(xpath = "//a[@href='#online_payment']")
    private WebElement btnPayForYourOrderOnline;

    @FindBy(xpath = "//div[@class='head']//img[@alt='Магазин трав Русские Корни']")
    private WebElement imgHeaderIcons;

    public MainPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }


    public WebElement getBtnPayForYourOrderOnline() {
        return btnPayForYourOrderOnline;
    }

    public WebElement getImgHeaderIcons() {
        return imgHeaderIcons;
    }

    public PayOrderOnlinePage clickBtnPayForYourOrderOnline() {
        btnPayForYourOrderOnline.click();
        return new PayOrderOnlinePage(driver, driverWait);
    }

}
