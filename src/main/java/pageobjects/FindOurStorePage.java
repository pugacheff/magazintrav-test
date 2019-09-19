package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindOurStorePage extends BasePage {

    @FindBy(xpath ="//li[@class='our_shop']")
    private WebElement ourStores;

    @FindBy(xpath ="//*[text()='Наши магазины']//..//*[text()='м. Чертановская']")
    private WebElement storeChertanovo;

    @FindBy(xpath ="//div[@class='b-shop-map__address']")
    private WebElement storeChertanovoAdress;

    @FindBy(xpath ="//a[@class='fancybox slick-slide slick-current slick-active']")
    private WebElement storeChertanovoPhoto;

    @FindBy(xpath ="//ymaps[@class='ymaps-2-1-74-inner-panes']")
    private WebElement storeChertanovoMap;

    public FindOurStorePage(WebDriver driver) {
        super (driver);
    }

    public FindOurStorePage ourStoresButton(){
        ourStores.click();
        return this;
    }

    public FindOurStorePage storeChertanovoButton() {
        storeChertanovo.click();
        return this;
    }
    public WebElement getAddress() {
        return storeChertanovoAdress;
    }

    public WebElement getPhoto() {
        return storeChertanovoPhoto;
    }

    public WebElement getMap() {
        return storeChertanovoMap;
    }
}
