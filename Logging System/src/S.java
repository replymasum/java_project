import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
	public class S {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	         Date date= new Date();
	         DateFormat dateFormat =new SimpleDateFormat("dd/MM/YYYY");
	         String Currentdate =dateFormat.format(date);
	         
	         System.out.print("Current Date = "+ Currentdate);
	         System.out.println();
	         
	         {
	     		
	             LocalTime time= LocalTime.now();
	             DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
	             String FormattedTime = time.format(formatter);
	             
	             System.out.println("Current Time ="+FormattedTime);
	             
	     	}
	          
		}

	}





