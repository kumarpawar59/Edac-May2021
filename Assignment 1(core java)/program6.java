/*06.	Write a program that takes radius of a circle as input. Read the entered radius using Scanner class. Then calculate and print the area and circumference of the circle.*/
import java.util.*;
class program6
{
	public static void main (String []args)
	{
		double area;
		double c;
	   Scanner sc= new Scanner(System.in);
	   double pi =3.14;
	   int r =sc.nextInt();
	   area=pi * (r*r);
	   c=2*pi*r;
	   System.out.println("area of the cicle"+area);
	   System.out.println("circumstance of the circle"+c);

	}
}