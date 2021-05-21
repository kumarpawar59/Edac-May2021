/*14.	Program to check that entered year is a leap year or not.*/
import java.util.*;
class program14
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the year ");
		int year = sc.nextInt();
		
		if ( year%4==0 )
		{
			System.out.println("this is leap year");
		}
		else 
		{
			System.out.println("this is not leap year");
		}	
	}
}
