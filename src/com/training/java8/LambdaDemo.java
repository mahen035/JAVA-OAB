package com.training.java8;

import java.util.function.Predicate;

public class LambdaDemo {

	public static void main(String[] args) {
		//int result = sum(23,45);
		//System.out.println(result);
		
		MyFuncInterface obj = (x, y)-> x+y;
		System.out.println(obj.sum(21, 19));
		
		Predicate<Integer> val =  a -> a%2 == 0;
		
		System.out.println(val.test(34));

	}
	
//	private static int sum(int a, int b) {
//		return a+b;
//	}

}
