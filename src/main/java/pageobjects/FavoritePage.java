package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FavoritePage extends BasePage{

    @FindBy(xpath = "//div[@id='pdopage']//li[@class='each_product_rk']")
    private List<WebElement> ListFavoritesItems;

    @FindBy(xpath = "//div[@id='pdopage']//a[@href='pantogor']")
    private List<WebElement> linklListitems;

    public FavoritePage(WebDriver driver) {
        super(driver);
    }

    public FavoritePage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public List<WebElement> getListFavoritesItems() {
        return ListFavoritesItems;
    }

    public List<WebElement> getLinklListitems() {
        return linklListitems;
    }
}
