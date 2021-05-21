/*15.	Accept person’s gender (character m for male and f for female), age (integer), as input
 and then check whether person is eligible for marriage or not.*/
import java.util.*;
class program15
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the age for male and female ");
		int m = sc.nextInt();
		int f = sc.nextInt();
		
		if ( m>=21 )
		{
			System.out.println("he is elligible for marriage");
		}
		else
		{
			System.out.println("he is not elligible for marriage");
		}	
		if ( f>=18 )
		{
			System.out.println("she is elligible for marriage");
		}
		else
		{
			System.out.println("she is not elligible for marriage");
		}
	}
}
