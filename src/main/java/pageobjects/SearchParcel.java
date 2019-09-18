package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchParcel extends BasePage {

    WebDriver driver;
    @FindBy(xpath = "//*[text()='Помощь']")
    WebElement helpBtn;
    @FindBy(linkText = "https://pochta.ru/tracking")
    WebElement whereParcel;

    public SearchParcel(WebDriver driver) {
        super (driver);
        this.driver = driver;
    }
    public SearchParcel helpButton() {
        helpBtn.click();
        return this;
    }

    public SearchParcel whereParcelButton() {
        whereParcel.click();
        return this;
    }

}
