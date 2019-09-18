package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WholesalePage extends BasePage {

    @FindBy(xpath = "//a[@class='mail']")
    private WebElement emailOprLabel;

    public WholesalePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEmailOpt() {
        return emailOprLabel;
    }

}
