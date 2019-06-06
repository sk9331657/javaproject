package com.nagarro.taxcalculation;
import com.nagarro.collection.DataStorage;
import com.nagarro.helpers.*;
import java.util.*;
import com.nagarro.dto.*;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
/**
* The class helps Calculate Tax on Products 
* And output them
* @version 0.1
* @author Shubham Kumar
*/

public class TaxCalculation {


	public static void main(String[] args){
		    Logger logger = Logger.getLogger(TaxCalculation.class);
		    BasicConfigurator.configure();
			Scanner input = new Scanner(System.in);
			DataStorage ds = new DataStorage();
			logger.info("Welcome to Tax Utility");
			try {
				while(true) {
					Helpers helper = new Helpers();
					String name = helper.getName();
					String type = helper.getType();
					Integer quantity = helper.getQuantity();
					Double price = helper.getPrice();
					Item item = helper.processData(name, type, quantity, price);
					ds.setData(item);
					ds.getData();
					logger.info("Enter any key to continue or n to exit");
					String choice = input.nextLine();
					if(choice.trim().equals("n")) {
						logger.info("Bye!!! ");
						input.close();
						break;
					}		
				}	
			} catch(Exception e) {
				logger.info(e.getStackTrace());	
			}
			
			
	}

}
