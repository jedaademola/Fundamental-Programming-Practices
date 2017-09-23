package com.fpp.lesson11.solution;

import java.util.List;

public class AccountManager {
	public static double computeAccountBalanceSum(List<Employee> emps) {
		//implement
		double sum=0.0;
		for (Employee e: emps)
		{
			//List<Account> accounts = e.accounts;
			for(Account acc : e.accounts)
			{
			    sum+= acc.getBalance() ;
			}
		}
		return sum;
	}
}
