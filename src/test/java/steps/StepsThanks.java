package steps;

import cucumber.api.PendingException;
import cucumber.api.java.ru.Допустим;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pageobjects.MainPage;
import pageobjects.ThankPage;
import tests.BaseTest;

public class StepsThanks extends BaseTest {
    MainPage mainPage;
    ThankPage thankPage;

    String msg = " HI!";
    String ordr = "HELLO!";
    String mail = "MAIL";

    @Допустим("^пользователь нажал кнопку сказать спасибо$")
    public void пользователь_нажал_кнопку_сказать_спасибо() throws Throwable {
        driver.get("https://magazintrav.ru/");
        mainPage = new MainPage(driver, driverWait);
        thankPage = mainPage.openThankPage();
    }

    @Когда("^пользователь выбирает за что хочет похвалить$")
    public void пользователь_выбирает_за_что_хочет_похвалить() throws Throwable {
        thankPage.selectComplaint();

    }

    @Когда("^заполняет сообщение ордер мэйл$")
    public void заполняет_сообщение_ордер_мэйл() throws Throwable {
        thankPage.inputMessage(msg).inputOrder(ordr).inputEmail(mail);
    }

    @Когда("^нажимает на кнопку отправить$")
    public void нажимает_на_кнопку_отправить() throws Throwable {
        thankPage.sendComplaints();
    }

    @Тогда("^должен отобразиться фрейм успешно$")
    public void должен_отобразиться_фрейм_успешно() throws Throwable {
        thankPage.waitingForSuccess();
    }
}
