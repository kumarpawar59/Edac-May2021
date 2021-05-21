/*13.	Program to find greatest in 3 numbers. [ once using if else statement and then using 
ternary operator ( logical operator) ]  */
import java.util.*;
class program13
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the values ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if ( a > b   &&  a > c )
		{
			System.out.println("greater number is "+a);
		}
		else if(b>c && b>a)
			{
			System.out.println("greater number is "+b);
		}
		else 
			{
			System.out.println("greater number is "+c);
		}
		
		
	}
}