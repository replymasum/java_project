import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class CurrentDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Date date= new Date();
         DateFormat dateFormat =new SimpleDateFormat("dd/MM/YYYY");
         String Currentdate =dateFormat.format(date);
         
         System.out.print("Current Date = "+ Currentdate);
         System.out.println();
          
	}
}
	
	
	
	
	




