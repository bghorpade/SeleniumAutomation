package advancedSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MouseHover {
	
	
		@Test
		public void login() throws InterruptedException
		{
			System.out.println("Launch Chrome Browser");
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumAutomation\\Drivers\\chromedriver.exe");
			ChromeDriver dr = new ChromeDriver();
			dr.manage().window().maximize();
			
			dr.get("https://www.flipkart.com");
			
			//implicit wait
			dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			WebElement cancel = dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
			
			//Explicit Wait
			WebDriverWait wait = new WebDriverWait(dr,5);
			wait.until(ExpectedConditions.visibilityOf(cancel)).click();
			
			
			WebElement MenuMen = dr.findElement(By.xpath("//span[text()='Men']"));
			MenuMen.click();
			
			MouseHover.waiting();
			
			WebElement Shirts = dr.findElement(By.xpath("//a[text()='Shirts']"));
			Shirts.click();
			
			MouseHover.waiting();
			dr.quit();
	
			
	}
		
		
		public static void waiting() throws InterruptedException
		{
			Thread.sleep(5000);
		}

}
