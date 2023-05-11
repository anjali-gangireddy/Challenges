package javapackage.com;

public class Challenge_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,3,4,7,6,8,0};
		int b[] = {4,6,1,8,9,0};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}

	}

}
