package javapackage.com;

public class Challenge_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		
		int [] arr = {5,3,1,7,2,9,6,18,12,8};
		
		int large = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>large)
			{
				large = arr[i];			}
	}
		System.out.println(large);

	}

}
