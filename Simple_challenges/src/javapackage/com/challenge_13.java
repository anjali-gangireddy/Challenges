package javapackage.com;



public class challenge_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a =Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int x= a+b;
			System.out.println(x);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("enter two argumengts");
		}
		
	}

}
