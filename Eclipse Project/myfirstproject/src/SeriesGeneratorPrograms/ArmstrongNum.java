package SeriesGeneratorPrograms;

import java.util.Scanner;

/* User input a 3 digit number 
 * Test if it is Armstrong number
 * 
 * Armstrong number : abc = a^3 + b^3 + c^3
 */

public class ArmstrongNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number to check if it is an Armstrong num : ");
		int x = input.nextInt();
		boolean check = armstrong(x);
		
		if(check == true)
		{
			System.out.println("The number " + x + " is an Armstrong number");
		} //End of if condition
		else
		{
			System.out.println("The number " + x + " is not an Armstrong number");
		} // End of else condition
	} //End of main

	
	/* Write a method to test if a 3 digit number is an Armstrong
	 * 
	 */
	
	public static boolean armstrong(int num)
	{
		int temp = num;
		int rem = 0;
		int cubesum = 0;
		boolean test = false;
		
		do
		{
			rem = temp%10;
			cubesum = (rem * rem * rem) + cubesum;
			temp = temp/10;
								
		}while(temp > 0); //End of do while block
		
		if(cubesum == num)
		{
		test = true;
		} // end of if condition
		
		return test;
		
				
	}  //End of armstrong method
} //End of class
