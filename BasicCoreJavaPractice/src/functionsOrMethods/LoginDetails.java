package functionsOrMethods;

public class LoginDetails {
	
	String uname = "Harry";
	//String pwd = "Potter";
	
	
	public void UserName()
	{
		System.out.println("Username "+uname+" has been entered");
	}
	
	public void Password()
	{
		System.out.println("Password has been entered");
	}
	
	public void LoginButton()
	{
		System.out.println("Login button has been pressed and "+uname+" has successfully logged in");
	}

}
