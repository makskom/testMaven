package testProj;

import com.sun.corba.se.impl.encoding.CodeSetConversion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class MainPage {
    private WebDriver driver;

    private final By Glavnaya = By.className("x17j");
    private final By Declaration = By.id("templ:b16::icon");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        //driver.get("https://cabinet.sfs.gov.ua/cabinet/faces/public/reestr.jspx");
        driver.get("https://cabinet.sfs.gov.ua/cabinet/faces/public/dp00declm.jspx");
    }

    public void clickGlavnaya(){
        driver.findElement(Glavnaya).click();
    }

    public void clickDeclarationPage(){
        driver.findElement(Declaration).click();
    }

}



