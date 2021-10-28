package tttt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LocatorPractice {
    public static void main(String[] args) throws InterruptedException {
        /*
        This class im doing a recap about how to locate webElements and how to retrieve the value from it
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://google.com");

        WebElement element = driver.findElement(By.id("gbqfbb"));
     //   element.click(); we are getting rid off the click because it will change the value from out text
        String actualText = element.getAttribute("value"); // we are selecting get attribute because we are reading from the attribute !!
        String expectedText = "I'm Feeling Lucky";
        //then we just need an if condition to complete our assertion.
        if (actualText.equals(expectedText)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
            System.out.println("Expected text: " + expectedText);
            System.out.println("ActualText = " + actualText);
        }
        Thread.sleep(3000);
        driver.quit();







    }
}
