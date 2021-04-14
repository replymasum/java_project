import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.*;


 class HMS {

	public static void main(String[] args) {
	Scanner sc =new Scanner (System.in);
	System.out.println();
	System.out.print(" \t\t\t\t786\n");
	/*String [] niloy = {"Masum","moni","supto",};
	//niloy[0] ="Masum";
	System.out.println(niloy[0]);
	*/
	
	
	
	System.out.println(" \t ________________________________________________________\n");
	System.out.println("\t|                                                        |\n");
	System.out.println("\t|** WELCOME TO JAVA  HOSTEL MANAGEMENT  SYSTEM PROJECT **|\n");
  System.out.println("\n\t|                                                        |\n");
	System.out.println("\t|________________________________________________________|\n");
	System.out.println("\t|       DEVELOPED BY CODE WITH JAVA TEAM                 |\n");
   System.out.println(" \t|________________________________________________________|\n");
	System.out.println("\t       *****************************************              \n");
	
		
	
	
	Date date= new Date();
    DateFormat dateFormat =new SimpleDateFormat("dd/MM/YYYY");
    String Currentdate =dateFormat.format(date);
    
    System.out.print("Current Date = "+ Currentdate);
    //System.out.println();
    
    {
		
        LocalTime time= LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String FormattedTime = time.format(formatter);
        
        System.out.println("                               Current Time ="+FormattedTime);
        
	}
	 System.out.println();
	 System.out.println("Registration for :____");
	 System.out.println("Login for Admin:____");
	 String UserID,Password;
     System.out.println("Admin UserID:");
     UserID=sc.nextLine();
    
     System.out.println("Enter Password:");
     Password=sc.nextLine();
     if(UserID.equals("180520") && (Password.equals("Niloy"))){
    	 System.out.println("Logging Successfully.");
    	 
    	 String chr="y";
    	 System.out.println("Enter the option :\n1.Student Details\n2.Hostel Details\n3.Display Details");
    		int choice = sc.nextInt();
    		switch(choice) {
    		case 1:System.out.println("Enter Register Number");
    				String regNo = sc.next();
    				
    				System.out.println("Enter the choice :\n1.Room Details\n2.Fees Details");
    				int ch = sc.nextInt();
    				switch(ch) {
    				case 1: System.out.println("Enter Room number");
    						int roomno = sc.nextInt();
    						
    						System.out.println("Enter Room Type");
    						String room = sc.next();
    						
    				}
    				
    				System.out.println("Do you want to continue?(y/n): ");
    				chr = sc.next();
    				break;	
    		case 2: {
    		    System.out.println( "Total Students = 500");
    			System.out.println( "Beds = 500");
    			System.out.println( "Desks = 600");
    			System.out.println( "Computers = 200");
    			System.out.println( "Dining Room = 1");
    			System.out.println( "Dining table = 10");
    		}
    			break;
    		case 3: {
    			
    			System.out.println("Do you want to continue?(y/n): ");
    				     	chr = sc.next();	
    				     	break;}
    				}
    				}
    		
     
     else{
    	System.out.println("Your userID Or Password Incorrect Please try again letter.");
     }

     System.out.println();
     
     System.out.println("Admin UserID:");
     UserID=sc.nextLine();
     System.out.println("Enter  Password:");
     Password=sc.nextLine();
     System.out.println("Logging Successfully");
	 System.out.println();
	 
	 
	String chr="y";
	while(chr.equals("y")) {
	System.out.println("Enter the option :\n1.Student Details\n2.Hostel Details\n3.Display Details");
	int choice = sc.nextInt();
	switch(choice) {
	case 1:System.out.println("Enter Register Number");
			String regNo = sc.next();
			
			System.out.println("Enter the choice :\n1.Room Details\n0.Fees Details");
			int ch = sc.nextInt();
			switch(ch) {
    case 1: System.out.println("Enter Room number");
					int roomno = sc.nextInt();
					
					System.out.println("Enter Room Type");
					String room = sc.next();
					 break;
			}
					
					System.out.println();
		
					System.out.println("Do you want to continue?(y/n): ");
					chr = sc.next();	
	case 2: 
	    System.out.println( "Total Students = 500");
		System.out.println( "Beds = 500");
		System.out.println( "Desks = 600");
		System.out.println( "Computers = 200");
		System.out.println( "Dining Room = 1");
		System.out.println( "Dining table = 10");
		System.out.println( "Hostel Gaurd = 5");
		System.out.println( "Hostel Cleaner = 3");
		
		
        System.out.println("Do you want to continue?(y/n): ");
					chr = sc.next();
					
					
					
	 }
	
     }
	
	}

}
	

	
