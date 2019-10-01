package loops;

import functions.AccessModifiers;

public class TestAccessModAtProjectLevel extends AccessModifiers
{
 
	public static void main(String[] args) 
	{
		AccessModifiers obj = new AccessModifiers();
		TestAccessModAtProjectLevel obj1 = new TestAccessModAtProjectLevel();
		obj.publicFunction();
		obj1.protectedFunction();
	
		
	}

}
