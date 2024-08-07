package AssigmentString;

/*
 • W.A.J.P to find all interleaving of given strings.
The given strings are: WX YZ
The interleaving strings are: YWZX WYZX YWXZ WXYZ YZWX WYXZ
 */
import java.util.ArrayList;
import java.util.List;


public class Q10_String 
{
   public static void main(String[] args) 
   {
	           String str1 = "WX";
	           String str2 = "YZ";
	           List<String> result = new ArrayList<>();
	           findInterleavings("", str1, str2, result);
	           
	           System.out.println("The interleaving strings are: ");
	           for (String s : result) {
	               System.out.println(s);
	           }
	       }

	       public static void findInterleavings(String current, String remaining1, String remaining2, List<String> result) {
	           if (remaining1.isEmpty() && remaining2.isEmpty()) {
	               result.add(current);
	           }

	           if (!remaining1.isEmpty()) {
	               findInterleavings(current + remaining1.charAt(0), remaining1.substring(1), remaining2, result);
	           }

	           if (!remaining2.isEmpty()) {
	               findInterleavings(current + remaining2.charAt(0), remaining1, remaining2.substring(1), result);
	           }
	       }
	   


	   
}

