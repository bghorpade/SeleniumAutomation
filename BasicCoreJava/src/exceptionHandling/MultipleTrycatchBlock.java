package exceptionHandling;

import functions.AccessModifiers;

public class MultipleTrycatchBlock {
	static AccessModifiers acc;

	public static void main(String[] args) 
	{
		try {
		String[] str = new String[3];
		
		str[0] = "Bhushan";
		str[1] = "Ghorpade";
		str[2] = "Techbodhi";
		
		//Array Index out of bound exception
		System.out.println(str[2]);
		
		//Arithmetic Exception
		System.out.println(10/1);
		
		//Null pointer exception
		acc.publicFunction();
		
		//StringIndexOutOfBoundsException
		String add = "Bhushan";
		System.out.println(add.charAt(7));
		
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) 
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
		}finally 
		{
			System.out.println("Finally Block");
			System.out.println("Closing for data base connection");
			System.out.println("End Report");
			System.out.println("Clear Cache");
		}
		
		
	}

}
