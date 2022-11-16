package myfirstproject;

import java.util.Scanner;

public class FactorialGen {

	public static void main(String[] args) {
		/* User input a number
		 * Find the factorial of the number
		 * 
		 * 5! = 5 * 4 * 3 * 2 * 1
		 * 
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please find the factorial of:");
		int num = input.nextInt();
		
		int fact = 1;
		
		/* 
		 * before loop -- (fact, num)(1, 5)
		 * i = 5 --- (fact, i)(1, 5)
		 * i = 4 --- (fact, i)(5, 4)
		 * 
		 */
		
		
		//code with for loop
		
		/*for(int i = num; i >= 1; i--)
		{
			fact = i * fact;
			
		}*/
		
		
		
		//code with while loop
		
		int i = num;
		while(i >= 1)
		{
			fact = fact * i;
			i--;
		}
		
		
		System.out.println("The factorial of " + num + " is " + fact);

	}

}
