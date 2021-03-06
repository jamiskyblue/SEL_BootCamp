package pom;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class HomePagePom extends CommonAPI {
    @FindBy(xpath = "/html//div[@id='merchandised-content']/div[2]/div/div/div[1]/div/div//img[@alt='Explore savings in-store & on Amazon']")
    public static WebElement WholeFoodsValue;

    @FindBy(linkText = "Whole Foods")
    public static WebElement WholeFoods;

    public void validateWholeFoodsDisplayed() {
        Assert.assertEquals(WholeFoods.isDisplayed(), true);
    }

    public void validateWholeFoodsClickAble() {
        WholeFoods.click();
        Assert.assertEquals(WholeFoodsValue.isDisplayed(), true);
    }
}