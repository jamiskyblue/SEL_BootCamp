package facebook;

import base.CommonAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import report.TestLogger;


public class LogIn extends CommonAPI {
ChromeOptions chromeOptions=new ChromeOptions();
@FindBy(xpath="//input[@id='email']")
    public static WebElement email;
public void validateemail(){
    email.sendKeys("jarifboksh@gmail.com");
    Assert.assertEquals(email.isDisplayed(),true);
    TestLogger.log("Email id typed");
}
@FindBy(xpath="//input[@id='pass']")
    public static WebElement password;
public void validatepassword() {
    password.sendKeys("jarifjamil");
    Assert.assertEquals(password.isDisplayed(), true);
    TestLogger.log("Password typed");
}
    @FindBy(xpath = "//button[@id='loginbutton']")
            public static WebElement login;
public void validatelogin(){
    login.click();

}
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






