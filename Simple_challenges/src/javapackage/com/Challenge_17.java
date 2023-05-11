package javapackage.com;


class Latha
{
	String a;
	Latha(String a)
	{
		this.a =a;
		System.out.println(a);
	}
}
 class Anjali extends Latha
{
	int b;
	Anjali(int b)
	{
		super("anjali");
		this.b=b;
		System.out.println(b);
	}
	
	

}

public class Challenge_17  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Anjali c1 ;
		c1=new Anjali(5);
		

	}

}
