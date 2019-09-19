package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.PublicKey;
import java.util.List;

public class NewItemsPage extends BasePage {

    @FindBy(xpath = "//div[@id='pdopage']//i")
    private List<WebElement> btnListToFavorites;

    @FindBy(xpath = "//div[@id='pdopage']//a[@href='pantogor']")
    private List<WebElement> linklListitems;

    @FindBy(xpath = "//li[@class='top_menu__favorite']//a[@href='izbrannoe']")
    private WebElement btnFavorite;

    public NewItemsPage(WebDriver driver) {
        super(driver);
    }

    public NewItemsPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public NewItemsPage clickBtnToFavorites(){
        btnListToFavorites.get(0).click();
        return this;
    }

    public FavoritePage clickBtnFavorite() {
        btnFavorite.click();
        return new FavoritePage(driver);
    }

    public List<WebElement> getBtnListToFavorites() {
        return btnListToFavorites;
    }

    public List<WebElement> getLinklListitems() {
        return linklListitems;
    }

    public WebElement getBtnFavorite() {
        return btnFavorite;
    }
}
