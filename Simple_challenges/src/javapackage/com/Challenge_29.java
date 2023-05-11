package javapackage.com;

public class Challenge_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,0,2,0,6,0,2,0,0,0,6,1,0,0,0,0,0,0,5,4,8,0};
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=arr.length-1;j>1;j--)
			{
				if(i<j && arr[i]==0 &&arr[j]!=0)
				{
					int temp =arr[i];
					arr[i] =arr[j];
					arr[j] =temp;
				}
			}
		}
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}

}
