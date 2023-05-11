package javapackage.com;

public class Challenge_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4,5,7,8};
		int b[] = {5,3,2,4,6,1,7,8};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					count++;
				}
			}
		
		}
		if(count>=a.length)
		{
			System.out.println("array is same");
		}
		else
		{
			System.out.println("array is not same");
		}
	}

}
