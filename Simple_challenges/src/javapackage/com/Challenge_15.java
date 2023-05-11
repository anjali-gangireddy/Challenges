package javapackage.com;

class Amazonmusic
{
	public  void music()
	{
		System.out.println("music with adds");
	}
}

class Amazonmusic2 extends Amazonmusic
{
	@Override
	public  void music()
	{
		System.out.println("music without adds");
	}
}

public class Challenge_15 {
	
	public static void main(String args[])
	{
		Amazonmusic2  a= new Amazonmusic2();
		a.music();
	}

}
