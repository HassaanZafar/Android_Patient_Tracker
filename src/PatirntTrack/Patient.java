package PatirntTrack;
import java.util.Scanner;



public class Patient  extends user {

	 private int doc_id=799;
	 private String doc_name="Muhammad Hassaan Zafar";
	 
	 public void choice1(){
		 System.out.println("**** Welcome to Patient's menu ****");
		 System.out.println("\nEnter your choice: \n1)Check available doctors \n2)Check your Appointment \n3)Check Hospital");
	  Scanner sc = new Scanner(System.in);
	        int choice = sc.nextInt();
	        
	        
	   switch(choice){        
	         case 1: checkDoctor();
	          break;
	         case 2: Appointment A=new Appointment();
	         A.choice();
	         break;
	         case 3: Hospital H=new Hospital();
	         H.choice();
	        	 break;
	         default:
            	 System.out.println("\n(Please Select the correct option!)");
	   }

	 }
	 
	 public int getDoc_id() {
	  return doc_id;
	 }

	 public void setDoc_id(int doc_id) {
	  this.doc_id = doc_id;
	 }

	 public String getDoc_name() {
	  return doc_name;
	 }

	 public void setDoc_name(String doc_name) {
	  this.doc_name = doc_name;
	 }
	 
	 public void checkDoctor(){
		 System.out.println("=======================================");
	  System.out.println("Available doctors are=\n 1.Doctor Ali (surgeon)\n 2.Doctor Aslam(Cardiologists)\n 3.Doctor Hamid(Neurologists)");
	  System.out.println("========================================");
	 }

}
