package com.coforge;
import java.util.*;

public class DemoTreeSet {
	public static void main(String[] args) {
		
		TreeSet<Student> studentTree = new TreeSet<Student>();
		
		Student s1 = new Student(123,"swapna", 90);
		Student s2 = new Student(234, "pooja", 79);
		Student s3 = new Student(1231, "swati", 80);
		Student s4 = new Student(2341, "poojsri", 87);
		Student s5 = new Student(2314, "swetha", 76);
		Student s6 = new Student(2134, "prem", 56);
		
		studentTree.add(s1);
		studentTree.add(s2);
		studentTree.add(s3);
		studentTree.add(s4);
		studentTree.add(s5);
		studentTree.add(s6);
		
		studentTree.forEach(s-> System.out.println(s));
		
		System.out.println("-----------------------------------------");
		
		Iterator<Student> itr = studentTree.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		System.out.println("-----------------------------------------");
		
//		Iterator<Student> itr2 = studentTree.descendingIterator();
//		while(itr2.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
		Student s= new Student(230, "anurag", 90);
		System.out.println(studentTree.ceiling(s));
		System.out.println(studentTree.floor(s));
		
	}
}
