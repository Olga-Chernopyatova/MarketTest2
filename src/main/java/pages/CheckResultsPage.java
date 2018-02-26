package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import java.util.List;

public class CheckResultsPage {


    @FindBy(xpath="//*[@id='header-search']")
    public WebElement headerSearch;

    @FindBy(xpath="//div[@class='n-snippet-cell2__title']")
    public List<WebElement> listResultSeach;

    public CheckResultsPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public Integer getSeacrhProductCount() {
        return listResultSeach.size();
    }
}