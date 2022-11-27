package PatirntTrack;
import java.util.*;
import java.util.Scanner;  
public class Doctor extends user {
		
		private int patient_id;
		 private String patient_name;
		private int patient_contact;
		 private String patient_gender;
		
	        Doctor(int patient_id, String patient_name, int patient_contact, String patient_gender ){
	            this.patient_id= patient_id;
	             this.patient_contact=patient_contact;
	             this.patient_name=patient_name;
	             this.patient_gender=patient_gender;
	        }
	         
	        public int getpatient_id() {
		  return patient_id;
		 } 

		 public String getpatient_name() {
		  return patient_name;
		 }

		 public int getpatient_contact() {
			  return patient_contact;
			 }

	        public String getpatient_gender() {
		  return patient_gender;
		 } 
	public String toString(){
	    return patient_id + " " +patient_name+ " " +patient_contact+ " "+patient_gender;
	}
	

public void choice1(){
	 System.out.println("**** Welcome to Doctor menu ****\n ===============================================");
     List<Doctor> col=new ArrayList<Doctor>();
     Scanner sc = new Scanner(System.in);
     Scanner s1= new Scanner(System.in);
     int choice;
     do{
         System.out.println("\n1. Insert record");
         System.out.println("2. View record");
         System.out.println("3. Delete Patient");
         System.out.println("4. Update Patient");
         choice = sc.nextInt();
         
         switch(choice){
             case 1:
                 System.out.print("Enter Patient id:");
                 int patient_id=sc.nextInt();
                 System.out.print("Enter Patient name:");
                 String patient_name=s1.nextLine();
                 System.out.print("Enter Patient contact:");
                 int patient_contact=sc.nextInt();
                 System.out.print("Enter Patient Gender:");
                 String patient_gender=s1.nextLine();
                
                 
                 col.add(new Doctor(patient_id, patient_name, patient_contact, patient_gender));
                 break;
             case 2:
            	 System.out.println("===============================================");
            	 System.out.println("View:");
                 Iterator<Doctor> i=col.iterator();
                 while(i.hasNext()){
                     Doctor D= i.next();
                     System.out.println(D);
                 }
                    System.out.println("===============================================");
                 break;
             case 3:
                 boolean Del=false;
                 System.out.print("Enter patient id to Delete:");
                 patient_id=sc.nextInt();
                 System.out.println("===============================================");
                 i=col.iterator();
                 while(i.hasNext())
                 {
                     Doctor D=i.next();
                     if(D.getpatient_id()==patient_id){
                         i.remove();
                         Del=true;
                     }
                 }
                 if(!Del){
                     System.out.println("Record not found");
                 }else
                 {
                     System.out.println("Record deleted successfully");
                 }
                 System.out.println("===============================================");
                 break;
             case 4:
                 Del=false;
                 System.out.print("Enter patient id to Update:");
                 patient_id=sc.nextInt();
                 System.out.println("===============================================");
                 ListIterator<Doctor>li = col.listIterator();
                 while(li.hasNext())
                 {
                     Doctor D=li.next();
                     if(D.getpatient_id()==patient_id){
                         System.out.println("Enter new name:");
                         patient_name=s1.nextLine();
                         
                         System.out.println("Enter new contact:");
                         patient_contact=sc.nextInt();
                         
                         System.out.println("Enter patient gender:");
                         patient_gender=s1.nextLine();
                         li.set(new Doctor(patient_id,patient_name,patient_contact,patient_gender));
                         Del=true;
                     }
                 }
                 if(!Del){
                     System.out.println("Record not found");
                 }else
                 {
                     System.out.println("Record is updated successfully");
                 }
                 System.out.println("===============================================");
                 break;   
                 default:
                	 System.out.println("\n(Please Select the correct option!)");
         }
     }
     while(choice!=0);
     }
     }

