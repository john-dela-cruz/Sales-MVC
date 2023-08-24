package controller;

import view.Display;
import model.Sales;
import utility.Helper;


public class AccessSales {

	public static void main(String[] args) {
		
		String choice;
		Sales employee = new Sales();
		
		do{
			employee.setEmpId();
			employee.setEmpName();
			employee.setSalesCode();
			employee.setSalesAmount();
		
			Display.print(employee);
			
			choice = Helper.readMessage("Do you want to continue[Y/N]?");
			
			while(!choice.equals("N") && !choice.equals("n") && !choice.equals("Y") && !choice.equals("y")){
				System.out.println("Input Invalid!");
				choice = Helper.readMessage("Do you want to continue[Y/N]?");
			}
		}while(!choice.equals("N") && !choice.equals("n"));
		
	}

}
