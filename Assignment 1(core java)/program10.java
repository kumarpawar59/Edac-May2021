/*10.	Write a program to convert temperature from Fahrenheit to Celsius.
 Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]*/
import java.util.*;
class program10
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the temp in fahrenheit");
		int f = sc.nextInt();
		int C;
		C= 5*(f-32)/9;
		
		
		System.out.println("Enter the value of celsius : "+C);
	}
}