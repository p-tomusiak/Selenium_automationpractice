package selenium.test.project.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.test.project.Pages.ItemPage;
import selenium.test.project.Pages.CartPage;

public class CartTest extends AbstractTest {

    @Test
    public void successCartTest() {
        CartPage cartPage = new CartPage(driver);

        Assert.assertTrue(
                cartPage.IsLogoutButtonDisplayed()
        );

        Assert.assertTrue(
                cartPage.IsProductAddedToCart()
        );
    }
}