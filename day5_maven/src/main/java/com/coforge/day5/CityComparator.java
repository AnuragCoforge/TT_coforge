package com.coforge.day5;
import java.util.*;

public class CityComparator implements Comparator<Customer>{
	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.getCustName().compareTo(o2.getCustName());
	}
	
}
