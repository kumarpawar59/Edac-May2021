import java.util.*;
class program9
{
public static void main(String args[])
    {
        int m, year, month, day;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of days:");
        m = s.nextInt();
        year = m / 365;
        m = m % 365;
        System.out.println("No. of years:"+year);
        month = m / 30;
        m = m % 30;
        System.out.println("No. of month:"+month);
        day = m;
        System.out.println("No. of days:"+day);
	}
}