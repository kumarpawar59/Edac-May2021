/*5.WAP to accept an array and display it in reverse form*/
import java.util.*;
class test6
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
	for(int x:a)
	{	
       System.out.print(x+" ");
	} 
	for(int i=4;i>=0;i--)
	{
		System.out.print(a[i]+" ");
	}	
  }		
}
