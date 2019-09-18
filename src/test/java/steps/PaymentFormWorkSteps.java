package steps;

import cucumber.api.java.ru.Допустим;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import org.testng.Assert;
import pageobjects.MainPage;
import pageobjects.PayOrderOnlinePage;
import tests.BaseTest;

public class PaymentFormWorkSteps extends BaseTest {

    private MainPage mainPage;
    private PayOrderOnlinePage payOrderOnlinePage;

    private String phone = "(927) 634-28-61";
    private String orderid = "289764";

    @Допустим("^пользователь заходит на главную страницу (.*)$")
    public void пользователь_заходит_на_главную_страницу_сайта(String baseUrl) throws Throwable {
        driver.get(baseUrl);
        mainPage = new MainPage(driver, driverWait);
    }

    @Когда("^пользователь нажимает на кнопку 'оплата заказа онлайн'$")
    public void пользователь_нажимает_на_кнопку_оплата_заказа_онлайн() throws Throwable {
        payOrderOnlinePage = mainPage.clickBtnPayForYourOrderOnline();
    }

    @Тогда("^всплывает окно 'Оплата заказа онлайн'$")
    public void всплывает_окно_Оплата_заказа_онлайн() throws Throwable {
        payOrderOnlinePage.waitVisibilityOfElementLocated("//div[@id='online_payment']//input[@name='phone']");
        Assert.assertTrue(payOrderOnlinePage.getInputPhone().isDisplayed());
    }

    @Когда("^пользователь заполняет все поля ввода$")
    public void пользователь_заполняет_все_поля_ввода() throws Throwable {
        payOrderOnlinePage.sendKeysFieldForm(phone, orderid);
    }

    @Когда("^нажимает кнопку чтобы закрыть форму$")
    public void нажимает_кнопку_чтобы_закрыть_форму() throws Throwable {
        mainPage = payOrderOnlinePage.clickBtnClose();
    }

    @Тогда("^вновь открывается главная страница$")
    public void вновь_открывается_главная_страница() throws Throwable {
        payOrderOnlinePage.waitInvisibilityOfElementLocated("//div[@id='online_payment']//input[@name='phone']");
        Assert.assertTrue(mainPage.getImgHeaderIcons().isDisplayed());
    }

    @Когда("^пользователь вновь нажимает на кнопку 'оплата заказа онлайн'$")
    public void пользователь_вновь_нажимает_на_кнопку_оплата_заказа_онлайн() throws Throwable {
        payOrderOnlinePage = mainPage.clickBtnPayForYourOrderOnline();
    }

    @Тогда("^вновь всплывает окно 'Оплата заказа онлайн' и все введенные до этого данные корректны$")
    public void вновь_всплывает_окно_Оплата_заказа_онлайн_и_все_введенные_до_этого_данные_корректны() throws Throwable {
        String valueInputPhone = payOrderOnlinePage.getInputPhone().getAttribute("value");
        String valueInputOrderid = payOrderOnlinePage.getInputOrderid().getAttribute("value");

        Assert.assertEquals(valueInputPhone, "8 ".concat(phone));
        Assert.assertEquals(valueInputOrderid, orderid);
    }

}
