package inheretance;

public class Users {

	public static void main(String[] args) 
	{
		Disbursment Client1 =  new Disbursment();
		// Launching Browser
		Client1.BrowserType();
		
		// Log in into the Application
		Client1.EnterUserName();
		Client1.EnterPassword();
		
		//Entering Client Details
		Client1.ClientDetails();
		
		//Underwriting
		Client1.RMOverView();
		
		//Approval
		Client1.ApprovalStatus();
		
		//Disbursement
		Client1.DisbursmentStatus();
		

	}

}
