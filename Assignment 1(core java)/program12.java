/* 12.	In a company an employee is paid as under: If his basic salary is less 
than Rs. 10000, then HRA = 10% of basic salary and DA = 90% of basic salary. 
If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and 
DA = 98% of basic salary. If the employee's salary is input by the user write 
a program to find his gross salary. [ formula : GS= Basic + DA + HRA ] 
HRA-house rent allince. DA-Dearness Allowance*/

import java.util.*;
class program12
{
	public static void main(String args[])
	{
		Scanner a=new Scanner(System.in);
		System.out.print("Enter Employee  Basic Salary = ");
		double B_Salary=a.nextInt();
		double DA=0,HRA=0,G_Salary=0;
		if(B_Salary<1000)
		{
			HRA=(B_Salary * 10)/100;
			DA=(B_Salary * 90)/100;
			G_Salary=B_Salary+HRA+DA;
		
			System.out.println("Employee Gross Salary = "+ G_Salary);
		}
		else
			{
			HRA=2000;
			DA=(B_Salary * 98)/100;
			G_Salary=B_Salary+HRA+DA;
		
			System.out.println("Employee Gross Salary = "+ G_Salary);
		}
		
		
	}
}
		