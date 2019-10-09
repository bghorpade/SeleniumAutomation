package demoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		System.out.println("Launching Browser");
		driver.get("https://www.seleniumeasy.com/test/");
		
		driver.findElement(By.xpath("(//a[@class = 'dropdown-toggle'])[1]")).click();
	
		driver.findElement(By.xpath("(//a[text() = \"Simple Form Demo\"])[1]")).click();
		
		WebElement Textbox = driver.findElement(By.xpath("//input[@placeholder = 'Please enter your Message']"));
		
		//Textbox.click();
		//Textbox.sendKeys("Test Message");
		
		//driver.quit();
		//System.out.println("Browser Closed");

	}

}
