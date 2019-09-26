// Program to verify whether the User is eligible for discount

package conditionalStatementsPractice;

public class ConditionalOperatorAnd {

	public static void main(String[] args) {
		
		String PrimeAccount = "Yes", SBICreditCard = "No";
		
		if (PrimeAccount == "Yes" && SBICreditCard == "Yes")
			
		{
			System.out.println("User is eligible for 10% Discount");
		}
		else
			System.out.println("User is not eligible for Discount");

	}

}
