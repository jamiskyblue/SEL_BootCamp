package facebookTest;

import base.CommonAPI;
import facebook.SearchName;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SearchNameTest extends CommonAPI {
    @Test
    public void searchNameTest(){
        SearchName searchName= PageFactory.initElements(driver,SearchName.class);
        searchName.searchBarTypble();
        sleepFor(5);
        searchName.searchBarClickable();
        sleepFor(5);
    }
}
