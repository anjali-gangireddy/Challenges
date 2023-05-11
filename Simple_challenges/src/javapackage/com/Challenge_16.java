package javapackage.com;


class Parent
{
	void test()
	{
		System.out.println("parent class");
	}
}
class Child extends Parent
{
	void tesst()
	{
		super.test();
		System.out.println("child class");
	}
}
public class Challenge_16  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Child c1 =new Child();
		c1.tesst();
		
	}

}
