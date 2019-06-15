package selenium.test.project.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
    private WebElement SignOutButton;

    @FindBy(id = "cart_summary")
    private WebElement CartProduct;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean IsLogoutButtonDisplayed() {
        return SignOutButton.isDisplayed();
    }

    public boolean IsProductAddedToCart(){
        return CartProduct.isDisplayed();
    }
}