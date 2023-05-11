package javapackage.com;

public class Challenge_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="anjali";
		String str2 ="anjali";
		
		//System.out.println(str1==str2);
		//System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		str2 =str2.concat("krishna");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		//System.out.println(str1==str2);
		//System.out.println(str1.equals(str2));
				



	}

}
