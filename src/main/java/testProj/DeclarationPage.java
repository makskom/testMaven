package testProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeclarationPage {
    private final By nameField = By.id("0_HZY");

    private WebDriver driver;

    public DeclarationPage(WebDriver driver){this.driver = driver;}

    public void enterName(String name){
        //driver.findElement(nameField).click();
            //driver.findElement(nameField).sendKeys(name);

        driver.switchTo().frame(driver.findElement(By.id("iffarmeData")));
        driver.findElement(nameField).sendKeys(name);
        driver.switchTo().defaultContent();
    }



}
