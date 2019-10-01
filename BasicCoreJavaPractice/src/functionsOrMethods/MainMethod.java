package functionsOrMethods;

public class MainMethod {

	public static void main(String[] args)
	{
		LaunchBrowser browser = new LaunchBrowser();
		LoginDetails login = new  LoginDetails();
		LoanClientOnboarding lco = new LoanClientOnboarding();
		
		
		
		browser.BrowserLaunch();
		
		System.out.println();
		
		login.uname = "Samuel";
		login.UserName();
		login.Password();
		login.LoginButton();
		
		System.out.println();

		lco.Name = "Samuel Rogrers";
		lco.Age = 35;
		lco.occupation = "Service";
		lco.PAN = "DTWP1652C";
		lco.UserDetails();
		
	}

}
