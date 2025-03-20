package com.training.exception;

import java.util.InputMismatchException;

public class ExceptionDemo {

	public static void main(String[] args) throws InputMismatchException {
		int i = 5;
		int j = 0;
		int age = 16;
		int result = 0;
		try {
			if(age < 18) {
				throw new MinimumAgeException("Age should not be less than 18");
			}
			result = i/j;
		}
		
		catch(ArithmeticException |  MinimumAgeException | NumberFormatException e) {
			if(e instanceof ArithmeticException) {
				System.out.println("An Arithmetic Exception occurred!!");
			}
			else if (e instanceof MinimumAgeException) {
				System.out.println(e.getMessage());
			}
			else if(e instanceof NumberFormatException) {
				System.out.println("Number format Exception occurred!!");
			}
			
		}
//		catch(MinimumAgeException e) {
//			System.out.println(e.getMessage());
//		}
//		catch(NumberFormatException e) {
//			System.out.println("Number format Exception occurred!!");
//		}
		finally {
			System.out.println("Inside finally block");
		}
		
		System.out.println("Execution resumes::"+result);

	}

}
