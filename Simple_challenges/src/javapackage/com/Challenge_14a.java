package javapackage.com;

public class Challenge_14a {
	
	private int pin = 516;
	private Challenge_14a()
	{
		System.out.println("private constractor");
	}
	  
	private static void test()
	{
		System.out.println("private method");
	}
	
	
	public static void main(String[] args)
	{
		Challenge_14a ob =new Challenge_14a();
		System.out.println(ob.pin);
		ob.test();
	}
}
