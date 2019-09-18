package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class VacancyPage extends BasePage {

    @FindBy(xpath = "//*[text()='О компании']")
    WebElement companyButton;

    @FindBy(xpath = "//a[@href='vakansii']/*[text()='Вакансии']")
    WebElement vacancyButton;

    @FindBy(xpath = "//*[contains(text(), 'открыты вакансии:')]")
    WebElement checkString;

    @FindBy(xpath = "//div[@class='item_box question_one clearfix']")
    WebElement vacancyBlock;

    @FindBy(xpath = "//input[@name='q']")
    WebElement seachBlock;

    @FindBy(xpath = ".//*[text()='Все результаты']")
    WebElement allResultSeaching;

    @FindBy(xpath = "//input[@name='query']")
    WebElement stringSeach;

    @FindBy(xpath = "//div[@data-b24-crm-button-icon='openline']")
    WebElement messangerButton;

    @FindBy(xpath = "//a[@class='b24-widget-button-social-item b24-widget-button-openline_livechat']")
    WebElement onlineChatBtn;

    @FindBy(xpath = "//*[@placeholder='Введите сообщение...']")
    WebElement enterMessage;

    @FindBy(xpath = "//button[@title='Отправить сообщение']")
    WebElement sendMessBtn;

    public VacancyPage(WebDriver driver) {
        super(driver);
    }

    public VacancyPage companyBtnClick() {
        companyButton.click();
        return this;
    }

    public VacancyPage vacancyBtnClick() {
        vacancyButton.click();
        return this;
    }

    public VacancyPage chechingString() {
        Assert.assertTrue(checkString.isDisplayed());
        return this;
    }

    public VacancyPage checkingVacancyBlock() {
        Assert.assertTrue(vacancyBlock.isDisplayed());
        return this;
    }

    public VacancyPage enterAndSeachingWord() {
        seachBlock.sendKeys("сон");
        return this;
    }

    public VacancyPage checkSeaching() {
        Assert.assertTrue(allResultSeaching.isDisplayed());
        return this;
    }

    public VacancyPage stringSeachClick() {
        stringSeach.click();
        return this;
    }

    public VacancyPage messangerClick() {
        messangerButton.click();
        return this;
    }

    public VacancyPage selectMess() {
        onlineChatBtn.click();
        return this;
    }

    public VacancyPage startChat() {
        enterMessage.sendKeys("Сообщение =)");
        sendMessBtn.click();
        return this;
    }

}
