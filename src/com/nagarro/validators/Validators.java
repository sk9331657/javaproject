package com.nagarro.validators;
public class Validators {
	public Validators() {
		
	}

	public  Boolean validateName(String name) {
		return !(("").equals(name.trim()));
	}
	
	public  Boolean validateType(String type) {
	   try {
		   int t= Integer.parseInt(type);
		   return 	(t==1||t==2||t==3);
	   }
	   catch (NumberFormatException e) {
		   return false;
	   }
	}
	
	public  Boolean validateInteger(String price) {
		try {
			Integer.parseInt(price);
			return true;
		}
		catch (NumberFormatException e) {
			   return false;
		}
	}
	
	public  Boolean validateDouble(String price) {
		try {
			Double.parseDouble(price);
			return true;
		}
		catch (NumberFormatException e) {
			   return false;
		}
	}


}
