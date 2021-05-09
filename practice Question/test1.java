/*1. WAP to accept 2 numbers from Command line argument and perform its addition and display*/
import java.util.*;
class test1
{
  void sum(int x,int y)
  {
	  int z;
	  z= x+y;
	  System.out.println(z);
	   
  }
 
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value");
	int x = sc.nextInt();
	int y = sc.nextInt();
	test1 a = new test1();
    a.sum(x,y);
	
	
  }
}