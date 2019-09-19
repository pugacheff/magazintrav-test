package steps;

import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import org.testng.Assert;
import pageobjects.MainPage;
import pageobjects.ReturnPage;
import tests.BaseTest;

public class ReturnSteps extends BaseTest {

    MainPage mainPage = new MainPage(driver);
    ReturnPage returnPage;
    private String ruleText = "Правила возврата товара";

    @Когда("^пользователь нажимает на кнопку в меню помощь$")
    public void пользователь_нажимает_на_кнопку_в_меню_помощь() throws Throwable {
       mainPage.clickMenuHelp();
    }

    @Когда("^нажимает на кнопку Возврат$")
    public void нажимает_на_кнопку_Возврат() throws Throwable {
        returnPage = mainPage.clickReturnBtn();
    }

    @Тогда("^пользователь попадает на страницу Возврата$")
    public void пользователь_попадает_на_страницу_Возврата() throws Throwable {
       String strRuleText = returnPage.getRuleTextField().getText();
        Assert.assertEquals(strRuleText,ruleText);
    }
}
