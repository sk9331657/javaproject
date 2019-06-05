package com.nagarro.dto;

import com.nagarro.constants.TaxConstants;

public class Manufactured implements Calculate {
	
	
	@Override
	public Double calculateTax(Double price) {
		return TaxConstants.TAX_VALUE *  price + 0.02 * ( price + TaxConstants.TAX_VALUE *  price) ;
	}
		
}