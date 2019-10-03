package inheretance;

public class Approval extends Underwriting{
	
	String ApprovalManager, ApprovalStatus;
	
	public void ApprovalStatus()
	{
		if(ApprovalStatus == "Yes")
		{
		System.out.println(ApprovalManager+" ApprovalManager has approved the application");
		}
		else
		System.out.println(ApprovalManager+" ApprovalManager has not approved the application");
		
	}

}
