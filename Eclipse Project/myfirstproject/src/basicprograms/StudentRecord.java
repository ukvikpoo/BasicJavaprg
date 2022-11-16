package basicprograms;
import java.util.Scanner;

/* Ask a student to enter following:
 * First name, Last name, age, School name, School year, City
 * Print the output
 */

public class StudentRecord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your First name : ");
		String first = input.next();
		System.out.println();
		
		System.out.print("Please enter your Last name : ");
		String last = input.next();
		System.out.println();
		
		System.out.print("Please enter your Age : ");
		short age= input.nextShort();
		System.out.println();
		
		System.out.print("Please enter your School name : ");
		String school = input.next();
		System.out.println();
		
		System.out.print("Please enter your school year : ");
		int year= input.nextInt();
		System.out.println();
		
		System.out.print("Please enter your City name : ");
		String city = input.next();
		System.out.println();
		
		
		if(city.equals("leeds"))
		{
			System.out.println("Name : " + first + " " + last);
			System.out.println("Age : " + age);
			System.out.println("School year : " + year);
			System.out.println("School Name : " + school);
			System.out.println("City Name : " + city);
		}
		else
		{ 
			System.out.println("Out of catchment Student");
		}
	}

}
