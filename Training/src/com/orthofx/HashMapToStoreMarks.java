package com.orthofx;
import java.util.*;

public class HashMapToStoreMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> marks = new HashMap<>();
		String name;
		int mark;
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of entries :");
		n = s.nextInt();
		for(int i=0;i<n;++i){
			System.out.println("Enter name: ");
			name = s.next();
			System.out.println("Enter marks: ");
			mark = s.nextInt();
			marks.put(name,mark);
		}
//		System.out.println(marks);
		char ch = 'y';
		while(ch=='y'||ch=='Y') {
			System.out.println("Enter name to search marks: ");
			name = s.next();
			System.out.println("Marks: "+marks.get(name));
			System.out.println("So you want to continue?(y/n) ");
			ch = s.next().charAt(0);
		}
	}

}
