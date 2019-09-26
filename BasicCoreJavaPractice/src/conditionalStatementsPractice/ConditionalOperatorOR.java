//Program to find required destination in a Shopping Mall

package conditionalStatementsPractice;

public class ConditionalOperatorOR {

	public static void main(String[] args) {
		
		/* Available Options :
		 * Books
		 * Electronics
		 * Clothes
		 * Medicines
		 * Restaurant
		 * GamingZone
		 */
		String SearchingFor = "Medicines";

		if (SearchingFor == "Books" || SearchingFor == "Electronics")

		{
			System.out.println("For " +SearchingFor+ " Please go to ground floor.");
		} else if (SearchingFor == "Clothes" || SearchingFor == "Medicines")

		{
			System.out.println("For " +SearchingFor+ " Please go to first floor.");
		} else if (SearchingFor == "Restaurant" || SearchingFor == "GamingZone")

		{
			System.out.println("For "+SearchingFor+" Please go to second floor.");
		} else
			System.out.println("Entered "+SearchingFor+", Destination does not exists.");

	}

}
