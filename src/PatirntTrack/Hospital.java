package PatirntTrack;

import java.util.Scanner;

public class Hospital {

	private int h_id=7707;
	 private String h_name="Quaid e Azam International Hospital";
	 private String h_address="Rawalpindi";
	 private String h_status="Open now";
	 
	 private int h1_id=7780;
	 private String h1_name="KRL Hospital";
	 private String h1_address="Islamabad";
	 private String h1_status="Open now";
	 
	 private int h2_id=7820;
	 private String h2_name="RIC hospital";
	 private String h2_address="Rawalpindi";
	 private String h2_status="Open now";
	 
	 private int h3_id=7820;
	 private String h3_name="RIC hospital";
	 private String h3_address="Rawalpindi";
	 private String h3_status="Open now";
	 
	 public void choice(){
		 System.out.println("*******Hospital list********");
		 System.out.println("\nPress 1 for open hospitals ");
		 System.out.println("\nPress 2 for nearest hospitals ");
		 Scanner sc = new Scanner(System.in);
	        int choice = sc.nextInt();
	        
	        
	   switch(choice){        
	         case 1: open();
	          break;
	         case 2: nearest();
	          break;
	         default:
            	 System.out.println("\n(Please Select the correct option!)");
	   }
	 }

	public void open() {
		 System.out.println("===============================================");
		System.out.println("\n 1:Hospital id:"+h_id+"\n Hospital name:"+h_name+"\nAddress"+h_address+"\n status:"+h_status);
		System.out.println("\n 2:Hospital id:"+h1_id+"\n Hospital name:"+h1_name+"\nAddress"+h1_address+"\n status:"+h1_status);
		System.out.println("\n 3:Hospital id:"+h2_id+"\n Hospital name::"+h2_name+"\nAddress"+h2_address+"\n status:"+h2_status);
		 System.out.println("===============================================");
	}
public void nearest() {
	 System.out.println("===============================================");
	System.out.println("\nNearest hospital to your location is:");
	System.out.println("\n Hospital id:"+h3_id+"\n Hospital name:"+h3_name+"\nAddress"+h3_address+"\n status:"+h3_status);
	 System.out.println("===============================================");
	}}
