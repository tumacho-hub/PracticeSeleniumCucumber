package basicNavigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

    public static void main(String [] args) throws InterruptedException {

    WebDriverManager.chromedriver().setup();
    ChromeDriver driver = new ChromeDriver();
    String url = ("https://apple.com");
    driver.manage().window().maximize();
    driver.get(url);
    WebElement iphone = driver.findElement(By.linkText("iPhone"));
    String actualText = iphone.getText();
    String expectedText = "iPhone";

    if (actualText.equals(expectedText)){
        System.out.println("Passed");
    }else{
        System.out.println("Failed");
        System.out.println(actualText);
    }

        Thread.sleep(2000);
        driver.close();


    }
    }

