package loops;

public class PrintPatternLoop 
{

	public static void main(String[] args) 
	{
		for (int i = 1; i < 5; i++) {
			//for (int j = 1; j < 5; j++) {
				//System.out.print("* ");
				
				int j = 1;
				do 
				{
					System.out.print("* ");
					j++;
				} while(j < 5);
			
			System.out.println();
		}
	}

}
