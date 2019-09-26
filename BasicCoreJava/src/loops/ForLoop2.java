package loops;

public class ForLoop2 
{

	public static void main(String[] args) 
	{
		for(int callToUser=1; callToUser<=10; callToUser++)
		{
			if(callToUser == 3)
			{
				System.out.println("SMS the caller to call back");
				break;
				
			}
			System.out.println("Call Again");
		}
		
	}

}
