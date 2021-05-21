/*08.	Write a program to find the simple interest. Take the principle amount, rate of interest and time from user using Scanner class.*/
import java.util.*;
class BankOffer
{   
	void show(int amount,int rate,float time)
	{
		float si =(amount*rate*time)/100;
		System.out.println(si);
	}
	
}
class program8
{
	public static void main(String[]args)
	{
		Scanner sc =new Scanner (System.in);
	    int amount=sc.nextInt();
	     int rate= sc.nextInt();
	      float time=sc.nextFloat();
	 	BankOffer simple =new BankOffer();
		simple.show(amount,rate,time);
		
	}
}