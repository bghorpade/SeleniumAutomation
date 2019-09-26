// Program to determine whether a vehicle is four wheeler or two wheeler

package conditionalStatementsPractice;

public class ConditionalStatementNestedIF {

	public static void main(String[] args) {
	
		String Vehicle = "Road Vehicle", VehicleType = "Three Wheeler";
		
	if(Vehicle == "Road Vehicle")
		{
			if(VehicleType == "Two Wheeler")
				
			{
				System.out.println("The Vehicle is a Bike");
			}
			else if (VehicleType == "Four Wheeler")
				
			{
				System.out.println("The Vehicle is a Car");
			}
				
			else
				
				System.out.println("The vehicle is a Road vehicle but not a Bike nor a Car, it is a "+VehicleType + Vehicle);
		}
	else
	System.out.println("The vehicle is not a Road Vehicle, it is a "+ Vehicle);

	}

}
