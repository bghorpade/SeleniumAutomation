package arrays;

public class Array1 {

	public static void main(String[] args) 
	
	{
		
		String[] str = new String[6];
		
		str[0]= "Animesh";
		str[1]=	"Tejashree";
		str[2]= "Mahesh";
		str[3]="Pradeep";
		str[4]="Nikhil";
		str[5]="Bhushan";
		
		//System.out.println(str[5]);
		
		//System.out.println(str.length);
		
		//for(int i = 0; i < str.length ;i++)
		
			//System.out.println(str[i]);
		
		for(String s:str)
			
		{
			System.out.println(s);
		}
		
		
	}

}
