package javapackage.com;

import java.util.Scanner;

public class Challenge_36 {
	
	public static void palindrom(String S)
	{
		boolean flag = true;
		for(int i=0;i<S.length()/2;i++)
		{
			if(S.charAt(i)!=S.charAt(S.length()-1-i))
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("string is palindrom");
		}
		else
		{
			System.out.println("string is not palindrom");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String S =sc.nextLine();
		palindrom(S);
		
	}

}
