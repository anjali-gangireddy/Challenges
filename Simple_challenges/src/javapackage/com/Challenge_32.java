package javapackage.com;

public class Challenge_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {45,2,54,23,65,78,3,8};
		
		for(int i=0;i<arr.length;i++)
		{
			int count=0;

			for(int j=1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
						count++;
						break;
				}
			}
		
		if(count==0)
		{
			
			System.out.println(arr[i] +"is leaderships");
			continue;
		}
		}
	}

}
