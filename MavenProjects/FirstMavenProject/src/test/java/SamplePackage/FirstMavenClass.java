package SamplePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstMavenClass

{
	
	public void launch()
	{
		WebDriver dr;
		System.out.println("Launch Chrome Browser");
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumAutomation\\Drivers\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://www.newtours.demoaut.com/");
	}
	
	
	@Test
	public void test1()
	{
		System.out.println("Testing Maven");
	}
}
