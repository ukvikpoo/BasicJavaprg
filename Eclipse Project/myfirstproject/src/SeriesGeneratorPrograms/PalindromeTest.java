package SeriesGeneratorPrograms;
import java.util.Scanner;

public class PalindromeTest {

	/* Write a method to reverse the number
	 * User input a number
	 * Method will return the reverse 
	 */
	
	public static int returnReverse(int num)
	{
	
		int rem;
		int rev = 0;
	
		/*
		 * num = 3456
		 * rem = num%10;
		 * rev = 0
		 * 		 * 
		 * rev = rev * 10 + rem
		 * num = num/10
		 * 
		 * i = 1 [ (num, rem, rev)  (3456, 6, 6)
		 * i = 2 [ (num, rem, rev)  (345, 5, 65)
		 */
		
		do {
			rem = num%10;
			rev = rev * 10 + rem;
			num = num/10;
	
			}while(num>=1);   // End of Loop
		
		//System.out.print("Print reverse number in method : " + rev);
		
		return rev;
	
	}  //End of returnReverse method
	
	
	//Main Method
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number you want to reverse: ");
		int x = input.nextInt();
		
				
		int reverse = returnReverse(x);
		
		System.out.println("The reverse of the entered number (printed in main)is : " + reverse);
		
		System.out.println("Let's check if the entered number is palindrome");
		
		System.out.println();
		if(x == reverse)
		{ 
			System.out.println("Hooray..!!.. Your entered number is a Palindrome number.");
		}  //End of if block
			
		else
		{ 
			System.out.println("Sorry..!. The number you have entered is not a Palindrome number.");
		}   //End of else block
				
	}  //End of main method

}  //End of class
