package tria;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator {
   public static void main(String[] args) {
	 //  System.setProperty("WebDriver.chromedriver","/home/kaleesh/Documents/Important Coding Files/eclipse-workspace/MavenTrial/target/chromedriver");
		WebDriverManager.chromedriver().setup();
	   WebDriver driver = new ChromeDriver();
		String url = ("https://www.facebook.com/");
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement dri = driver.findElement(By.id("email"));
		dri.sendKeys("Kaleesh");
		
		WebElement a = driver.findElement(By.name("pass"));
		a.sendKeys("5855123321");
		
		Actions ne = new Actions(driver);
		ne.doubleClick(dri).perform();
		
		
	}

}


