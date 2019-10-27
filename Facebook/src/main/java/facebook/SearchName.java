package facebook;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import report.TestLogger;

public class SearchName extends CommonAPI {
    @FindBy(xpath = "//input[@id='js_dx']")
    public static WebElement name;
    public void searchBarTypble(){
        name.sendKeys("MD JAMIL BOKSH");
        Assert.assertEquals(name.isDisplayed(),true);
        TestLogger.log("Name typed");
    }
    @FindBy(xpath = "//i[@class='_585_']")
    public static WebElement search;
    public void searchBarClickable(){
        search.click();
    }
}
