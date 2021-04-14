import java.util.Scanner;
public class StringReverse {
	 public static void main(String[] args) {
		  String name ;
		  System.out.print("Input a String :");
		  Scanner input = new Scanner(System.in);

		   name=input.nextLine();
		   int length = name.length();
			String rev="";

			for (int i=length-1;i>=0;i--) {

			rev=rev+name.charAt(i);
						
		         }
		   System.out.println("Reverse String : "+rev);
		     }

		   }



