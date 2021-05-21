/*05.	Write a program that takes user’s name as command line argument and prints Welcome <entered user name>.*/
import java.lang.*;
import java.io.*;
import java.util.*;

public class program5 {

	public static void main(String[] args) {

		String name =System.console().readLine();
	    System.out.println("Welcome "+name);
	}	
	}
