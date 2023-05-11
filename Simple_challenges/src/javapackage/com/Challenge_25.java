package javapackage.com;

public class Challenge_25 {
	
	
	public static void unique()
	{
		int arr[]= {4,2,5,6,7,3,9,8,4,6,2,3,8};

		
		for(int i=0;i<arr.length;i++)
		{
			int dup=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && i!=j)
				{
					dup++;
				}
				
			}
			if(dup==0)
			{
				System.out.println(arr[i]);
				
			}
		}

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		unique();
		
	}

}
