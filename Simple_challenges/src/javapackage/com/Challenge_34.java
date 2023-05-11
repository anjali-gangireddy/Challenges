package javapackage.com;

public class Challenge_34 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		int a[] = {10,20,30,40,50};
		int b[] = {20,40,50,60,70};
		
		
		for(int i:a)
		{
			for(int j:b)
			{
				if(i==j)
				{
					System.out.println(i+" "+j);
				}
			}
		}
	}

}
