package com.nagarro.collection;
import java.util.*;

import org.apache.log4j.Logger;

import com.nagarro.dto.*;
import com.nagarro.taxcalculation.TaxCalculation;

public class DataStorage {
     Logger logger = Logger.getLogger(TaxCalculation.class);
	 ArrayList<Item> finallist = new ArrayList<>();

	public  void setData(Item item ) {

		Boolean found = false;
		for ( Item i : finallist )
	    {
	        if(i.getName().equals(item.getName())&&(i.getType().equals(item.getType()))&&
	        		(i.getType()==item.getType())) {
	        i.setQuantity(i.getquantity()+item.getquantity());
	        found= true;
	        break;
	        }
	    }
		if(!found)
		{
			finallist.add(item);
		}

	}
	public  void getData() {
		ListIterator<Item>  iterator = finallist.listIterator(); 
		while (iterator.hasNext()) { 
			Item temp = iterator.next();
			logger.info("Items");
            logger.info("Name:       "+temp.getName());  
            logger.info("Price:      "+ temp.getprice() ); 
            logger.info("Quantity:   "+ temp.getquantity() ); 
            logger.info("Tax:        "+ temp.getTax() ); 
            logger.info("Total:      " + (temp.getprice()+temp.getTax()));
        } 
	}

}
