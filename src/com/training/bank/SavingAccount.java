package com.training.bank;

public class SavingAccount  extends Account implements PrimaryAccount{
	
	//Attributes
	private double roi;
	private double minBalance;	
	
	//Constructor
	public SavingAccount(int accountNumber, String accountHolderName, double roi, double amount, double minBalance) {
		super(accountNumber, accountHolderName, roi);
		this.roi = roi;
		this.minBalance = minBalance;
			
	}

	public double getRoi() {
		return roi;
	}

	public double getMinBalance() {
		return minBalance;
	}



	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}



	public void setRoi(double roi) {
		this.roi = roi;
	}


	//Behaviour
	public double calculate(double amount, double roi) {
		return amount + (amount * roi/100);
	}
	
	@Override
	public String display() {
		return super.display()+", Minimum Balance: "+this.minBalance;
	}
	
	//Method Overload
	public String display(int roi) {
		return "Overloaded method";
	}

	@Override
	public double calculateTotalAmount() {
		
		return 0;
	}

	@Override
	public int calculateVal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String displayDetails() {
		// TODO Auto-generated method stub
		return null;
	}



	

}
