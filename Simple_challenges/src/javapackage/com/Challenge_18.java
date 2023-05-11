package javapackage.com;
import java.util.*;
public class Challenge_18 extends ArrayList<Integer>
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Challenge_18 c=new Challenge_18();
		for(int i=1;i<=10;i++)
		{
			int value = i*10;
			c.add(value);
		}
		
		System.out.println(c);
		c.removeRange(2, 7);
		System.out.println(c);
		
		
		
	}

}
