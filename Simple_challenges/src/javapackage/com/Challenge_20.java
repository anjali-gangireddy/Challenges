package javapackage.com;
import java.util.*;

public class Challenge_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al =new ArrayList<Integer>();
		al.add(10);
		al.add(2);
		al.add(20);
		al.add(2);
		al.add(30);
		al.add(2);
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		al.remove(al.size()-1);
		System.out.println(al);

	}

}
