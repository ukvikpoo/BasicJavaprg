package SeriesGeneratorPrograms;
import java.util.Scanner;

/* User input a number
 * Check if it is a Strong number
 * 
 * Strong num : abc = a! + b! + c!
 */

public class StrongNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number to check if it is Strong number: ");
		int x = input.nextInt();
		
		boolean check = strongnum(x);
		
		if(check == true)
		{
			System.out.println("Yes..!..The number(" + x + ") is a strong number.");
		} //End of if condition
		else
		{
			System.out.println("Sorry..!..The number(" + x + ") is not a strong number.");
		} // End of else condition
				

	} // end of main method
	
	/* Write a method to check if the number is strong number
	 * e.g = 3456
	 */
	
	public static boolean strongnum(int num)
	{
		int rem = 0;
		int fact= 1;
		int factsum = 0;
		int temp = num;
		boolean test = false;
		
	//	System.out.println("Test msg 1 : the value of num = " + num);
		
		do
		{
			rem = temp % 10;
			temp = temp/10;
			for(int i = rem; i > 0; i--)
			{
				fact = fact * i;				
				
			} // End of for loop
			
		//	System.out.println("Test msg 2 : the value of  i and fact = " + fact);
			factsum = fact + factsum;
			fact = 1;
			
		}while(temp > 0); //End of do while block
		
	//	System.out.println("Test msg 3 : the value of factsum = " + factsum);
		
		if(factsum == num)
		{
			test = true;
			
		} // End of If block
		
	//	System.out.println("Test msg 4 : the value of test = " + test);
				
		return test;
		
		
	} // End of strongnum method

} // End of class
