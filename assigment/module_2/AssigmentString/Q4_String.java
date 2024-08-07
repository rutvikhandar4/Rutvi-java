package AssigmentString;
/*
 Write a Java program to display the system time
 */
import java.text.SimpleDateFormat;
import java.util.Date;
public class Q4_String 
{
	           public static void main(String[] args) {
		        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		        Date date = new Date();
		        String currentTime = dateFormat.format(date);

		        System.out.println("Current System Time: " + currentTime);
		    }
		}


