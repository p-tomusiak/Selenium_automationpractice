package selenium.test.project.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.test.project.Pages.ItemPage;
import selenium.test.project.Pages.CartPage;

public class ItemTest extends AbstractTest {

    @Test
    public void successItemTest() {
        ItemPage itemPage = new ItemPage(driver);

        itemPage.AddToCartClick();

        itemPage.DialogWindowXMarkClick();  //AJAX BUTTON!!!!

        Wait(2); //sleep poniewaz okno zakupu zamyka sie zbyt wolno

        CartPage cartPage = itemPage.GoToCartPage();

        Assert.assertTrue(
                cartPage.IsLogoutButtonDisplayed()
        );
    }
}