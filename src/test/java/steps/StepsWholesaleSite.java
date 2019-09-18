package steps;

import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import org.testng.Assert;
import pageobjects.MainPage;
import pageobjects.WholesalePage;
import tests.BaseTest;

import java.util.ArrayList;

public class StepsWholesaleSite extends BaseTest {

    MainPage mainPage = new MainPage(driver);
    WholesalePage wholesalePage;

    @Когда("^пользователь нажимает на кнопку Оптовикам$")
    public void пользователь_нажимает_на_кнопку_Оптовикам() throws Throwable {
       wholesalePage = mainPage.clickWholesaleBtn();
    }

    @Тогда("^пользователь попадает на внешний ресурс$")
    public void пользователь_попадает_на_внешний_ресурс() throws Throwable {
        ArrayList<String> tabs = new ArrayList<> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String email = wholesalePage.getEmailOpt().getText();
        Assert.assertEquals(email, "opt@magazintrav.ru");
    }

}
