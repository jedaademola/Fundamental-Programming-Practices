package com.fpp.lesson12;

class MinimumBalException extends  RuntimeException {
	public MinimumBalException() {
		super();
	}

	public MinimumBalException(String msg) {
		super(msg);
	}
}

class AmountExceedException extends  RuntimeException {
	public AmountExceedException() {
		super();
	}

	public AmountExceedException(String msg) {
		super(msg);
	}
}


public class CustomerAccount {

	private String cusName;
	private String acNo;
	private double balance;
	

	public CustomerAccount(String cusName, String acNo, double balance) {
		this.cusName = cusName;
		this.acNo = acNo;
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "CustomerAccount [Customer Name=" + cusName + ", Account Name=" + acNo + ", Balance=" + balance + "]";
	}

	
	public void deposit(double amount) {
		
		System.out.println("Deposit Amount:" + amount);
		checkdAmount(amount);
		
		balance += amount;
		System.out.println("Deposit Successful, new Balance:" + balance);

	}

	public void checkdAmount(double amount)
	{
		if( amount <= 0 )
			 throw new UnsupportedOperationException("Amount must be greater than 0.0");
		


			 
	}

	public void checkBalance(double amount)
	{
		
		
		 if (balance < 100 )
			 throw new MinimumBalException("Balance cannot be less than $100");
			 
	}

	public void withdraw(double amount)
	{
		System.out.println("Withdrawal Amount:" + amount);
		checkdAmount(amount);
		checkBalance(amount);
				
		if (balance < amount) {
			throw new AmountExceedException("Sorry, you cannot withdraw more than your balance:"+ balance);
		} else {
			
			 if((balance - amount) < 100)
				 throw new MinimumBalException("Withdrawal unsuccessful: Balance would be less than $100 after withdrawal");
			 
			  balance -= amount;
		}
		
		System.out.println("Withdrawal Successful, new Balance:" + balance);
			 
	}


	public static void main(String[] args) {
		
		CustomerAccount customer1 = new CustomerAccount("Lukman Arogundade","0011223345",0.0);
		try
		{
			customer1.deposit(100);
			customer1.withdraw(1000);
			System.out.println(customer1);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			System.out.println("End of Program");
		}
		

	}

}
/*
OUTPUT
-----------------
Deposit Amount:0.0
Amount must be greater than 0.0
End of Program



Deposit Amount:500.0
Deposit Successful, new Balance:5500.0
Withdrawal Amount:0.0
Amount must be greater than 0.0
End of Program



Deposit Amount:500.0
Deposit Successful, new Balance:5500.0
Withdrawal Amount:100.0
Withdrawal Successful, new Balance:5400.0
CustomerAccount [Customer Name=Lukman Arogundade, Account Name=0011223345, Balance=5400.0]
End of Program




Deposit Amount:500.0
Deposit Successful, new Balance:5500.0
Withdrawal Amount:7000.0
Sorry, you cannot withdraw more than your balance:5500.0
End of Program


Deposit Amount:500.0
Deposit Successful, new Balance:5500.0
Withdrawal Amount:5500.0
Withdrawal unsuccessful: Balance would be less than $100 after withdrawal
End of Program


 */
