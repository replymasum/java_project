import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LocalTime time= LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String FormattedTime = time.format(formatter);
        
        System.out.println("Current Time ="+FormattedTime);
        
	}

}

