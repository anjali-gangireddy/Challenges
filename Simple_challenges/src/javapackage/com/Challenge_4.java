package javapackage.com;

import java.util.Random;

public class Challenge_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random r = new Random();
		int count = 0;
		
		for(int i=1;i<=i+1;i++)
		{
			int x = r.nextInt(200);
			if(x>=100 && x<=200)
			{
			System.out.println(x);
			count++;
			}
			if(count==20)
			{
				break;
			}
		}
	}

}
