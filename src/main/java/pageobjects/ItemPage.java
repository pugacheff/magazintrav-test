package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage {

    @FindBy(xpath = "//h1[@itemprop='name']")
    WebElement itemName;
    @FindBy(xpath = "//div[@class='product-icons']")
    WebElement itemImg;
    @FindBy(xpath = "//span[@itemprop='price']")
    WebElement itemPrice;
    @FindBy(xpath = "//div[@class='cart_add']//button[@value='cart/add']")
    WebElement itemAddBtn;
    @FindBy(xpath = "//div[@class='cart_add']//div[@class='cart_amount_plus']")
    WebElement itemAmountPlus;
    @FindBy(xpath = "//div[@class='cart_add']//div[@class='cart_amount_minus']")
    WebElement itemAmountMinus;
    @FindBy(xpath = "//div[@class='cart_add']//input[@name='count']")
    WebElement itemAmountInputField;

    private final WebDriver driver;

    public ItemPage(final WebDriver driver) {
        this.driver = driver;
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
}
