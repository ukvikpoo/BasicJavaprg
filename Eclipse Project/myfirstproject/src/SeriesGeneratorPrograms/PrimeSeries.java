package SeriesGeneratorPrograms;

import java.util.Scanner;

/* Write a code to generate  first n prime numbers
 * user input the value of n
 */

public class PrimeSeries {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Print all prime numbers upto : ");
		int max = input.nextInt();
		
		for (int j = 1; j <= max; j++)
		{
			primeTest(j);
			
			
		} //End of for loop
	}  //End of main
	
	/* Write a method to test if the number is Prime or not
	 * Print the number if prime
	 */
	
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
			// do nothing as in this block, number is not a prime
			//System.out.println("The entered num is not a Prime number");
		}   //End of if condition
		
		else if( num == 2)
		{
			System.out.print(num + " ");
			//System.out.println("The entered num is a Prime number");
		}  //End of elseif condition
		else {
		
		
		for(int i = 2; i < num; i++)
		{
			rem = num % i;
			
			if(rem == 0)
			{
				// do nothing as in this block, number is not a prime
				
				//System.out.println("The entered num is not a Prime number");
				
				i = num;
			} //End of if condition
			
			
		}// End of for loop
		
		if(rem != 0)
		{
			System.out.print(num + " ");
		   //System.out.println("The entered num is a Prime number");
		} // End of if condition
				
		}	//End of else condition
		
	} //End of primeTest method

}  //End of class
