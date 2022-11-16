package SeriesGeneratorPrograms;

import java.util.Scanner;

public class PrimeNumberGen {

	public static void main(String[] args) {
		/* User input a number
		 * Check if it is prime number
		 * write a seperate method primeTest
		 */
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your number: ");
		
		int x = input.nextInt();
		
		primeTest(x);
		
		
	} //End of main method

	
	public static void primeTest(int num) {
		
		/* num = 7
		 * 
		 * i = 0; i <= 7; i++
		 * 
		 * rem = 7%i 
		 * 
		 * if rem = 0 , number is not prime
		 * 
		 */
		int rem = 0;
		
		if (num == 0 || num == 1)
		{
			System.out.println("The entered num is not a Prime number");
		}   //End of if condition
		
		else if( num == 2)
		{
			System.out.println("The entered num is a Prime number");
		}  //End of elseif condition
		else {
		
		
		for(int i = 2; i < num; i++)
		{
			rem = num % i;
			
			if(rem == 0)
			{
				System.out.println("The entered num is not a Prime number");
				
				i = num;
			} //End of if condition
			
			
		}// End of for loop
		
		if(rem != 0)
		{
			System.out.println("The entered num is a Prime number");
		} // End of if condition
				
		}	//End of else condition
		
	} //End of primeTest method
}  //End of Class
