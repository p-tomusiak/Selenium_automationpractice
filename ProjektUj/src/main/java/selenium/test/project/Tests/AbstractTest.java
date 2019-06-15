package selenium.test.project.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import selenium.test.project.Utils.CustomPath;
import selenium.test.project.Utils.CustomScreenshot;

import java.lang.reflect.Method;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public abstract class AbstractTest {

    protected static WebDriver driver;
    protected static CustomScreenshot customScreenshot;

    @BeforeSuite
    public void setUpSuite() {
        // Inicjalizacja obiektu customScreenshot
        customScreenshot = new CustomScreenshot();
        // Wskazanie zewnętrznego pliku drivera dla przeglądarki CHROME
        System.setProperty(
                "webdriver.chrome.driver",
                new CustomPath().getResourcesPath("chromedriver.exe")
        );
        //Stworzenie i zainicjalizowanie obiektu DRIVER przeglądarką CHROME
        driver = new ChromeDriver();
        // Ustawienie globalnego timeouta na 5 sekund
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // Ustawienie zmaksymalizowanego okna
        driver.manage().window().maximize();
        // przejście na wskazaną stronę
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }


    @AfterMethod
    public void tearDownMethod(ITestResult result){
        if ( result.getStatus() != ITestResult.FAILURE){
            customScreenshot.makeScreenshot(
                    driver,
                    new Date().getTime() + "_" +
                            result.getMethod().getMethodName()
            );
        }
    }

    @AfterSuite
    public void tearDownSuite() {
        //Zamknięcie przeglądarki
        driver.quit();
    }

    public void Wait(int time)
    {
        time = time * 2000;
        try {
            Thread.sleep(time);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}