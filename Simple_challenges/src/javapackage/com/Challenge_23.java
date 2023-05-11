package javapackage.com;

public class Challenge_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,4,2,6,3,7,8,9,5};
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==10)
				{
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}

}
