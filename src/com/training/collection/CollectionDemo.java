package com.training.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("Ahmed");
		names.add("Hassan");
		names.add("Ali");
		names.add("Fatimah");
		names.add("Ali");
		
		for(String name:names) {
			
			System.out.println(name);
		}
		
		Set<String> namesSet = new TreeSet<>();
		namesSet.add(new String("Ahmed"));
		namesSet.add(new String("Hassan"));
		namesSet.add(new String("Ali"));
		namesSet.add(new String("Fatimah"));
				
		System.out.println("Displaying Set::::");
		
		for(String name:namesSet) {
			
			System.out.println(name);
		}
		
		System.out.println("Displaying Employees::::");
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Harith", "IT", 2000));
		empList.add(new Employee(102, "Sara", "Sales", 1500));
		empList.add(new Employee(103, "Talal", "Accounts", 500));
		empList.add(new Employee(104, "Eman", "IT", 1200));
		Collections.sort(empList, new SalaryComparator());
		
		for(Employee emp:empList) {
			System.out.println(emp);
		}
//		Iterator<String> iter = names.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
	}

}
