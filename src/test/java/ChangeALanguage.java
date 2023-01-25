import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
public class ChangeALanguage extends BaseData{


    By languageBox = By.xpath("//div[@class=\"my-2 my-lg-0 mr-2\"]");
    By select = By.id("langSelect");
    By navBar = By.className("navbar");
    By selectDe = By.xpath("//select//option[@value=\"de\"]");

    @Test
    public void changeALanguage(){
        driver.findElement(navBar).isDisplayed();
        driver.findElement(languageBox).isDisplayed();
        driver.findElement(select).click();
        driver.findElement(selectDe).click();
    }


}
