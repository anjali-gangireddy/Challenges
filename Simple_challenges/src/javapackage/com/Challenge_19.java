package javapackage.com;

public class Challenge_19 {
	static Challenge_19 c;
	static
	{
		 c = new Challenge_19();
		c.fun();
	}
	
	void fun()
	{
		System.out.println("Fun.....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		c.fun();

	}

}
