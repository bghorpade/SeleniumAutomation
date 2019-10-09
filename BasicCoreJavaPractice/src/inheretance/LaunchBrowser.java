package inheretance;

public class LaunchBrowser 

{
	String Browser;
	
	public void BrowserType()
	{
		
		if(Browser == "Chrome")
		{
		System.out.println("Chrome Browser is Launched"); 
		}else if(Browser == "Firefox")
		{
		System.out.println("Firefox Browser is launched");
		}
		else if(Browser == "Internet Explorer")
		{
		System.out.println("Internet Explorer browser is launched");
		}
		else
			System.out.println(Browser+" Browser is launched");	
	}
}
