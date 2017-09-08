package com.fpp.lesson3;

import com.fpp.lesson3.Address;
import com.fpp.lesson3.Customer;

public class Problem1 {

	public static void main(String[] args) {
		
		
		final String checkCity = "Chicago";
		
		Customer customer1 = new Customer("Lukman","Arogundade","123456");
		customer1.setBillingAddress(new Address("1000 North 4th Street","Fairfield","Iowa","52557"));
		customer1.setShippingAddress(new Address("1000 North 4th Street","Fairfield","Iowa","52557"));
		
		Customer customer2 = new Customer("Farhan","Arogundade","123456");
		customer2.setBillingAddress(new Address("28th Street","Chicago","Chicago","52551"));
		customer2.setShippingAddress(new Address("28th Street","Chicago","Chicago","52551"));
		
		Customer customer3 = new Customer("Farah","Arogundade","123457");
		customer3.setBillingAddress(new Address("2th Street","Chicago","Chicago","52554"));
		customer3.setShippingAddress(new Address("2th Street","Chicago","Chicago","52554"));
		
		//Customer[] customer = new Customer [3];
		//customer[0]=customer1;
		//customer[1]=customer2;
		//customer[2]=customer3;
		
		Customer[] customer ={customer1,customer2,customer3};
		
		for(Customer custData :customer)
		{
			if (checkCity.equals(custData.getBillingAddress().getCity()))
			{
				System.out.println(custData.toString());
		    }
		}
		
	}

}

/*
OUTPUT
--------------------
[Farhan, Arogundade, ssn: 123456]
[Farah, Arogundade, ssn: 123457]
*/