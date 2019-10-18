package basicSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumClass1 
{
	@Test
	public void login()
	{
		System.out.println("Launch Chrome Browser");
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumAutomation\\Drivers\\chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("https://www.google.com");
		
		
	}

}
