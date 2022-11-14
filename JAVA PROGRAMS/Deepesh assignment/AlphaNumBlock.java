/*Print output : 

ABCDEF
12345
ABCDEF
12345
ABCDEF
12345

*/


class AlphaNumBlock
{

		static void PrintAlpha()
		{
		
			char c;
			int i;
	
				for(c = 'A'; c <= 'F' ; c++)
				{
		
					System.out.print(c);
				}

					System.out.println();

				for(i = 1; i <= 5; i++)
				{
					System.out.print(i);
				} 
					System.out.println();


		}


		public static void main(String[] args)
		{
		
			for(int i = 1; i <= 4 ; i++)
			{			

				PrintAlpha();
		
			}
		}



}