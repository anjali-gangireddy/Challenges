package javapackage.com;

import java.util.Scanner;

public class Challenge_39 {
	
	private static boolean flase;
	public static char[] toCharArray(String s)
	{
		char[] c=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			c[i] = s.charAt(i);
		}
		return c;
	}
	public static char[] sort(char[] c)
	{
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++) 
			{
				if(c[i]>c[j])
				{
					char temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
				
		}
		return c;
	}
	public static boolean equals(char[]c1,char[] c2)
	{
		boolean flag=false;
		for(int i=0;i<c1.length;i++)
		{
			for(int j=0;j<c1.length;j++)
			{
				if(c1[i]==c2[j]||c1[i]==(char)(c2[j]+32)||c1[i]==(char)(c2[j]-32))
				{
				flag = true;
				}
				else
				{
					break;
				}
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		
		if(s1.length()!=s2.length())
		{
			System.out.println("IT IS NOT ANAGRAM");
		}
		else
		{
			char c1[] = s1.toCharArray();
			char c2[] = s2.toCharArray();
			sort(c1);
			sort(c2);
			if(equals(c1,c2))
				System.out.println("it is an anagram");
			else
				System.out.println("not anagram");

		}

	}

}
