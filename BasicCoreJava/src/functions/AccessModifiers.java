package functions;

public class AccessModifiers 
{
	public static void main(String[] args) 
	{
	
		AccessModifiers obj = new AccessModifiers();
		obj.publicFunction();
		obj.privateFunction();
		obj.nonAccessModFunction();
		obj.protectedFunction();
	}
	
	public void publicFunction()
	{
		System.out.println("Public Function");
	}

	private void privateFunction()
	{
		System.out.println("Private Function");
	}
	
	void nonAccessModFunction()
	{
		System.out.println("No Access Mod Function");
	}
	
	protected void protectedFunction()
	{
		System.out.println("Protected Function");
	}
}
