package javapackage.com;

import java.util.Scanner;

public class Challenge_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] =new int[10];
		Scanner Sc = new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			arr[i]=Sc.nextInt();
		}
		//for(int i=0;i<arr.length;i++)
		//{
		//System.out.print(arr[i]);
		//}
		int count = 0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					break;
				}
			}
		}
		if(count>=1)
		{
			System.out.println("given array is  duplicate");
		}
		else
		{
			System.out.println("given array is not duplicate");
		}

	}

}
