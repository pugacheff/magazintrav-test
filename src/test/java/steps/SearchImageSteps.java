package steps;

import cucumber.api.java.ru.Пусть;
import cucumber.api.java.ru.Тогда;
import org.testng.Assert;
import pageobjects.SearchImagePage;
import tests.BaseTest;

public class SearchImageSteps extends BaseTest {
    SearchImagePage searchImage;

    @Пусть("^Пользователь заходит на главную страницу$")
    public void Пользователь_заходит_на_главную_страницу() throws Throwable {
        driver.get("https://magazintrav.ru/");
        searchImage = new SearchImagePage(driver);

    }

    @Тогда("^На странице есть блок баннера, отображается одна из четырех картинок$")
    public void открывается_блок_баннера() throws Throwable {
        Assert.assertTrue(searchImage.getSearchImage().isDisplayed());
    }

}
