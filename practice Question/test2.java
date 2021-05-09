/*WAP to swap 2 numbers and display it before swap and after swap.*/
import java.util.*;
class test2
{
  public static void main(String[]args)
  {
	 int temp;
    Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int y = sc.nextInt();
	System.out.println("before swapping");
	System.out.println(x+ " " +y );
	System.out.println("after swapping");
	temp=x;
	x=y;
	y=temp;
	System.out.println(x+ " " +y );
  }
}