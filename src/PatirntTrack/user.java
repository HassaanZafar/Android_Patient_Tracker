package PatirntTrack;
import java.io.*;
import java.util.Scanner;

public class user {

	public static void main(String[] args) {

		System.out.println("**** Welcome to Android Patient Tracking ****\n ==============================================="); 
		  System.out.println("\n Please Enter your choice: \n  1)Doctor\n  2)Patient\n ===============================================");
		  Scanner sc = new Scanner(System.in);
		        int choice = sc.nextInt();
		        
		    do{
		   switch(choice){        		    
		  
		   case 1: Doctor D = new Doctor(choice, null, choice, null);
           D.choice1();
           break;
	         case 2: Patient P = new Patient();
	           P.choice1();
	    
		          break;
		   }
		        }while(choice!=0);
		 }
		 
		
	}

