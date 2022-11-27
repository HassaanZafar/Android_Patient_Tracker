package PatirntTrack;

public class Appointment {
	private int doc_id=799;
	 private String doc_name="Muhammad Hassaan Zafar";
	 private int date=11;
	 private String status="upcoming";
	 private String type="Dental treatement";
	 
	 public void choice(){

		  Patient P = new Patient();
		  String patient_name =P.getDoc_name();
		  int p_id = P.getDoc_id();
		  Doctor D = new Doctor(p_id, patient_name, p_id, patient_name);
		  System.out.println("\n===============================================");
		  System.out.println("\n(****** Appointment with Doctor *******) \n\n  DoctorID is: "+doc_id+
		    "\n  DoctorName is:"+doc_name+ "\n  On date="+date+ "\n  Status:"+status+ "\n  Type:"+type);
		  System.out.println("\n===============================================");
		 }

}
