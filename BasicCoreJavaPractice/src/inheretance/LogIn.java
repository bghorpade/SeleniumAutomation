package inheretance;

public class LogIn extends LaunchBrowser
{

	String Username, password;
	
	public void EnterUserName()
	{
		System.out.println(Username+" username has been entered");
	}
	
	public void EnterPassword()
	{
		System.out.println(password+" password has been entered");
	}
}
