package AssigmentException;

/*
 W.A.J.P to create a class Student with attributes roll no, name, age and course.
Initialize values through parameterized constructor. If age of student is not in
between 15 and 21 then generate user defined exception
"AgeNotWithinRangeException". If name contains numbers or special symbols
raise exception "NameNotValidException". Define the two exception classes.
 */

	   
	   class AgeNotWithinRangeException extends Exception {
	       public AgeNotWithinRangeException(String message) {
	           super(message);
	       }
	   }

	   class NameNotValidException extends Exception {
	       public NameNotValidException(String message) {
	           super(message);
	       }
	   }

	   class Student {
	       private int rollNo;
	       private String name;
	       private int age;
	       private String course;

	       public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
	           if (age < 15 || age > 21) {
	               throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
	           }

	           if (!name.matches("^[a-zA-Z ]+$")) {
	               throw new NameNotValidException("Name should not contain numbers or special symbols.");
	           }

	           this.rollNo = rollNo;
	           this.name = name;
	           this.age = age;
	           this.course = course;
	       }
	   }

	   public class Q8_Exception {
	       public static void main(String[] args) {
	           try {
	               Student student1 = new Student(1, "John Doe", 18, "Science");
	               // Student student2 = new Student(2, "Alice123", 20, "Math"); // This will raise NameNotValidException
	               // Student student3 = new Student(3, "Bob", 14, "History"); // This will raise AgeNotWithinRangeException
	           } catch (AgeNotWithinRangeException | NameNotValidException e) {
	               System.out.println(e.getMessage());
	           }
	       }
	   }

	   
	   
