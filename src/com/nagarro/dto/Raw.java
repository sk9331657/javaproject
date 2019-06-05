package com.nagarro.dto;

import com.nagarro.constants.TaxConstants;

public class Raw implements Calculate  {

	@Override
	public Double calculateTax(Double price) {
		Double tax;
		tax = TaxConstants.TAX_VALUE * price;
		return tax;
	}
	

}

