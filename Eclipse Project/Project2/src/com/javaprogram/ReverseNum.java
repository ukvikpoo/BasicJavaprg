package com.javaprogram;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		/* User input a number
		 * Print it in reverse order
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number to reverse print: ");
		int num = input.nextInt();
		
		int temp;
		int result = 0;
		/* 
		 * num = 47623
		 * temp = num % 10 = 47623%10 = 3         (num, temp, result) (47623, 3, 3)
		 * result = temp + result * 10
		 * 
		 * num = num/10 = 47623/10 = 4762;        (num, temp, result) (4762, 2, 32)
		 * 		 
		 */
		
		do
		{
			temp = num%10;
			result = temp + result * 10;
			num = num/10;
		}
		while(num >= 1);
			
			System.out.println("The reverse of the given number is : "+ result);
		
		
	}

}
