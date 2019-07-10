package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.marionette","/home/user/Desktop/Testing/geckodriver-v0.24.0-linux64/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

      //  WebElement searchText = driver.findElement(By.id("newtab-search-text"));
       // searchText.sendKeys("ebay");

        driver.get("https://www.ebay.com/");


    }
}
