package model;

import utility.Helper;

public class Sales {
	
	private String employeeId;
	private String employeeName;
	private float salesAmount;
	private String salesCode;
	private float grossAmount;
	private float salesCommission;
	private float takeHomePay;
	
	public Sales(){
		employeeId = null;
		employeeName = null;
		salesAmount = 0;
		salesCode = null;
		grossAmount = 0;
		salesCommission = 0;
		takeHomePay = 0;
	}
	
	public String getEmpId()
	{
		return employeeId;
	}
	
	public void setEmpId(){
		employeeId = Helper.readString("Enter Employee ID");
	}
	
	public String getEmpName()
	{
		return employeeName;
	}
	
	public void setEmpName(){
		employeeName = Helper.readString("Enter Employee Name");
	}
	
	public float getSalesAmount(){
		return salesAmount;
	}
	
	public void setSalesAmount(){
		salesAmount = Helper.readFloat("Enter Sales Amount");
	}
	
	public String getSalesCode(){
		return salesCode;
	}
	
	public void setSalesCode(){
		salesCode = Helper.readString("Enter Sales Code [A/B]");
	}
	
	//instance methods or functions
	
	public void computeGrossAmount(){
		
		if(salesCode.equals("A")){
			grossAmount = salesAmount * 0.50f;
			grossAmount = grossAmount + 175;
			
			System.out.println("Gross Amount: " + grossAmount);
		}
		else if(salesCode.equals("B")){
			grossAmount = salesAmount * 0.20f;
			grossAmount = grossAmount + 100;
			
			System.out.println("Gross Amount: " + grossAmount);
		}
		else{
			System.out.println("The sales code you have entered is invalid");
		}	
	}
	
	public void computeSalesCommission(){
		
		if(salesAmount > 2500){
			salesCommission = salesAmount * 0.05f;
			System.out.println("Sales Commission: " + salesCommission);
		}
		else{
			System.out.println("Sales Commission: " + salesCommission);
		}
	}
	
	public void computeTakeHomePay(){
		takeHomePay = grossAmount + salesCommission;
		System.out.println("TOTAL TAKEHOME PAY: " + takeHomePay);
	}
}
