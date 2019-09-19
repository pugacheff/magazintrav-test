package steps;

import cucumber.api.java.ru.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pageobjects.ItemPage;
import pageobjects.MainPage;
import tests.BaseTest;

public class CheckBuyAlsoFieldSteps extends BaseTest {

    private MainPage mainPage;
    private ItemPage itemPage;

    @Когда("^пользователь выбрал товар и отобразилась его карточка$")
    public void пользователь_выбрал_товар_и_отобразилась_его_карточка() {
        mainPage = new MainPage(driver);
        itemPage = mainPage.clickItemBtn();
    }

    @То("^проверяем наличие заголовка блока внизу страницы$")
    public void проверяем_наличие_заголовка_блока_внизу_страницы() {
        Assert.assertTrue(itemPage.getBuyAlsoLabel().isDisplayed());
    }

    @Также("^проверяем наличие непустых полей с товарами$")
    public void проверяем_наличие_непустых_полей_с_товарами() {
        Assert.assertTrue(itemPage.getBuyAlsoContainer().isDisplayed());
        Assert.assertTrue(itemPage.getBuyAlsoItemContainer().isDisplayed());
    }

    @И("^возможность добавить их в корзину$")
    public void возможность_добавить_их_в_корзину() {
        Assert.assertTrue(itemPage.getBuyAlsoItemAddBtn().isDisplayed());
        itemPage.getBuyAlsoItemAddBtn().click();
        itemPage.getContinueShoppingBtn().click();
    }
}
