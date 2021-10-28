package tttt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
    public static void main(String[] args) {
        /*
        Tips on how to define the locators by colors
        Tag ==  purple
        Attribute == Orange
        Text== Black

         we are retrieving the values from the h1 tag which is chicago
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.chicago.gov/city/en/depts/fin.html");
        WebElement h1 = driver.findElement(By.tagName("h1"));
        System.out.println(h1.getText());



    }
}
