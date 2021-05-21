
/*07.	Write a program to calculate sum of 5 subject’s marks & find percentage. Take the obtained marks from user
 using Scanner class. Output should be in this format [ percentage marks = 99 % ]. Use concatenation operator here.*/
import java.util.*;
class program7
{
	public static void main (String[]args)
	{
	   number();
	}
	static void number()

	{
		System.out.println("each subject have 100 marks");
	    float sum=0;
		Scanner sc = new Scanner (System.in);
		int [] arr =new int [5];
		for (int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];	
	    }
	    System.out.println("sum ="+sum);
	    System.out.println("  marks are each subject are");
	    for (int x:arr)
	    {
	    	System.out.println(x);
	    }
	    System.out.println();
	    float per = (sum/500)*100;
	    System.out.println("percentage = "+per);

	    
	}

}