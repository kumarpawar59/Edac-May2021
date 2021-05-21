/*04.	Write a program that initializes 2 byte type of variables. Add the values of these variables and store in a byte
 type of variable. [Note: primitive down casting is required in this program ] .*/


import java.util.*;
class program4
{
	public static void main (String[]args)
	{
	   number();
	}
	static void number()
	{
		Scanner sc = new Scanner (System.in);
		short i = sc.nextShort();
		byte j =(byte)i;
		System.out.println(j);
	}
}