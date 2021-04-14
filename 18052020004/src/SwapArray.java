import java.util.Scanner;
public class SwapArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
  System.out.print("Enter an array : ");
  try (Scanner s =new Scanner(System.in)){
     String a = s.nextLine();
	int x;
        int len = a.length();
        char[] Array = new char[len];  //char Array[60]
			
	Array[0] = a.charAt(len-1);
	Array[len-1] = a.charAt(0);
			
	for(x = 1; x<len-1 ; x++) 
      Array[x] = a.charAt(x);
System.out.println("first and "+ "last elements of the array : "); 
           for(x = 0; x<len; x++) 
              System.out.print(Array[x]);		
 }
  }
   }



