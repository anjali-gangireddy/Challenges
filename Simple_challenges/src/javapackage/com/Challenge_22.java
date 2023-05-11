package javapackage.com;

public class Challenge_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10,20,30,40,50,60,70};
		
		int i=0;
		int j=arr.length-1;
		int temp;
		
		while(i<j)
		{
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		for(int k=0;k<arr.length;k++)
		{	
		
		System.out.print(arr[k]+" ");
		}
	}

}
