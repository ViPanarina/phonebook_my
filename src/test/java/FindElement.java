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
public class FindElement extends BaseData{
    By contactBase = By.xpath("//div[@class=\"container\"]//app-contacts");
    By navigationOfContactBase = By.xpath("//ul[@class=\"nav-tabs bg-secondary text-white d-flex align-items-center p-2 nav\"]");
    By inputSearchContact = By.xpath("//input[@id=\"input-search-contact\"]");
    @Test
    public void findElement(){
        String contactData = "Pan";
        driver.findElement(contactBase).isDisplayed();
        driver.findElement(navigationOfContactBase).isDisplayed();
        driver.findElement(inputSearchContact).click();
        fillContactSearchField(contactData, inputSearchContact);
    }

}
