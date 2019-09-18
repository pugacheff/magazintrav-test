package steps;

import cucumber.api.java.ru.Допустим;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import org.openqa.selenium.support.PageFactory;
import pageobjects.ComplaintPage;
import pageobjects.HomePage;
import pageobjects.ServicePage;
import tests.BaseTest;

public class StepsLeaveComplaint extends BaseTest {

    HomePage homePage;
    ServicePage servicePage;
    ComplaintPage complaintPage;

    @Допустим("^пользователь находится на главной странице$")
    public void пользователь_находится_на_главной_странице() throws Throwable {
        driver.get("https://magazintrav.ru/");
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Когда("^нажимает на кнопку Помощь$")
    public void нажимает_на_кнопку_Помощь() throws Throwable {
       homePage.clickMenuHelp();
    }

    @Когда("^выбирает пункт службы контроля качества$")
    public void выбирает_пункт_службы_контроля_качества() throws Throwable {
        servicePage = homePage.clickService();
    }

    @Тогда("^пользователь нажимает на кнопку оставить жалобу$")
    public void пользователь_нажимает_на_кнопку_оставить_жалобу() throws Throwable {
        complaintPage = servicePage.clickComplaintBtn();
    }

    @Тогда("^заполняет все поля$")
    public void заполняет_все_поля() throws Throwable {
        complaintPage.setCause();
        complaintPage.setTextEssenceComplaintForm("Невозможно установить аватар пользователя");
        complaintPage.setTextNumberOrderForm("не заказывал");
        complaintPage.setNameUserForm("Петров Константин Иванович");
        complaintPage.setPhoneNumberForm("9059094494");
        complaintPage.setEmailForm("email");
    }

    @Тогда("^пользователь нажимает кнопку отправить$")
    public void пользователь_нажимает_кнопку_отправить() throws Throwable {
        complaintPage.sendClick();
    }
}
