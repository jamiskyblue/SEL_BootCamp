package homepagetests;

        import homepage.HomePage;
        import org.testng.annotations.Test;

public class LoginTest extends HomePage {
    @Test(enabled = false)
    public void validateLoginWorks(){
        login();
        validateEmailField();
        typeOnEmailField("jarifboksh@gmail.com");
        clickOnContinue();
        validatePasswordField("jarifjamil");
        clickOnSignInButton();
    }
}
