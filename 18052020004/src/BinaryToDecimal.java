import java.util.Scanner;
public class BinaryToDecimal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a binary number: ");
	  String bin =input.nextLine();	
	  System.out.print("Decimal number is: ");
  System.out.print(Integer.parseInt(bin,2));
	
	}

}

