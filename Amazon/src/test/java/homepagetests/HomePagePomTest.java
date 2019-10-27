
package homepagetests;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.HomePagePom;

public class HomePagePomTest extends CommonAPI {
    HomePagePom homePagePom;
    @BeforeMethod
    public void setHomePagePOM(){
        homePagePom= PageFactory.initElements(driver,HomePagePom.class);
    }
    @Test(enabled = false)
    public void testWholeFoods(){
        homePagePom.validateWholeFoodsDisplayed();
        homePagePom.validateWholeFoodsClickAble();
    }
}