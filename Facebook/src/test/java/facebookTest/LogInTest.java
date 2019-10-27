package facebookTest;

import base.CommonAPI;
import facebook.LogIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;





public class LogInTest extends CommonAPI {


    @Test
    public void logInTest() {

        LogIn logIn = PageFactory.initElements(driver, LogIn.class);
        logIn.validateemail();
        sleepFor(5);
        logIn.validatepassword();
        sleepFor(2);
        logIn.validatelogin();


        //@Test
        //public void searchNameTest(){
        //SearchName searchName= PageFactory.initElements(driver,SearchName.class);
        logIn.searchBarTypble();
        sleepFor(20);
        logIn.searchBarClickable();
        sleepFor(5);
    }

}
