package steps;

import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import org.testng.Assert;
import pageobjects.FaqPage;
import pageobjects.MainPage;
import tests.BaseTest;

public class StepsHowtoMakeOrder extends BaseTest {

    MainPage mainPage;
    FaqPage faqPage;

    @Когда("^нажимает на кнопку Частые вопросы в футере$")
    public void нажимает_на_кнопку_Частые_вопросы_в_футере() throws Throwable {
        mainPage = new MainPage(driver, driverWait);
        faqPage = mainPage.openFaqPage();
    }

    @Когда("^на новой странице нажимает пункт Как сделать заказ\\?$")
    public void на_новой_странице_нажимает_пункт_Как_сделать_заказ() throws Throwable {
        faqPage.openMenu();
    }

    @Тогда("^открывается подменб с информацией$")
    public void открывается_подменб_с_информацией() throws Throwable {
        Assert.assertTrue(faqPage.checkVisible());
    }

}
