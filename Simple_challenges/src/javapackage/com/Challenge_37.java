package javapackage.com;

import java.util.Random;

public class Challenge_37  
	{   
	 public static void main(String[] args) {
		 Random r =new Random();
			String s="abcde12345ABCDE@$%*&";
			String S1="";
			for(int i=0;i<5;i++)
			{
				int R=r.nextInt(s.length());
				S1=S1+s.charAt(R);
			}
			System.out.println(S1);
	  }
	}
	

