import java.util.Scanner;

public class UserIDAndPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner  input = new Scanner(System.in);
     String UserID,Password;
     System.out.println("Enter your UserID:");
     UserID=input.nextLine();
     System.out.println("Enter your Password:");
     Password=input.nextLine();
     if(UserID.equals("180520") && (Password.equals("Niloy767172"))){
    	 System.out.println("Logging Successfully");
     }
     else{
    	System.out.println("Your userID Or Password Incorrect Please try again letter");
     }
	}
}

	


