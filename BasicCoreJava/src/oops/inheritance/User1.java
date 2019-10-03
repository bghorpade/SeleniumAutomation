package oops.inheritance;

public class User1 {

	public static void main(String[] args) {
		
		SmartPhone phone = new SmartPhone();
		System.out.println("Phone Executing");
		phone.calling();
		phone.texting();
		phone.internet();
		
		SmartPhone phone1 = new SmartPhone();
		System.out.println("phone1 Executing");
		phone1.internet();
		phone.texting();
		
		Telephone phone2 =  new Telephone();
		phone2.calling();
		
		Telephone phone3 = new SmartPhone();
		phone3.calling();
		
		
		
		

	}
	

}
