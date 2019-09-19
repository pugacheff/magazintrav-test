package steps;

import cucumber.api.java.ru.Допустим;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import org.testng.Assert;
import pageobjects.FavoritePage;
import pageobjects.NewItemsPage;
import tests.BaseTest;

public class CheckAddFavoritesSteps extends BaseTest {

    private NewItemsPage newItemsPage = new NewItemsPage(driver);
    private FavoritePage favoritePage;

    private String attribute;

    @Допустим("^Пользователь находится на странице с товаром (.*)$")
    public void пользователь_находится_на_странице_с_товаром(String baseUrl) throws Throwable {
        driver.get(baseUrl);
    }

    @Когда("^пользователь нажимает на кнопку у любого товара 'В избранное'$")
    public void пользователь_нажимает_на_кнопку_у_любого_товара_В_избранное() throws Throwable {
        attribute = newItemsPage.getLinklListitems().get(0).getAttribute("href");
        newItemsPage.clickBtnToFavorites();
    }

    @Когда("^нажимает на кнопку Избранное$")
    public void нажимает_на_кнопку_Избранное() throws Throwable {
        favoritePage = newItemsPage.clickBtnFavorite();
    }

    @Тогда("^открывается страница 'Избранное' и выбранный нами товар действительно находится в избранном$")
    public void открывается_страница_Избранное_и_выбранный_нами_товар_действительно_находится_в_избранном() throws Throwable {
        driver.navigate().refresh();
        Assert.assertEquals(attribute, favoritePage.getLinklListitems().get(0).getAttribute("href"));
        Assert.assertFalse(favoritePage.getListFavoritesItems().isEmpty());
    }

}
