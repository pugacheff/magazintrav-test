package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MainPage extends BasePage{

    @FindBy(xpath = "//div[@class='carousel_container topproducts']//div[1][@class='owl-item active']/div/a[2]")
    private WebElement itemBtn;

    @FindBy(xpath = "//img[@alt='Высказать Благодарность']")
    private WebElement thankButton;

    @FindBy(xpath ="//div[text()='Помощь']")
    private WebElement helpMenuBtn;

    @FindBy(xpath ="//div[text()='Помощь']//..//a[text()='Служба контроля качества']")
    private WebElement serviceBtn;

    @FindBy(xpath = "//div[text()='Помощь']//..//a[text()='Возврат']")
    private WebElement returnBtn;

    @FindBy(xpath = "//a[@href='https://opt.magazintrav.ru/']")
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

    @FindBy(xpath = "//a[@href='#callbackmodal']")
    private WebElement btnRequestCall;

    @FindBy(xpath = "//section[@class='bottom_rk']//a[@href='faq']")
    private WebElement faqLink;


    public MainPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public ItemPage clickItemBtn() {
        itemBtn.click();
        return new ItemPage(driver);
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

    public WebElement getBtnRequestCall() {
        return btnRequestCall;
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

    public RequestCallPage clickRequestCall() {
        btnRequestCall.click();
        return new RequestCallPage(driver, driverWait);
    }

    public ReturnPage clickReturnBtn() {
        clickButton(returnBtn);
        return new ReturnPage(driver);
    }

}
