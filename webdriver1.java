import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import  org.testng.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/****
 * Below test uses one of the test site from https://www.techbeamers.com/websites-to-practice-selenium-webdriver-online/
 * https://s1.demo.opensourcecms.com/s/44 give option to login and do usual Web actions
 ******/
public class webdriver1 {

    public static void main(String arg[]) {
        System.out.println("Hi");

        System.setProperty("webdriver.gecko.driver", "/Users/shaickmohamedsirajudeen/Selenium/geckodriver");
        WebDriver driver = new FirefoxDriver();
        String url = "https://s1.demo.opensourcecms.com/s/44";
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebDriverWait mywait = new WebDriverWait(driver,10);

        driver.get(url);
        String title = driver.getTitle();
        System.out.println("Title is" + title);
        //driver.manage().window().setSize(new Dimension(792, 695));
//        driver.switchTo().frame(0);
        driver.switchTo().frame("preview-frame");
        mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUsername")));
        mywait.until(ExpectedConditions.titleContains(title));
        //mywait.until(ExpectedConditions.
       // WebElement userName = driver.findElement(By.id("txtUsername"));
        WebElement userName = driver.findElement(By.xpath("//*[@name=\"txtUsername\"]"));
        WebElement passWord = driver.findElement(By.id("txtPassword"));
        userName.sendKeys("opensourcecms");
        passWord.sendKeys("opensourcecms");

        driver.findElement(By.id("btnLogin")).click();


       // try { Thread.sleep(5000);} catch (Exception error){System.out.println(error);}
        driver.navigate().refresh();

        driver.quit();
    }
}
