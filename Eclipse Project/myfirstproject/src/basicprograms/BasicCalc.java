package basicprograms;

import java.util.Scanner;


/*Please ask user to add two numbers and calculate  four arithmetic calculations, 
sum, diff ,product, div quotient and remainder 
and print the output */



public class BasicCalc {

	public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please  Enter the first number : ");
		
		int first = input.nextInt();
		
		System.out.println();
		
		
		System.out.print("Please  Enter the second number : ");
		
		int second = input.nextInt();
		
		System.out.println();
		
		int sum = first + second;
		int diff = first - second;
		int prod = first * second;
		int div = first / second;
		int rem = first % second;
		
		
		System.out.println("The sum of " + first + " and " + second + " = " + sum);
		System.out.println("The difference between " + first + " and " + second + " = " + diff);
		System.out.println("The product of " + first + " and " + second + " = " + prod);
		System.out.println("The quotient by dividing " + first + " by " + second + " = " + div);
		System.out.println("The remainder left after dividing " + first + " by " + second + " = " + rem);
		
		

	}

}
