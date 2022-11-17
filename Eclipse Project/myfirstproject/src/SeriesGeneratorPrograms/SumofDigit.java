package SeriesGeneratorPrograms;
import java.util.Scanner;

/* User input a number
 * find the sum of the digits
 */
public class SumofDigit {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number : ");
		int x = input.nextInt();
		
		int result = digitsum(x);
		
		System.out.println("In main method, sum of the digits of entered number (" + x + ") is : " + result);

	}  // End of main method

	
	
	/* Write a method to find sum of digit of a given number
	 * 
	 * num = 34765
	 * 
	 * rem  = num % 10
	 * 
	 * num = num/10
	 * 
	 *  execute till num >0
	 * 
	 */
	
	public static int digitsum(int num)
	{
		int sum = 0;
		
			
		do {
			sum = num % 10 + sum;
			num = num/10;
						
		}while(num > 0);   // end of do while block
		
		System.out.println("In digitsum method, sum is : " + sum);
		return sum;		
		
		
	}  // End of digitsum method
	
	
} // End of class
