package javapackage.com;

class Sample
{
	void display()
	{
		System.out.println("parent class");
	}
}

class Test extends Sample
{
	void demo()
	{
		System.out.println("child class");
	}
}
public class challenge_12 {

	public static void main(String[] args)
	{
		Test C = new Test();
		C.demo();
		C.display();
	}
}
