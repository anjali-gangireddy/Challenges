package javapackage.com;

import java.util.Scanner;

public class Challenge_7 {
	
	
	public static int parseInt(String s,String t)
	{
		
	int a = Integer.parseInt(s);
	int b =Integer.parseInt(t);
	int c =a+b;
	return c;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		String s = Sc.next();
		String t = Sc.next();
		try
		{
			System.out.println(parseInt (s,t));
		}
		catch(NumberFormatException e)
		{
			System.out.println("raised exception,enter the number");
		}
		
		
	}

}
