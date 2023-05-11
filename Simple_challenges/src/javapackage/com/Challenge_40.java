package javapackage.com;

import java.util.Scanner;

public class Challenge_40 {
	
	public static void reverse(String s)
	{
		String[] s1=s.split(" ");
		
		
		for(int i=0;i<s1.length-1;i++)
		{
			String rev="";
			for(int j=s1[i].length()-1;j>=0;j--)
			{
				rev+=s1[i].charAt(j);
			}
			s1[i]=rev;
		}
		
		
		for(String x:s1)
		{
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String s=Sc.nextLine();
		reverse(s);
		}

}

