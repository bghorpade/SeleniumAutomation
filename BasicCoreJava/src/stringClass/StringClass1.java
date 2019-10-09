package stringClass;

public class StringClass1 {

	public static void main(String[] args) {
		
		String str = " bhuShan ";
		String str2 = "bhushan";
		
		/*String[] str = new String[5];
		
		str[0] = "b";
		str[1] = "h";
		str[2] = "u";
		str[3] = "s";
		str[4] = "h";*/
		
		//1
		System.out.println(str.length());
		
		//2
		System.out.println(str.charAt(4));
		
		//3
		System.out.println(str.toUpperCase());
		
		//4
		System.out.println(str.toLowerCase());
		
		//5
		System.out.println(str.trim());
		
		//6
		System.out.println(str.equals(str2));
		
		//7 gives false due to space in string
		System.out.println(str.equalsIgnoreCase(str2));
		
		//8
		System.out.println(str.trim().equalsIgnoreCase(str2));
		
		//9
		System.out.println(str.replace("h", "H"));
		
		//10
		String[] temp =str.split("S");
		
		for(String s:temp)
		{
			System.out.println(s);
		}
			
		
		//11
		
		System.out.println(str2.substring(3));
		System.out.println(str2.substring(3, 5));
		
		
		
	}

}
