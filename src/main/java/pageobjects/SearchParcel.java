package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchParcel extends BasePage {

    @FindBy(xpath ="//*[text()='Помощь']")
    private WebElement helpBtn;

    @FindBy(xpath ="//*[text()='Помощь']//..//*[text()='Где посылка?']")
    private WebElement whereParcel;

    public SearchParcel(WebDriver driver) {
        super (driver);
    }

    public SearchParcel helpButton(){
        helpBtn.click();
        return this;
    }

    public SearchParcel whereParcelButton() {
        whereParcel.click();
        return this;
    }
}