import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

		public class Generator {

			static Scanner input = new Scanner(System.in);
			
			public static void main(String[] args){
				Generator generator = new Generator();
				generator.mainFunction();
				
			}
			
			 void mainFunction(){

				 
				 //System.out.print(" \t\t\t\t786\n");
					
					System.out.println("\t ________________________________________________________");
					System.out.println("\t|** WELCOME TO JAVA  HOSTEL MANAGEMENT  SYSTEM PROJECT **|");
					System.out.println("\t|________________________________________________________|");
					System.out.println("\t|                 **DEVELOPED BY CODE**                  |");
					System.out.println("\t|________________________________________________________|");
					System.out.println("\t| 1.Masum Billah(Team Leader-04)    2.Moushumi Rahman(05)|");
					System.out.println("\t| 3.Mst. Kamrun Nahar(06)           4.Md.Suaib(026)      |");
					System.out.println("\t| 5.Mahshiur Rahman(073)                                 |");
				    System.out.println("\t|________________________________________________________|");
					System.out.println("\t                          ***                             ");
					
				 
					 Date date= new Date();
			         DateFormat dateFormat =new SimpleDateFormat("dd/MM/YYYY");
			         String Currentdate =dateFormat.format(date);
			         
			         System.out.print("Current Date = "+ Currentdate);

			         {
			     		
			             LocalTime time= LocalTime.now();
			             DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
			             String FormattedTime = time.format(formatter);
			             
			             System.out.println("                       Current Time ="+FormattedTime);
			             
			     	}		
					
					
				System.out.println("\n****Select your Choice****");
				System.out.println("  --------------------------");
				System.out.println("1)Admin Panel:Login");
				System.out.println("2)Hostel Details");
				
				//System.out.println("2)Teacher");
				//System.out.println("3)Student");
				
				
				
				System.out.print("Enter Your choice : ");
				int choice = input.nextInt();


				switch(choice)
				{	
				case 1: 
					String username = "Niloy", password = "5";
					System.out.print("Username : "); String user = input.next();
					System.out.print("Password : "); String pass = input.next();
					if(username.equals(user) && password.equals(pass)) 
					{
						System.out.println("Admin logged in successfully!!!!");
						Admin admin = new Admin();
						admin.addEdit();
					}
					else
						System.out.println("Your Username Or Password Incorrect Please Try again");
					break;
				case 2:
					System.out.println(">>>**Hostel Details**<<<");
					System.out.println( "   ---------------------");
					System.out.println( "Total Students = 500");
					System.out.println( "Beds = 500");
					System.out.println( "Desks = 600");
					System.out.println( "Computers = 200");
					System.out.println( "Dining Room = 1");
					System.out.println( "Dining table = 10");
					System.out.println( "Hostel Gaurd = 5");
					System.out.println( "Hostel Cleaner = 3");
					break;
					
				
				}


			}

			
			}

		






