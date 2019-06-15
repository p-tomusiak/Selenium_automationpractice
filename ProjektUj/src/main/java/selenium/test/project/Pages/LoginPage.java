package selenium.test.project.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "passwd")
    private WebElement passwordField;

    @FindBy(id = "SubmitLogin")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage FillLoginForm(String email, String password) {
        fillField(emailField, email);
        fillField(passwordField, password);
        return this;
    }

    public MyAccountPage SubmitLoginForm() {
        clickElement(loginButton);
        return new MyAccountPage(driver);
    }
}