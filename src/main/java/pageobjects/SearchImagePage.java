package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchImagePage extends BasePage {

    @FindBy(xpath = "//div[@class='top-slider']")
    private WebElement searchImage;

    public SearchImagePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchImage(){
        return searchImage;
    }

}