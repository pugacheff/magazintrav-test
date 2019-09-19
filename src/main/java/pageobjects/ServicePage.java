package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ServicePage extends BasePage {

    @FindBy(xpath = "//a[text()='Оставить жалобу']")
    WebElement complaintBtn;

    public ServicePage(WebDriver driver) {
        super(driver);
    }

    public ComplaintPage clickComplaintBtn() {
        clickButton(complaintBtn);
        return new ComplaintPage(driver);
    }

}
