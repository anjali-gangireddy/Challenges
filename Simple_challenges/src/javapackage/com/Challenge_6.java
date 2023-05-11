package javapackage.com;

public class Challenge_6 {
	
	static 
	{
		System.out.println("static block will be exicute only once befroe the main metod will start the exicute");
	}
	
	{
		System.out.println("non static block will be exicute at the time of object creation based on no of object creation");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Challenge_6 S = new Challenge_6();
		Challenge_6 S1 = new Challenge_6();
		

	}

}
