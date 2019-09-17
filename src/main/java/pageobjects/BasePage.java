package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver ;
    protected WebDriverWait driverWait;
    public JavascriptExecutor jse ;
    public Select select ;
    public Actions action ;

    public BasePage(WebDriver driver, WebDriverWait driverWait) {
        PageFactory.initElements(driver, this);
        this.driverWait = driverWait;
        this.driver = driver;
    }

    protected static void clickButton(WebElement button) {
        button.click();
    }

    protected static void setTextElementText(WebElement textElement , String value) {
        textElement.sendKeys(value);
    }

    public void scrollToBottom() {
        jse.executeScript("scrollBy(0,2500)");
    }

    public void clearText(WebElement element) {
        element.clear();
    }

}
