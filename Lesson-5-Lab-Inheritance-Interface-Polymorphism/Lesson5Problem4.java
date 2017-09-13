package com.fpp.lesson5;

public class Lesson5Problem4 {

	public static void main(String[] args) {
		
		Payable[] payables = new Payable[5];
		
		CommissionEmployee emp1 = new CommissionEmployee("Lukman","Arogundade","12345",20000.0,0.25);
		HourlyEmployee emp2 = new HourlyEmployee("Hawwa","Arogundade","12346",200.0,20);
		SalariedEmployee emp3 = new SalariedEmployee("Jeda","Arogundade","12347",3500.0);
		BasePlusCommisionEmployee emp4 = new BasePlusCommisionEmployee("Ademola","Arogundade","12348",20000.0,0.25,200);
		
		CommissionEmployee emp5 = new CommissionEmployee("Farhan","Arogundade","12349",3500.0,0.25);
		
		Invoice invoice =new Invoice("HPD102","HP DESKJET PRINTER",5, 5000.0);
		
		payables[0] = emp1;
		payables[1] = emp2;
		payables[2] = emp3;
		payables[3] = emp4;
		payables[4] = emp5;
		
		printEmployeeSalaries(payables);

	}
	
	public static void printEmployeeSalaries(Payable[] payables)
	{
		double totalSalaries=0.0;
		for(Payable p: payables)
		{
			totalSalaries += p.getPaymentAmount();
			System.out.println(p.toString());
		}
		System.out.println();
		System.out.printf("Total salaries of all the employees: %.2f" , totalSalaries);
		
		
	}

}
/*
 OUTPUT
 ---------------------------
Employee [firstName=Lukman, lastName=Arogundade, socialSecurityNumer=12345]CommissionEmployee [grossSales=20000.0, commisionRate=0.25]
Employee [firstName=Hawwa, lastName=Arogundade, socialSecurityNumer=12346]  HourlyEmployee [wage=200.0, hours=20.0]
Employee [firstName=Jeda, lastName=Arogundade, socialSecurityNumer=12347]  SalariedEmployee [weeklySalary=3500.0]
Employee [firstName=Ademola, lastName=Arogundade, socialSecurityNumer=12348]CommissionEmployee [grossSales=20000.0, commisionRate=0.25]  BasePlusCommisionEmployee [baseSalary=200.0]
Employee [firstName=Farhan, lastName=Arogundade, socialSecurityNumer=12349]CommissionEmployee [grossSales=3500.0, commisionRate=0.25]

Total salaries of all the employees: 18575.00
 */
