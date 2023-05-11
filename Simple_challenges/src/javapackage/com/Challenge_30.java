package javapackage.com;

public class Challenge_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,7,2,2,8,7,9,3,5,6};
		int k=arr.length;
		
		for(int i=0;i<k;i++)
		{
			
			for(int j=i+1;j<k;j++)
			{
				if(arr[i]==arr[j])
				{
					int temp =arr[j];
					arr[j] =arr[k-1];
					arr[k-1]=temp;
					k--;
				}
			}
		}
	
		for(int i=0;i<k;i++) {
			System.out.print(arr[i]+",");
		}

	}

}
