package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MainPage extends BasePage{

    @FindBy(xpath = "//img[@alt='Высказать Благодарность']")
    private WebElement thankButton;

    @FindBy(xpath ="//*[text()='Помощь']")
    private WebElement helpMenuBtn;

    @FindBy(xpath ="//*[text()='Помощь']//..//*[text()='Служба контроля качества']")
    private WebElement serviceBtn;

    @FindBy(xpath = "//*[@href='https://opt.magazintrav.ru/']")
    private WebElement wholesaleBtn;

    @FindBy(xpath = "//input[@type='search']")
    private WebElement searchLabel;

    @FindBy(xpath = "//input[@id='q']")
    private WebElement bigSearchInputField;

    @FindBy(xpath = "//div[contains(@class, 'multi-content')]/span")
    private List<WebElement> multiContent;

    @FindBy(xpath = "//a[@href='#online_payment']")
    private WebElement btnPayForYourOrderOnline;

    @FindBy(xpath = "//div[@class='head']//img[@alt='Магазин трав Русские Корни']")
    private WebElement imgHeaderIcons;

    @FindBy(xpath = "//section[@class='bottom_rk']//a[@href='faq']")
    private WebElement faqLink;

    public MainPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void typeWordForSearch(String word) {
        searchLabel.click();
        bigSearchInputField.sendKeys(word);
    }

    public boolean isItemPresentByTitle(String title) {
        for (WebElement item : multiContent) {
            if (item.getText().contains(title)) {
                return true;
            }
        }
        return false;
    }

    public ThankPage openThankPage() {
        thankButton.click();
        return new ThankPage(driver);
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

    public MainPage clickMenuHelp() {
        clickButton(helpMenuBtn);
        return this;
    }

    public ServicePage clickService() {
        clickButton(serviceBtn);
        return new ServicePage(driver);
    }

    public WholesalePage clickWholesaleBtn() {
        clickButton(wholesaleBtn);
        return new WholesalePage(driver);
    }

    public FaqPage openFaqPage(){
        faqLink.click();
        return new FaqPage(driver);
    }
}
