package selenium.test.project.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.test.project.Pages.LoginPage;
import selenium.test.project.Pages.MyAccountPage;

public class LoginTest extends AbstractTest {

    @Test
    public void successLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.FillLoginForm("321test@o2.pl", "testtest1");

        MyAccountPage myAccountPage = loginPage.SubmitLoginForm();

        Assert.assertTrue(
                myAccountPage.IsLogoutButtonDisplayed()
        );
    }
}