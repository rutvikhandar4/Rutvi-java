package AssigmentString;

/*
 W.A.J.P to find the second most frequent character in a given string. The given string. The given string is: successes The second most frequent
  char in the string is: c
 
 */
import java.util.HashMap;
import java.util.Map;
public class Q11_String 
{
  public static void main(String[] args) 
  {
	 
	

	
	          String input = "successes";
	          char secondMostFreq = findSecondMostFrequentChar(input);
	          
	          System.out.println("The second most frequent character in the string is: " + secondMostFreq);
	      }

	      public static char findSecondMostFrequentChar(String input) {
	          Map<Character, Integer> charCount = new HashMap<>();
	          
	          for (char c : input.toCharArray()) {
	              charCount.put(c, charCount.getOrDefault(c, 0) + 1);
	          }

	          char mostFreqChar = ' ';
	          int mostFreqCount = 0;
	          char secondMostFreqChar = ' ';
	          int secondMostFreqCount = 0;

	          for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
	              if (entry.getValue() > mostFreqCount) {
	                  secondMostFreqCount = mostFreqCount;
	                  secondMostFreqChar = mostFreqChar;
	                  mostFreqCount = entry.getValue();
	                  mostFreqChar = entry.getKey();
	              } else if (entry.getValue() > secondMostFreqCount && entry.getValue() != mostFreqCount) {
	                  secondMostFreqCount = entry.getValue();
	                  secondMostFreqChar = entry.getKey();
	              }
	          }

	          return secondMostFreqChar;
	      }
	  }



   
