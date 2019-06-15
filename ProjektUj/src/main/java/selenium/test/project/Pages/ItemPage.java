package selenium.test.project.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ItemPage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
    private WebElement SignOutButton;

    @FindBy(id = "add_to_cart")
    private WebElement AddToCartButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
    private WebElement CartButton;

    private String CrossButtonClassName = "cross";


    public ItemPage(WebDriver driver) {
        super(driver);
    }

    public boolean IsLogoutButtonDisplayed() {
        return SignOutButton.isDisplayed();
    }

    public void AddToCartClick(){
        clickElement(AddToCartButton);
    }

    public void DialogWindowXMarkClick(){
        driver.findElement(By.className(CrossButtonClassName)).click();
    }


    public CartPage GoToCartPage(){
        clickElement(CartButton);
        return new CartPage(driver);
    }

}