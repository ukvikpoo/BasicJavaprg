package SeriesGeneratorPrograms;

import java.util.Scanner;

public class BasicNumberSeries {

	public static void main(String[] args) {
		/* Generate a number series.
		 * User input first number
		 * User input second number
		 * Rule is nth term is sum of two prev numbers
		 * User input no. of term to generate
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the First term : ");
		int first = input.nextInt();
		System.out.println();
		
		System.out.print("Please enter the Second term : ");
		int second = input.nextInt();
		System.out.println();
		
		System.out.print("Please enter the number of next terms: ");
		int n = input.nextInt();
		System.out.println();
		
		int term;
		//term = first + second;
		
		System.out.println("The series will be generated as follows :");
		
		//System.out.println(first + " " + second + " " + term);
		
		System.out.print(first + " " + second + " " );
		
		
		/* n : 1 -- (f, s ,t)(5, 8, 13)
		 * n : 2 -- (f, s ,t)(8, 13, 21)		 
		 */
		
		for(int i = 1; i<=n; i++)
		{
		term = first + second;
		System.out.print(term + " ");
		first = second;
		second = term;

	}

}
}

