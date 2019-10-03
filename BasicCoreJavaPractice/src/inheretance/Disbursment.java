package inheretance;

public class Disbursment extends Approval {
	
	String DisbursmentOfficer;
	public void DisbursmentStatus()
	{
		if(ApprovalStatus == "Yes")
		{
			System.out.println("Loan is been disbursed by Disbursment Officer "+DisbursmentOfficer);
		}
	}

}
