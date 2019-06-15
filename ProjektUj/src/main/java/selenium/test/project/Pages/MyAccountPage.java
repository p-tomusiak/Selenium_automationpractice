package selenium.test.project.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
    private WebElement SignOutButton;

    @FindBy(xpath = "//*[@id=\"searchbox\"]/button")
    private WebElement SearchButton;

    @FindBy(id = "search_query_top")
    private WebElement SearchTextBox;

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean IsLogoutButtonDisplayed() {
        return SignOutButton.isDisplayed();
    }

    public MyAccountPage FillSearchTextbox(String product) {
        fillField(SearchTextBox, product);
        return this;
    }

    public SearchResultPage GoToSearchResultPage(){
        clickElement(SearchButton);
        return new SearchResultPage(driver);
    }
}