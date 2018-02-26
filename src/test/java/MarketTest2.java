import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Title;
import steps.*;

import java.util.HashMap;

public class MarketTest2 extends BaseSteps {
    @Test
    @Title("Яндекс маркет")
    public void testMarket () {

        MainPageSteps mainPageSteps = new MainPageSteps();
        ChooseElectronicsHPSteps chooseElectronicsHPSteps = new ChooseElectronicsHPSteps();
        SendAppSteps sendAppSteps = new SendAppSteps();
        CheckResultSteps checkResultsSteps = new CheckResultSteps();

        HashMap<String, String> testData = new HashMap<>();

        testData.put("от", "5000");


        //    MainPageSteps.selectMenuItem("Маркет");

//        chooseElectronicsHPSteps.checkPageTitle("Яндекс маркет");
//        chooseElectronicsHPSteps.selectMenuItem("Электроника");
//        chooseElectronicsHPSteps.selectMenuType("Наушники");

//        sendAppSteps.fillFields();
        
    }

    @Ignore
    public void MarketTest () {
        driver.get(baseUrl);
        driver.findElement(By.xpath("//*[contains(text(),'маркет')]")).click();
        driver.findElement(By.xpath("//li/*[contains(text(),'Электроника')]")).click();
        Wait<WebDriver> wait = new WebDriverWait(driver, 5, 1000);
        WebElement sendbtn= driver.findElement(By.xpath("//*[contains(@class, 'topmenu__subitem_nid_56179')]"));
        wait.until(ExpectedConditions.visibilityOf(sendbtn)).click();

//        Assert.assertEquals("Наушники", title.getText());

        driver.findElement(By.xpath("//*[@id='glf-pricefrom-var']"));

        fillField(By.name("pricefrom"), "5000");

        Assert.assertEquals("5000",
                driver.findElement(By.name("pricefrom")).getAttribute( "value"));

        driver.findElement(By.name("Beats")).click();

        driver.findElement(By.xpath("//*[contains(text(),'Применить')]")).click();
        driver.findElements(By.xpath( "(//div[@class='n-snippet-cell2__title'])" ) ).size();
        driver.findElement( By.xpath( "(//div[@class='n-snippet-cell2__title'])[1]" ) ).getText();
        driver.findElement(By.xpath("//*[contains(text(),'Найти')]")).click();

    }
}
