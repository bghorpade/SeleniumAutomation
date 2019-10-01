package functions;

public class Hospital 
{
	public String patientType; //= "Bone Injury";
	public String doctorsName; //= "Dr.Sharma"; 
	public String speciality; //= "Orthopedic";
	public int numberOfBeds; //= 100;
	public int numberOfDoctors; //= 10;
	public String hospitalName; //= "Noble Hospital";
	
	
	public void treatment()
	{
		System.out.println("Patient with "+patientType+" will be sent to "+speciality+" "+doctorsName);
	}

	public void capacity()
	{
		System.out.println(hospitalName+" has "+numberOfBeds+" beds and "+numberOfDoctors+" doctors");
	}
	
	//Default Constructor
	public Hospital()
	{
		
	}
	
	public Hospital(String patientType,String doctorsName,String speciality,int numberOfBeds,int numberOfDoctors,String hospitalName)
	{
		this.patientType = patientType;
		this.doctorsName = doctorsName;
		this.speciality = speciality;
		this.numberOfBeds= numberOfBeds;
		this.numberOfDoctors = numberOfDoctors;
		this.hospitalName = hospitalName;
		
	}
	
}
