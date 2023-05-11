package javapackage.com;

public class Challenge_2 {
	
	Challenge_2()
	{
		this(10);
	System.out.println("default constructor");	
	}
	Challenge_2(int i)
	{
		this(10,'a');

		System.out.println("int type constructor");
	}
	Challenge_2(int i,char c)
	{
		this(10,"anjali");

		System.out.println("int and char type constructor");
	}
	Challenge_2(int i,String s)
	{
		System.out.println("int and string type constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Challenge_2 C = new Challenge_2();
	}

}
