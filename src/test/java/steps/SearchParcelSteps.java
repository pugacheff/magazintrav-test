package steps;

import cucumber.api.java.ru.Допустим;
import cucumber.api.java.ru.И;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import org.apache.http.HttpStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pageobjects.SearchParcel;
import tests.BaseTest;

import java.util.ArrayList;
import java.util.List;

public class SearchParcelSteps extends BaseTest {

    SearchParcel searchParcel;

    @Допустим("^пользователь на главной странице$")
    public void пользователь_на_главной_странице() throws Throwable {
        driver.get("https://magazintrav.ru/");
        searchParcel = PageFactory.initElements(driver, SearchParcel.class);
    }

    @Когда("^пользователь нажимает на кнопку Помощь$")
    public void пользователь_нажимает_на_кнопку_Помощь() throws Throwable {
        searchParcel.helpButton();
    }
    @И("^выбирает пункт где посылка$")
    public void выбирает_пункт_где_посылка() throws Throwable {
        searchParcel.whereParcelButton();

    }

    @Тогда("^открывается страница трекинга посылок на сайте Почта России$")
    public void открывается_страница_трекинга_посылок_на_сайте_Почта_России() throws Throwable {

        List<String> browserTabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        driver.findElement(By.className("input__placeholder"));
        driver.close();
        driver.switchTo().window(browserTabs.get(0));
    }

}
