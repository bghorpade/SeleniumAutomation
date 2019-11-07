package SamplePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondMavenClass {
	@Test
	public void launch()
	{
		WebDriver dr;
		System.out.println("Launch Chrome Browser");
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumAutomation\\Drivers\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://www.gmail.com/");
	}

}
