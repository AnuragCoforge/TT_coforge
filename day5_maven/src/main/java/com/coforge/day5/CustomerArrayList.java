package com.coforge.day5;
import java.util.*;
public class CustomerArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer(1, "a", 10000);
		Customer c2 = new Customer(2, "b", 20000);
		Customer c3 = new Customer(3, "b", 30000);
		Customer c4 = new Customer(4, "b", 12000);
		Customer c5 = new Customer(5, "a", 5000);
		Customer c6 = new Customer(6, "a", 32000);
		
		ArrayList<Customer> custList = new ArrayList<Customer>();
		custList.add(c1);
		custList.add(c2);
		custList.add(c3);
		custList.add(c4);
		custList.add(c5);
		custList.add(c6);
		
//		Collections.sort(custList); //natural sorting is possible in wrapper classes otherwise comparator need to be created
		System.out.println(custList);
		
		
		custList.sort(new CityComparator());
		
		System.out.println(custList);

		
	}

}
