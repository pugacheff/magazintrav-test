package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReturnPage extends BasePage {

    @FindBy(xpath = "//h1[text()='Правила возврата товара']")
    private WebElement ruleTextField;

    public ReturnPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getRuleTextField() {
        return ruleTextField;
    }

}
