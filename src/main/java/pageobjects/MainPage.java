package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends BasePage{

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@type='search']")
    private WebElement searchLabel;

    @FindBy(xpath = "//input[@id='q']")
    private WebElement bigSearchInputField;

    @FindBy(xpath = "//div[contains(@class, 'multi-content')]/span")
    private List<WebElement> multiContent;

    public void typeWordForSearch(String word) {
        searchLabel.click();
        bigSearchInputField.sendKeys(word);
    }

    public boolean isItemPresentByTitle(String title) {
        for (WebElement item : multiContent) {
            if (item.getText().contains(title)) {
                return true;
            }
        }
        return false;
    }

}
