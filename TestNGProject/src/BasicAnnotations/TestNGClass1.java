package BasicAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGClass1
{
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class TestNGClass1");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class TestNGClass1");
	}
	
	
	
	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("Before method TestNGClass1");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After method TestNGClass1");
	}

	
	
	@Test(priority = 0)
	public void test3()
	{
		System.out.println("Testing 3");
	}
	
	@Test(priority = 1)
	public void test1()
	{
		System.out.println("Testing 1");
	}
	
	@Test(priority = 2)
	public void test2()
	{
		System.out.println("Testing 2");
	}
}
