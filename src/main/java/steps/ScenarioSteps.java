package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.When;

public class ScenarioSteps {

    MainPageSteps mainPageSteps = new MainPageSteps();
    ChooseElectronicsHPSteps chooseElectronicsHPSteps = new ChooseElectronicsHPSteps();
    SendAppSteps sendAppSteps = new SendAppSteps();
    CheckResultSteps  checkResultsSteps = new CheckResultSteps();

    @When("^выбран пункт меню \"(.+)\"$")
    public void selectMenuItem(String menuItem){
        mainPageSteps.selectMenuItem(menuItem);
    }

    @When("^выбрана группа товаров \"(.+)\"$")
    public void selectMenuGroupItem(String menuName){
        chooseElectronicsHPSteps.selectMenuItem(menuName);
    }

    @When ("выполнен выбор типа электроники \"(.+)\"$")
    public void selectMenuProductTypeItem(String menuName) {
        chooseElectronicsHPSteps.selectTypeProductItem(menuName);
    }

    @When("заполняются поля:")
    public void fillForm(DataTable fields) {
        fields.asMap(String.class, String.class)
                .forEach((field, value) -> sendAppSteps.fillField(field, value));
    }

    @When("найдено (.*) товаров")
    public void stepClickToBanner(Integer count) {
        checkResultsSteps.checkCountProducts(count);
    }

    @When("заполнено поле поиска значением (.*)")
    public void fillSearchField(String searchInput){
        checkResultsSteps.fillFieldSeacrh(searchInput);
    }

    @When("выполнено нажатие на Найти")
    public void stepClickToSearch() {
        CheckResultSteps.stepClickToBanner();
    }


}