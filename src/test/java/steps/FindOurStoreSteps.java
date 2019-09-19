package steps;

import cucumber.api.java.ru.Допустим;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Пусть;
import cucumber.api.java.ru.Тогда;
import org.testng.Assert;
import pageobjects.FindOurStorePage;
import tests.BaseTest;

public class FindOurStoreSteps extends BaseTest {

FindOurStorePage findOurStore;


    @Допустим("^пользователь зашел на главную страницу$")
    public void пользователь_зашел_на_главную_страницу() throws Throwable {
        driver.get("https://magazintrav.ru/");
        findOurStore = new FindOurStorePage(driver);
    }


    @Когда("^пользователь нажимает на кнопку Наши магазины$")
    public void пользователь_нажимает_на_кнопку_Наши_магазины() throws Throwable {
        findOurStore.ourStoresButton();

    }

    @Когда("^выбирает магазин на метро Чертановская$")
    public void выбирает_магазин_на_метро_Чертановская() throws Throwable {
        findOurStore.storeChertanovoButton();

    }

    @Тогда("^открывается страница с адресом, фото и картой магазина$")
    public void открывается_страница_с_адресом_фото_и_картой_магазина() throws Throwable {
        Assert.assertTrue(findOurStore.getAddress().isDisplayed());
        Assert.assertTrue(findOurStore.getPhoto().isDisplayed());
        Assert.assertTrue(findOurStore.getMap().isDisplayed());

    }

}
