package com.training.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	
	public static void main(String args[]) {
		List<String> nameList = Arrays.asList("Salim", "Ali", "Suleimaan", "David", "Rashid");
		List<Integer> numbers = Arrays.asList(23,12,10,11,51,9,8,7);
//		List<String> namesWithS = new ArrayList<>();
//		for(String name : nameList) {
//			if(name.startsWith("S")) {
//				//System.out.println(name);
//				namesWithS.add(name);
//			}
//		}
		
		//Stream
		//nameList.stream().filter(n->n.startsWith("S")).forEach(x->System.out.println(x));
		//numbers.stream().filter(n->n%2!=0).map(m->m*m).sorted().forEach(x->System.out.println(x));
//		List<Integer> sortedNumbers = numbers.stream()
//									.filter(n->n%2!=0)
//									.map(m->m*m)
//									.sorted()
//									.collect(Collectors.toList());
		
		List<Department> deptList = new ArrayList<>();
		deptList.add(new Department(1, "Sales"));
		deptList.add(new Department(2, "IT"));
		deptList.add(new Department(3, "Accounts"));
		deptList.add(new Department(4, "Marketing"));
		
		deptList.stream().map(Department :: getDeptName).forEach(System.out :: println);
	}

}

// Intermediate operation : n number of operations
// terminal operation : Single terminal operation
// Apply stream on a collection of numbers and then filter out all the odd numbers
// then square those filtered odd numbers then sort them and display
