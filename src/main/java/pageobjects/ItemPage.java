package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends BasePage {

    @FindBy(xpath = "//h1[@itemprop='name']")
    private WebElement itemName;
    @FindBy(xpath = "//div[@class='product-icons']")
    private WebElement itemImg;
    @FindBy(xpath = "//span[@itemprop='price']")
    private WebElement itemPrice;
    @FindBy(xpath = "//div[@class='cart_add']//button[@value='cart/add']")
    private WebElement itemAddBtn;
    @FindBy(xpath = "//div[@class='cart_add']//div[@class='cart_amount_plus']")
    private WebElement itemAmountPlus;
    @FindBy(xpath = "//div[@class='cart_add']//div[@class='cart_amount_minus']")
    private WebElement itemAmountMinus;
    @FindBy(xpath = "//div[@class='cart_add']//input[@name='count']")
    private WebElement itemAmountInputField;
    @FindBy(xpath = "//h2[text()='С этим товаром покупают']")
    private WebElement buyAlsoLabel;
    @FindBy(xpath = "//div[1][@class='carousel_container productbought']/div")
    private WebElement buyAlsoContainer;
    @FindBy(xpath = "//div[1]/div/div/div/div[1]/div[@class='item']")
    private WebElement buyAlsoItemContainer;
    @FindBy(xpath = "//div[1]/div/div/div/div[1]/div[@class='item']//button")
    private WebElement buyAlsoItemAddBtn;
    @FindBy(xpath = "//a[text()='Продолжить покупки']")
    private WebElement continueShoppingBtn;


    public ItemPage(final WebDriver driver) {
        super(driver);
    }

    public WebElement getItemName() {
        return itemName;
    }

    public WebElement getItemImg() {
        return itemImg;
    }

    public WebElement getItemPrice() {
        return itemPrice;
    }

    public WebElement getItemAddBtn() {
        return itemAddBtn;
    }

    public WebElement getItemAmountPlus() {
        return itemAmountPlus;
    }

    public WebElement getItemAmountMinus() {
        return itemAmountMinus;
    }

    public WebElement getItemAmountInputField() {
        return itemAmountInputField;
    }

    public WebElement getBuyAlsoLabel() {
        return buyAlsoLabel;
    }

    public WebElement getBuyAlsoContainer() {
        return buyAlsoContainer;
    }

    public WebElement getBuyAlsoItemContainer() {
        return buyAlsoItemContainer;
    }

    public WebElement getBuyAlsoItemAddBtn() {
        return buyAlsoItemAddBtn;
    }

    public WebElement getContinueShoppingBtn() {
        return continueShoppingBtn;
    }
}
