package com.fpp.lesson11.solution;

public final class CheckingAccount extends Account{
	public CheckingAccount(double balance) {
		this.balance = balance;
	}
	double balance;
	@Override
	public double getBalance() {
		return balance;
	}
}
