package com.nagarro.taxcalculation;
import com.nagarro.collection.DataStorage;
import com.nagarro.helpers.*;
import java.util.*;
import com.nagarro.dto.*;

/**
* The class helps Calculate Tax on Products 
* And output them
* @version 0.1
* @author Shubham Kumar
*/

public class TaxCalculation {

	public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			DataStorage ds = new DataStorage();
			System.out.println("Welcome to Tax Utility");
			try {
				while(true) {
					Helpers helper = new Helpers();
					String name = helper.getName();
					String type = helper.getType();
					Integer quantity = helper.getQuantity();
					Double price = helper.getPrice();
					Item item = helper.processData(name, type, quantity, price);
					ds.setData(item.getName(),item.getType(),item.getprice(),item.getquantity(), item.getTax(),item.getTax()+item.getprice());
					ds.getData();
					System.out.println("Enter any key to continue or n to exit");
					String choice = input.nextLine();
					if(choice.trim().equals("n")) {
						System.out.println("Bye!!! ");
						input.close();
						break;
					}		
				}	
			} catch(Exception e) {
				System.out.println(e.getStackTrace());	
			}
			
			
	}

}
