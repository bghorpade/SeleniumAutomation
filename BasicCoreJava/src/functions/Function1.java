package functions;

public class Function1 
{
	public static void main(String[] args) 	
	{
		/*sum(10,20);
		sum(100,200);
		sum(1012,20);
		sum(10,20);*/
		
		/*int add1= sum1(11,20);
		System.out.println(add1);*/
		
		int add2 = sum1(10,20,30);
		
		System.out.println(add2);
		
	}
	
	public static void sum(int a, int b)
	{
		int add = a+b;
		System.out.println("adding from sum method "+add);
	}
	
	//type2
	public static int sum1(int a, int b) 
	{
		return a+b;
		
	}
	
	//type3 --Method Overloading
	public static int sum1(int a, int b,int c) 
	{
		return a+b+c;
		
	}
	
	

}


