package homepagetests;

import homepage.HomePage;
import org.testng.annotations.Test;

public class SingOutTest extends HomePage {
    @Test(enabled = false)
    public void validateSignOut(){
        login();
        validateEmailField();
        typeOnEmailField("jarifboksh@gmail.com");
        clickOnContinue();
        validatePasswordField("jarifjamil");
        clickOnSignInButton();
        signOut();
    }
}