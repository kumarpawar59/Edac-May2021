/*11.	Write a program to swap two numbers without using third variable.*/
import java.util.*;
class program11
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println(" Before swap the value");
		int a = sc.nextInt();
		int b = sc.nextInt();
		a= a+b;//10+20
		b=a-b;//30-10=20
		a=a-b;//30-20
		
		System.out.println("After swap Enter the value");
		System.out.println(" "+a+" "+b);


	}
}