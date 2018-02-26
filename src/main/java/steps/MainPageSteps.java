package steps;

import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;


public class MainPageSteps {

    @Step("выбран пункт главного меню")
    public void selectMenuItem(String item){
        new MainPage(BaseSteps.getDriver()).selectMenuItem(item);
    }

}
