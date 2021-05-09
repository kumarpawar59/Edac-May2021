/*WAP to check whether a number given is even or odd*/
import java.util.*;
class test3
{
  public static void main(String[]args)
  {
	
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int x = sc.nextInt();
	if(x%2==0)
	System.out.println("This number are even");
    else
    System.out.println("This number are odd");
  }
}