package exceptionHandling;

import functions.AccessModifiers;

public class ExceptionType1 {
	
	static AccessModifiers acc;

	public static void main(String[] args) {
		String[] str = new String[3];
		
		str[0] = "Bhushan";
		str[1] = "Ghorpade";
		str[2] = "Techbodhi";
		
		//Array Index out of bound exception
		//System.out.println(str[3]);
		
		//Arithmetic Exception
		//System.out.println(10/0);
		
		//Null pointer exception
		//acc.publicFunction();
		
		//StringIndexOutOfBoundsException
		//String add = "Bhushan";
		//System.out.println(add.charAt(7));
		
		
		

	}

}
