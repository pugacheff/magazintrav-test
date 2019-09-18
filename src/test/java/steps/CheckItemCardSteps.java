package steps;

import cucumber.api.java.ru.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pageobjects.ItemPage;
import tests.BaseTest;

public class CheckItemCardSteps extends BaseTest {

    private ItemPage itemPage = PageFactory.initElements(driver, ItemPage.class);

    private final String itemPageUrl = "https://magazintrav.ru/spirulina_tab";
    private final String changeItemAmountTest = "5";

   @Допустим("^пользователь выбрал товар и находится на странице товара$")
    public void пользователь_выбрал_товар_и_находится_на_странице_товара() {
       driver.get(itemPageUrl);
    }

    @Если("^присутствует заголовок товара$")
    public void присутствует_заголовок_товара() {
        Assert.assertTrue(itemPage.getItemName().isDisplayed());
    }

    @И("^отображается изображение товара$")
    public void отображается_изображение_товара() {
        Assert.assertTrue(itemPage.getItemImg().isDisplayed());
    }

    @Также("^отбражается стоимость товара$")
    public void отбражается_стоимость_товара() {
        Assert.assertTrue(itemPage.getItemPrice().isDisplayed());
    }

    @Также("^есть кнопка добавить в корзину$")
    public void есть_кнопка_добавить_в_корзину() {
        Assert.assertTrue(itemPage.getItemAddBtn().isDisplayed());
    }

    @Ктомуже("^имеется возможность изменять количество товара$")
    public void имеется_возможность_изменять_количество_товара() throws Throwable {
        Assert.assertTrue(itemPage.getItemAmountPlus().isEnabled());
        Assert.assertTrue(itemPage.getItemAmountMinus().isEnabled());

        itemPage.getItemAmountPlus().click();
        itemPage.getItemAmountMinus().click();

        itemPage.getItemAmountInputField().clear();
        itemPage.getItemAmountInputField().sendKeys(changeItemAmountTest);
        Assert.assertEquals(itemPage.getItemAmountInputField().getAttribute("value"), changeItemAmountTest);
    }
}
