package selenium.test.project.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchResultPage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
    private WebElement SignOutButton;

    @FindBy(xpath = "//*[@id=\"best-sellers_block_right\"]/div/ul/li[1]/a/img")
    private WebElement FirstItemButton;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public boolean IsLogoutButtonDisplayed() {
        return SignOutButton.isDisplayed();
    }

    public void AddToCartClick(){
        clickElement(FirstItemButton);
    }

    public ItemPage GoToItemPage(){
        clickElement(FirstItemButton);
        return new ItemPage(driver);
    }

}