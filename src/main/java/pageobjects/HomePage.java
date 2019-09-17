package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(xpath ="//*[text()='Помощь']")
    private WebElement helpMenuBtn;

    @FindBy(xpath ="//*[text()='Помощь']//..//*[text()='Служба контроля качества']")
    private WebElement serviceBtn;

    public HomePage(WebDriver driver) {
        super(driver);
        this.drvier = driver;
    }

    public HomePage clickMenuHelp() {
        clickButton(helpMenuBtn);
        return this;
    }

    public ServicePage clickService() {
        clickButton(serviceBtn);
        return PageFactory.initElements(drvier, ServicePage.class);
    }
}
