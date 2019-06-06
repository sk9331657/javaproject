package com.nagarro.helpers;
import com.nagarro.dto.*;
import com.nagarro.notifications.*;
import com.nagarro.validators.*;
import java.util.*;
import org.apache.log4j.Logger;

public class Helpers {
	private final Logger logger = Logger.getLogger(Helpers.class);
    
	Scanner input = new Scanner(System.in);
	Notifications notify = new Notifications();
	Validators validate = new Validators();

	
	public  String getName() {
		
		logger.info("Enter Product Name");
		String name = input.nextLine(); // Stores Name of Product
		while(!(validate.validateName(name))) {
			notify.invalidName();
			name = input.nextLine();
		}
		return name;
	}
	
	public  String getType() {
		logger.info("Enter 1 for Raw , 2 for Manufactured, 3 for Imported Type of Product");
		String type = input.nextLine(); // Stored Type of Product
		while(!(validate.validateType(type))) {
			notify.invalidType();
			type = input.nextLine();
		}
		if(type.equals("1"))
			type = "RAW";
		else if(type.equals("2"))
			type = "MANUFACTURED";
		else
			type = "IMPORTED";
		return type;
	}
	
	public  Integer getQuantity() {
		logger.info("Enter quantity");
		String quantity = input.nextLine();
		while(!(validate.validateInteger(quantity))) {
			notify.invalidQuantity();
			quantity = input.nextLine();
		}
		return Integer.parseInt(quantity);
	}
	public  Double getPrice() {
		logger.info("Enter Price");
		String price = input.nextLine();
		while(!(validate.validateDouble(price))) {
			notify.invalidPrice();
			price = input.nextLine();
		}
		return Double.parseDouble(price);
	}
	public Item processData(String name, String type , Integer quantity , Double price) {
		Item item = new Item(name,ItemType.valueOf(type),quantity,price);
		switch(item.getType()){
		case IMPORTED:
			Imported imported = new Imported();
			item.setTax(imported.calculateTax(item.getprice()));
			break;
		case MANUFACTURED:
			Manufactured manufactured = new Manufactured();
			item.setTax(manufactured.calculateTax(item.getprice()));
			break;
		case RAW:
			Raw raw = new Raw();
			item.setTax(raw.calculateTax(item.getprice()));
			break;
		default:
			break;
		}
		return item;
	}
}
