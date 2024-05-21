package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// /usr/local/bin/chromedriver to execute the chromedriver before running the main function
public class demo1 {
    public static void main(String[] args) throws InterruptedException {
        // open google browser
        WebDriver driver = new ChromeDriver();

        // go to google.com
        driver.get("https://hk.58.com/");

        // window is changed to the max version
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // get the element by id
        WebElement elementInput = driver.findElement(By.id("keyword"));
        // input - 兩室一廳
        elementInput.sendKeys("兩室一廳");

        // close the window
        driver.close();
    }
}
