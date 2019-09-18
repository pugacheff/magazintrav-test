package steps;

import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import org.testng.Assert;
import pageobjects.MainPage;
import pageobjects.RequestCallPage;
import testdata.TestUser;
import tests.BaseTest;

public class RequestCallFormWorkSteps extends BaseTest {

    private MainPage mainPage = new MainPage(driver, driverWait);
    private RequestCallPage requestCallPage;
    private TestUser testUser;

    @Когда("^пользователь нажимает на кнопку 'заказать звонок'$")
    public void пользователь_нажимает_на_кнопку_заказать_звонок() throws Throwable {
        requestCallPage = mainPage.clickRequestCall();
    }

    @Тогда("^всплывает окно 'заказать звонок'$")
    public void всплывает_окно_заказать_звонок() throws Throwable {
        requestCallPage.waitVisibilityOfElementLocated(requestCallPage.getDivRequestCall());
        Assert.assertTrue(requestCallPage.getInputNameCallBack().isDisplayed());
    }

    @Когда("^пользователь заполняет все поля ввода для заказа звонка$")
    public void пользователь_заполняет_все_поля_ввода_для_заказа_звонка() throws Throwable {
        testUser = TestUser.setDataUserRequestCall();
        requestCallPage.sendKeysFieldFormCallBack(testUser.getName(), testUser.getEmail(), testUser.getPhone(), testUser.getOrder());
    }

    @Когда("^нажимает кнопку чтобы закрыть форму для заказа звонка$")
    public void нажимает_кнопку_чтобы_закрыть_форму_для_заказа_звонка() throws Throwable {
        mainPage = requestCallPage.clickBtnClose();
    }

    @Тогда("^после закрытия окна 'заказать звонок' открыватся главная страница$")
    public void после_закрытия_окна_заказать_звонок_открыватся_главная_страница() throws Throwable {
        requestCallPage.waitInvisibilityOfElementLocated(requestCallPage.getDivRequestCall());
        Assert.assertTrue(mainPage.getImgHeaderIcons().isDisplayed());
    }

    @Когда("^пользователь вновь нажимает на кнопку 'заказать зфонок'$")
    public void пользователь_вновь_нажимает_на_кнопку_заказать_зфонок() throws Throwable {
        requestCallPage = mainPage.clickRequestCall();
    }

    @Тогда("^вновь всплывает окно 'заказать звонок' и все введенные до этого данные корректны$")
    public void вновь_всплывает_окно_заказать_звонок_и_все_введенные_до_этого_данные_корректны() throws Throwable {

        requestCallPage.waitVisibilityOfElementLocated(requestCallPage.getDivRequestCall());

        String valueInputNameCallBack = requestCallPage.getInputNameCallBack().getAttribute("value");
        String valueInputEmailCallBack = requestCallPage.getInputEmailCallBack().getAttribute("value");
        String valueInputPhoneCallBack = requestCallPage.getInputPhoneCallBack().getAttribute("value");
        String valueInputOrderCallBack = requestCallPage.getInputOrderCallBack().getAttribute("value");

        Assert.assertEquals(valueInputNameCallBack, testUser.getName());
        Assert.assertEquals(valueInputEmailCallBack, testUser.getEmail());
        Assert.assertEquals(valueInputPhoneCallBack, "8 ".concat(testUser.getPhone()));
        Assert.assertEquals(valueInputOrderCallBack, testUser.getOrder());

        Assert.assertTrue(requestCallPage.getBtnSubmit().isDisplayed());

        requestCallPage.waitElementToBeClickable(requestCallPage.getBtnSubmit());

    }

}
