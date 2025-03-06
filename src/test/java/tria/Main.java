package tria;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // Set the path for the ChromeDriver
        System.setProperty("webdriver.chromedriver", "/home/kaleesh/chromedriver-linux64");

        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Navigate to a website
        driver.get("https://www.facebook.com/");

        // Locate an element to hover over
        WebElement hoverElement = driver.findElement(By.id("email"));

        // Create an instance of Actions class
        Actions actions = new Actions(driver);

        // Perform hover action
        actions.moveToElement(hoverElement).perform();

        // Locate another element to click
        WebElement clickElement = driver.findElement(By.name("pass"));

        // Click on the element
        actions.click(clickElement).perform();

        // Send keyboard input to an input field
        WebElement inputField = driver.findElement(By.id("email"));
        actions.sendKeys(inputField, "Hello, Selenium!").perform();

    }
}