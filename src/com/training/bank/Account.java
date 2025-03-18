package com.training.bank;

public abstract class Account {
	
	private int accountNumber;
	private String accountHolderName;
    private double amount;
    
       
    public Account(int accountNumber, String accountHolderName, double amount) {
		
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.amount = amount;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String display() {
		return "Account number: "+this.accountNumber+ " Amount: "+this.amount;
	}
	
	public abstract double calculateTotalAmount();

}
