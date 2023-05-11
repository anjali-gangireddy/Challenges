package javapackage.com;

import java.util.Scanner;

public class Challenge_38 {


public static String tolowercase(String S)
{
	String S1 ="";
		for(int i=0;i<=S.length()-1;i++)
		{
			char c = S.charAt(i);
			if(c>='A' && c<='Z')
			{
				int x=(int) c;
				x=x+32;
				char c1 =(char) x;
				S1=S1+c1;
			}
			else
			{
				S1=S1+c;
			}

		}
		return S1;
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner Sc=new Scanner(System.in);
	String S=Sc.nextLine();
	System.out.println(tolowercase(S));
	}

}
