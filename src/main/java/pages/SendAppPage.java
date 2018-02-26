package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendAppPage {

    @FindBy(xpath="//*[@id='glf-pricefrom-var']")
    public WebElement pricefrom;

    @FindBy(xpath="//*[text()='Beats']")
    public WebElement beatsHP;

    public SendAppPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void fillField(String field, String value) {
        switch (field) {
            case "pricefrom":
                fillField(pricefrom, value);
                break;
            case "Beats":
                beatsHP.click();
                break;
            default:
                throw new AssertionError("Поле '" + field + "' отсутствует на странице");

        }
    }

    public String getFillField(String field) {
        switch (field) {
            case "pricefrom":
                return pricefrom.getAttribute("value");
            default:
                throw new AssertionError("Поле '" + field + "' отсутствует на странице");
        }
    }

    protected void fillField(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }


}
