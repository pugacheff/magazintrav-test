package steps;

import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Пусть;
import cucumber.api.java.ru.Тогда;
import org.testng.Assert;
import pageobjects.MainPage;
import tests.BaseTest;

public class SearchInputFieldSteps extends BaseTest {

    MainPage mainPage;

    @Пусть("^пользователь находится на главной странице (.*)$")
    public void пользователь_находится_на_главной_странице(String baseUrl) throws Throwable {
        driver.get(baseUrl);
        mainPage = new MainPage(driver);
    }


    @Когда("^пользователь вводит в строку поиска (.*)$")
    public void пользователь_вводит_в_строку_поиска_Арония(String searchText) throws Throwable {
        mainPage.typeWordForSearch(searchText);
    }

    @Тогда("^продукт (.*) отображается на экране$")
    public void продукт_Арония_отображается_на_экране(String itemTitle) throws Throwable {
        Assert.assertTrue(mainPage.isItemPresentByTitle(itemTitle));
    }

}
