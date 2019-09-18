package steps;

import cucumber.api.java.ru.Допустим;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import org.testng.Assert;
import pageobjects.MainPage;
import pageobjects.PayOrderOnlinePage;
import testdata.TestUser;
import tests.BaseTest;

public class PaymentFormWorkSteps extends BaseTest {

    private MainPage mainPage = new MainPage(driver, driverWait);
    private PayOrderOnlinePage payOrderOnlinePage;
    private TestUser testUser;

    @Допустим("^пользователь заходит на главную страницу (.*)$")
    public void пользователь_заходит_на_главную_страницу_сайта(String baseUrl) throws Throwable {
        driver.get(baseUrl);
    }

    @Когда("^пользователь нажимает на кнопку 'оплата заказа онлайн'$")
    public void пользователь_нажимает_на_кнопку_оплата_заказа_онлайн() throws Throwable {
        payOrderOnlinePage = mainPage.clickBtnPayForYourOrderOnline();
    }

    @Тогда("^всплывает окно 'Оплата заказа онлайн'$")
    public void всплывает_окно_Оплата_заказа_онлайн() throws Throwable {
        payOrderOnlinePage.waitVisibilityOfElementLocated(payOrderOnlinePage.getDivOnlinePayment());
        Assert.assertTrue(payOrderOnlinePage.getInputPhone().isDisplayed());
    }

    @Когда("^пользователь заполняет все поля ввода для оплаты онлан$")
    public void пользователь_заполняет_все_поля_ввода_для_оплаты_онлан() throws Throwable {
        testUser = TestUser.setDataUserRequestCall();

        payOrderOnlinePage.sendKeysFieldForm(testUser.getPhone(), testUser.getOrder());
    }

    @Когда("^нажимает кнопку чтобы закрыть форму$")
    public void нажимает_кнопку_чтобы_закрыть_форму() throws Throwable {
        mainPage = payOrderOnlinePage.clickBtnClose();
    }

    @Тогда("^вновь открывается главная страница$")
    public void вновь_открывается_главная_страница() throws Throwable {
        payOrderOnlinePage.waitInvisibilityOfElementLocated(payOrderOnlinePage.getDivOnlinePayment());
        Assert.assertTrue(mainPage.getImgHeaderIcons().isDisplayed());
    }

    @Когда("^пользователь вновь нажимает на кнопку 'оплата заказа онлайн'$")
    public void пользователь_вновь_нажимает_на_кнопку_оплата_заказа_онлайн() throws Throwable {
        mainPage.waitElementToBeClickable(mainPage.getBtnPayForYourOrderOnline());
        payOrderOnlinePage = mainPage.clickBtnPayForYourOrderOnline();
    }

    @Тогда("^вновь всплывает окно 'Оплата заказа онлайн' и все введенные до этого данные корректны$")
    public void вновь_всплывает_окно_Оплата_заказа_онлайн_и_все_введенные_до_этого_данные_корректны() throws Throwable {
        String valueInputPhone = payOrderOnlinePage.getInputPhone().getAttribute("value");
        String valueInputOrderid = payOrderOnlinePage.getInputOrderid().getAttribute("value");

        Assert.assertEquals(valueInputPhone, "8 ".concat(testUser.getPhone()));
        Assert.assertEquals(valueInputOrderid, testUser.getOrder());

        payOrderOnlinePage.waitElementToBeClickable(payOrderOnlinePage.getBtnSubmit());
    }

}
