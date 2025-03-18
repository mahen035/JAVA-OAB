package com.training.bank;
import java.util.Scanner;
class BankAccount { // protected // private // default
	
	String accountHolderName;
	
	void display() {
		int age = 21; // Local variable
		
	}

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Account Number");
//		int acctNumber = sc.nextInt();
//		sc.nextLine();
//		System.out.println("Enter Name");
//		String name = sc.nextLine();
//		System.out.println("Enter Rate of interest");
//		double roi = sc.nextDouble();
//		System.out.println("Enter amount");
//		double amount = sc.nextDouble();
//		SavingAccount account1 = new SavingAccount(acctNumber, name, roi, amount);
//		
//		System.out.println(account1);
//				
//		System.out.println("Total amount after one year is: "+account1.calculate(account1.getAmount(), 
//				account1.getRoi()));
//		
//		String[] names = new String[4];
//		names[0] = "Kevin";
//		names[1] = "Pete";
//		names[2] = "Adam";
//		names[3] = "John";
//		
//		for(int i=0; i<names.length; i++) {
//			System.out.println(names[i]);
//		}
		
        Account account1 = new SavingAccount(1234, "John", 1000, 5, 200);
                
        System.out.println(account1.display());
					
//		System.out.println("Welcome to my Bank");
//		System.out.println("First Argument: "+args[0]);
//		
//		BankAccount account1 = new BankAccount();
//		account1.accountHolderName = "David";
//		
//		short s = 10;
//		int i = 5;
//		s = (short)i;
//		i = s;
//		System.out.println(i);
	}

}
/*
 * CREATE A CLASS NAMED SAVINGACCOUNT WITH ATTRIBUTES ACCOUNTNUMBER,NAME, ROI AND AMOUNT
 * CREATE A METHOD CALCULATE INSIDE THIS CLASS AND RETURN THE TOTAL AMOUNT AFTER ONE YEAR.
 * 
 * 
 * Constructors
 */

/*
 * OOPs Concepts
 * 
 * ENCAPSULATION: Data Binding : example - class
 * Inheritance: 
 * Polymorphism: compile time, run time
 * Abstraction : Abstract class, Interface
 */

