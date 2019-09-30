package arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) 
	
	{
		String[][] str = new String[4][2];
		
		str[0][0] = "UserName";
		str[0][1] = "Password";
		str[1][0] = "U1";
		str[1][1] = "P1";
		str[2][0] = "U2";
		str[2][1] = "P2";
		str[3][0] = "U3";
		str[3][1] = "P3";
		
		//System.out.println(str[2][1]);
		
		/*for(String s:str)
		{
			System.out.println(s);
		}*/

		for(int r=0; r<str.length;r++)
		{
			for(int c=0;c<str[2].length;c++)
			{
				System.out.print(str[r][c]+" ");
				
			}System.out.println();
		}
		
	}

}
