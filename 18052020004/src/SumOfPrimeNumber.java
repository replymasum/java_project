 import java.util.Scanner;
 public class SumOfPrimeNumber {
	public static void main(String[] args) {
		System.out.print("Please enter any Number :");
			int num=0;
			int sum=0;
	  Scanner input=new Scanner(System.in);
		num=input.nextInt();
				      
	  for(int i=2;i<=num;i++) {
		 Boolean isPrime = true;
		 
		for(int j=2; j<i;j++){
			 if(i%j==0){
		 isPrime =false;
			 break;        
			 }
		  }
				        
	  if(isPrime) { 
	    System.out.print(i+"  +  ");
		   sum=sum+i;
	       }
		 }    
				            
	 System.out.println("Summation is = "+sum);  
		}
	}



