package javapackage.com;

import java.util.Scanner;

public class Challenge_27 {
	
	
	public static void display( int[] a )
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		Scanner Sc = new Scanner(System.in);
	    for(int i=0;i<5;i++)
	    {
	    	a[i] = Sc.nextInt();
	    }
	    display(a);
	}

}
