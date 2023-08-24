package view;

import model.Sales;

public class Display {

	public static void print(Sales sales){
		
		System.out.println("\nEmployee ID: " + sales.getEmpId());
		System.out.println("Employee Name: " + sales.getEmpName());
		System.out.println("Sales Code [A/B]: " + sales.getSalesCode());
		System.out.println("Sales Amount: " + sales.getSalesAmount());
		System.out.println(" ");
		
		sales.computeGrossAmount();
		sales.computeSalesCommission();
		sales.computeTakeHomePay();
		System.out.println(" ");
		
	}
			
}
