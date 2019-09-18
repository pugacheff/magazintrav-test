package steps;

import cucumber.api.PendingException;
import cucumber.api.java.ru.Допустим;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import org.openqa.selenium.WebDriver;
import pageobjects.SearchParcel;
import tests.BaseTest;

import javax.naming.directory.SearchControls;

public class StepsDefinitions extends BaseTest {

    SearchParcel searchParcel;

    //searchParcel = new SearchParcel(driver);

    @Допустим("^пользователь находится на главной странице$")
    public void пользователь_находится_на_главной_странице() throws Throwable {
        driver.get("https://magazintrav.ru/");
    }

    @Когда("^пользователь нажимает на пункт меню помощь на главной странице$")
    public void пользователь_нажимает_на_пункт_меню_помощь_на_главной_странице() throws Throwable {
        searchParcel.helpButton();

    }

    @Когда("^выбирает пункт где посылка в пункте меню помощь$")
    public void выбирает_пункт_где_посылка_в_пункте_меню_помощь() throws Throwable {
        searchParcel.whereParcelButton();

    }

    @Тогда("^должна отобразиться страница трекинга посылок сайта Почты России$")
    public void должна_отобразиться_страница_трекинга_посылок_сайта_Почты_России() throws Throwable {

        throw new PendingException();
    }
}
