package com.nagarro.dto;

import com.nagarro.constants.TaxConstants;

public class Imported implements Calculate {
	
	
	@Override
	public Double calculateTax(Double price) {
		
		Double tax = TaxConstants.TAX_VALUE * price;
		if(tax+price<=100)
			tax= tax + 5;
		else if ( tax +price >100 && price <200)
			tax= tax + 10;
		else
			tax = tax + 0.05 * price;
		return tax;
	}
		


}
