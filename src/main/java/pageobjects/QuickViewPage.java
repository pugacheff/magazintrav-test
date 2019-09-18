package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuickViewPage extends BasePage {

    @FindBy(xpath ="//*[text()='Морозник кавказский корень 10 гр.']/..//*[@class='quickview']")
    private WebElement quickViewBtn;

    @FindBy(xpath = "//*[@class='title']")
    private WebElement titleProductLabel;

    @FindBy(xpath = "//*[@class='new-price']")
    private WebElement priceProductLabel;

    @FindBy(xpath = "//*[text()='01917']")
    private WebElement vendorCodeLabel;

    @FindBy(xpath = "//*[text()='Свечи/суппозитории']")
    private WebElement releaseFormLabel;

    @FindBy(xpath = "//*[text()='26']")
    private WebElement weightProductLabel;

    @FindBy(xpath = "//*[@href='material_bioprofi']")
    private WebElement manufactureProductLabel;

    @FindBy(xpath = "//*[@name='ms2_action']")
    private WebElement basketBtn;

    @FindBy(xpath = "//*[@class='cart_amount_plus']")
    private WebElement quantityProductCheckbox;

    public QuickViewPage(WebDriver driver) {
        super(driver);
    }

    public QuickViewPage btnClick() {
        clickButton(quickViewBtn);
        return this;
    }

    public WebElement getTitleProductLabel() {
        return titleProductLabel;
    }

    public WebElement getPriceProductLabel() {
        return priceProductLabel;
    }

    public WebElement getVendorCodeLabel() {
        return vendorCodeLabel;
    }

    public WebElement getReleaseFormLabel() {
        return releaseFormLabel;
    }

    public WebElement getWeightProductLabel() {
        return weightProductLabel;
    }

    public WebElement getManufactureProductLabel() {
        return manufactureProductLabel;
    }

    public WebElement getBasketBtn() {
        return basketBtn;
    }

    public QuickViewPage changeQuantity() {
        clickButton(quantityProductCheckbox);
        return this;
    }

}