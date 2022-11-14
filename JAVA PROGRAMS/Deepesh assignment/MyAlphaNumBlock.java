/* Print output block 

642013
FEDCBA
642013
FEDCBA
642013
FEDCBA

*/


class MyAlphaNumBlock

{

	static void MyPrintLine()
	{
	int i;
	char c;

		for(i = 6; i >= 0; i = i-2)
		{
		System.out.print(i);
		}
	
		for(i = 1; i <= 3; i = i + 2)
		{
		System.out.print(i);
		}

		System.out.println();
		
		for(c = 'F'; c>= 'A'; c--)
		{
		System.out.print(c);
		}
		System.out.println();

		
	}


	public static void main(String[] args)
	{
		
		
		System.out.println();

		for(int i = 1; i <= 3; i++)
		{
	
			MyPrintLine();
		}

		System.out.println();
		System.out.println();

		System.out.println("I am done");

		System.out.println();
		System.out.println();
	}

}