package testProj;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Test1 {
    MainPage mainPage;
    DeclarationPage declarationPage;
    WebDriver driver;

    @Before
    public void precondition(){
        System.setProperty("webdriver.chrome.driver", "/home/maks/Загрузки/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        mainPage = new MainPage(driver);
        declarationPage = new DeclarationPage(driver);
    }

    @Test
    public void openSite()  throws InterruptedException {
        mainPage.open();
        mainPage.clickGlavnaya();
        mainPage.clickDeclarationPage();
        declarationPage.enterName("Иванов Иван Иванович");
    }






    //@After
    public void poscondition(){
        driver.quit();
    }


}
