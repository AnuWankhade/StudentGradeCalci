package com.service;

public interface Atm {

	public void WithdrawAmount(double Amount);
	public void DepositAmout(double Amount);
	public double CheckBalance();
}
