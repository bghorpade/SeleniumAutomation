package functions;

public class Patients {

	public static void main(String[] args) 
	{
		Hospital hospital1 = new Hospital();
		
		hospital1.hospitalName = "Noble Hospital";
		hospital1.patientType = "Bone injury";
		hospital1.speciality = "Orthopedic";
		hospital1.doctorsName = "Dr.Sharma";
		
		hospital1.numberOfBeds = 100;
		hospital1.numberOfDoctors = 10;
		
		
		hospital1.treatment();
		hospital1.capacity();

		Hospital hospital2 = new Hospital();
		{
			hospital2.hospitalName = "Colimbia Asia";
			hospital2.patientType = "Cancer";
			hospital2.speciality = "Onclogist";
			hospital2.doctorsName = "Dr.Batra";
			
			hospital2.numberOfBeds = 50;
			hospital2.numberOfDoctors = 5;
			
			

		}
		
		Hospital hospital3 = new Hospital("Tooth Ache","Dr.Manohar","Dentist",1000,100,"City Hospital");
		{
			hospital3.treatment();
			hospital3.capacity();
			
		}
		
	}

}
