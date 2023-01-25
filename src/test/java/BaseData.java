import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BaseData {
    WebDriver driver;

    By loginForm = By.id("login-form");
    By header = By.xpath( "//div[@class=\"card-body\"]");
    By emailField = By.xpath("//input[@type=\"email\"]");
    By passwordField = By.xpath("//input[@type=\"password\"]");
    By buttonSubmit = By.xpath("//button[@type=\"submit\"]");

    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setupTest(){
        driver = new ChromeDriver();
        driver.get("http://phonebook.telran-edu.de:8080/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String validData = "test@gmail.com";
        driver.findElement(loginForm).isDisplayed();
        driver.findElement( header).isDisplayed();
        fillField(validData, emailField);
        fillField(validData, passwordField);
        driver.findElement(buttonSubmit).click();
    }

    public void fillField(String validData, By locator) {
        driver.findElement(locator).click();
        driver.findElement(locator).sendKeys(validData);
    }

    public void fillContactSearchField(String contactData, By locator){
        driver.findElement(locator).click();
        driver.findElement(locator).sendKeys(contactData);
    }


    @AfterMethod
    public void tearDown(){
        if (driver != null){
          //  driver.quit(); // закроет браузер
            // driver.close(); закроет вкладку
        }
    }
}
