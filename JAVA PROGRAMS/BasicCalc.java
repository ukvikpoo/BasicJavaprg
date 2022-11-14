class BasicCalc
{
public static void main(String[] args)
{

// This is a basic calculator program to find sum, difference, product and division of two numbers.

int x;   // this is our first number

x = 424;

int y;  // this is our second number

y = 12;

int sum;

int diff;

int prod;

int quot;

int rem;

sum = x + y;

diff = x - y;

prod = x*y;

quot = x/y;  // this will give only quotient

rem = x%y; // this will give remainder


System.out.println("x = " + x);
System.out.println("y = " + y);

System.out.println("Sum = x + y = " + sum);
System.out.println("Diff = x - y = " + diff);
System.out.println("Prod = x * y = " + prod);
System.out.println("Quotient = x/y = " + quot);
System.out.println("Remainder = x/y = " + rem);

}
}