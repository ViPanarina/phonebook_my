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
public class LoginWithValidData extends BaseData{

    By loginForm = By.id("login-form");
    By header = By.xpath( "//div[@class=\"card-body\"]");
    By emailField = By.xpath("//input[@type=\"email\"]");
    By passwordField = By.xpath("//input[@type=\"password\"]");
    By buttonSubmit = By.xpath("//button[@type=\"submit\"]");
    @Test
    public void loginWithValidData(){
        String validData = "test@gmail.com";
        driver.findElement(loginForm).isDisplayed();
        driver.findElement( header).isDisplayed();
        fillField(validData, emailField);
        fillField(validData, passwordField);
        driver.findElement(buttonSubmit).click();

    }
}
