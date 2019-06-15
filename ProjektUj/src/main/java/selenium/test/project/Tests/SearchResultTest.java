package selenium.test.project.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.test.project.Pages.ItemPage;
import selenium.test.project.Pages.SearchResultPage;

public class SearchResultTest extends AbstractTest {

    @Test
    public void successSearchResultTest() {
        SearchResultPage searchResultPage = new SearchResultPage(driver);

        ItemPage itemPage = searchResultPage.GoToItemPage();

        Assert.assertTrue(
                itemPage.IsLogoutButtonDisplayed()
        );

    }
}