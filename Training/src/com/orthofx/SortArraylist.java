package com.orthofx;
import java.util.*;
public class SortArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name = new ArrayList<String>();
		System.out.println("Enter number of entries:");
		int n;
		String str;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		System.out.println("Enter names :");
		for(int i=0;i<n;++i) {
			str = s.next();
			name.add(str);
		}
		System.out.println("The sorted list : ");
		Collections.sort(name);
		System.out.println(name);
	}

}
