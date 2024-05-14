package com.service;

public class BankAccount implements Atm
{
	
    double accountBalance;

	
	public BankAccount(double accountBalance) {
		super();
		this.accountBalance = accountBalance;
	}

	public BankAccount() {
		super();
		
	}
	
	@Override
	public void WithdrawAmount( double amount) {
	if(this.accountBalance < amount) {
		System.out.println("Insufficient Account Balance");
	}
	
	else {
		this.accountBalance=this.accountBalance-amount;
		System.out.println(amount+"Rs withdrwal Succesfully.\nRemaining balance is "+this.accountBalance);
	}
	}
	

	@Override
	public void DepositAmout(double amount) {
		this.accountBalance=this.accountBalance+amount;
		System.out.println(amount+"Rs deposited Succesfully.\nRemaining balance is "+this.accountBalance);
		
	}

	@Override
	public double CheckBalance() {
		return this.accountBalance;

}
}
