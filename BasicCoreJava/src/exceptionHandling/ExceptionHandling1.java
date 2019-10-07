package exceptionHandling;

public class ExceptionHandling1 {

	public static void main(String[] args) 
	{
String[] str = new String[3];
		
		str[0] = "Bhushan";
		str[1] = "Ghorpade";
		str[2] = "Techbodhi";
		
		
		try {
		//Array Index out of bound exception
		System.out.println(str[3]);
		} catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		try {
		//Arithmetic Exception
		System.out.println(10/0);
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		//Null pointer exception
		//acc.publicFunction();
		
		try {
		//StringIndexOutOfBoundsException
		String add = "Bhushan";
		System.out.println(add.charAt(7));
		} catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Testing completed");

	}

}
