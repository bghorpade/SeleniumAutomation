package functions;

public class User1 {

	public static void main(String[] args) 
	{
		Car.wheels = 10;
		Car polo = new Car();
		//polo.wheels = 6;
		polo.colour = "Red";
		polo.type = "Hatchback";
		polo.accelecation();

		
		Car I20 = new Car();
		//I20.colour = "Black";
		//I20.type = "Hatchback";
		//I20.wheels = 4;
		I20.accelecation();
		
		System.out.println(polo.colour);
		System.out.println(I20.colour);
		
		System.out.println(polo.wheels);
		System.out.println(I20.wheels);
		
		
	}

}
