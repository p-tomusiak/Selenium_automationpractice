package selenium.test.project.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.test.project.Pages.MyAccountPage;
import selenium.test.project.Pages.SearchResultPage;

public class MyAccountTest extends AbstractTest {

    @Test
    public void successMyAccountTest() {
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        myAccountPage.FillSearchTextbox("yellow");

        SearchResultPage searchResultPage = myAccountPage.GoToSearchResultPage();

        Assert.assertTrue(
                searchResultPage.IsLogoutButtonDisplayed()
        );
    }
}