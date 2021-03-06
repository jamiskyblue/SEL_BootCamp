package homepagetests;

import homepage.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import searchresult.ResulPage;

import java.util.List;

public class SearchTests extends HomePage {
    ResulPage resulPage = new ResulPage();

    @Test(enabled = false)
    public void ValidateSearchButtonWorks() {
        clickOnSearchBar();
        typeOnSearchBar("Java Books");
        clickOnSearchButton();
        resulPage.validateSearchPageDisplayed();
    }

    @Test(enabled = false)
    public void testAllDropDownMenu() {
        List<WebElement> elementList = getAllElementFromList();
        System.out.println(elementList.size());
        for (int i = 0; i < elementList.size(); i++) {
            System.out.println(elementList.get(i).getText());
        }
    }
}
