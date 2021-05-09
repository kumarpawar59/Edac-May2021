/*5.WAP to accept an array and display it in reverse form*/
import java.util.*;
class test4
{
  public static void main(String[]args)
  {
	
    Scanner sc = new Scanner(System.in);
	int a []=new int[5];
	System.out.println("Enter the number in forword direction");
	for(int i=0;i<=4;i++)
	{
		a[i]= sc.nextInt();		
    }
       System.out.print(a[i]);
  }		
}

/*System.out.println("Enter the number in reverse direction");
	for(int i=a.length-1;i<0;i--)
	{
		a[i]= sc.nextInt();
	}
	System.out.print(a[i]);*/