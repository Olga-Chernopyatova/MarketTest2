package steps;

import pages.ChooseElectronicsHPPage;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertTrue;

public class ChooseElectronicsHPSteps {
    @Step("заголовок страницы - Яндекс маркет равен {0}")
    public static void checkPageTitle(String expectedTitle){
        String actualTitle = "";//new ChooseElectronicsHPPage().title.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }

    @Step("выполнено нажатие на Электроника")
    public  void selectMenuItem(String menuItem){
        new ChooseElectronicsHPPage().moveToMenu(menuItem);
    }


    @Step ("выбран тип электроники {0}")
    public  void selectTypeProductItem(String menuItem) {
        new ChooseElectronicsHPPage().selectSubMenu(menuItem);}


}
