package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FaqPage extends BasePage{

    public FaqPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//div[@class='title_faq' and contains(text(), 'Как сделать заказ?')]")
    WebElement howToOrderOpen;

    @FindBy(xpath = "//div[@class='hidden_block']/h2[contains(text(), 'Как купить и как получить покупку?')]")
    WebElement textForTest;

    public FaqPage openMenu(){
        howToOrderOpen.click();
        return this;
    }

    public boolean checkVisible(){
        return textForTest.isDisplayed();
    }
}
