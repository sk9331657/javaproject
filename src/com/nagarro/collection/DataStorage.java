package com.nagarro.collection;
import java.util.*; 
import com.nagarro.dto.*;

public class DataStorage {

	 ArrayList<HashMap<String,String>> finallist = new ArrayList<>();

	public  void setData(String name,ItemType type,Double price,Integer quantity,Double tax, Double total ) {

		Boolean found = false;
		for (int i=0;i<finallist.size();i++)
	    {
			
	        if(finallist.get(i).get("Name").equals(name)&&(ItemType.valueOf(finallist.get(i).get("Type")).equals(type))&&
	        		(Double.parseDouble(finallist.get(i).get("Price"))==price)) {
	        	HashMap<String,String> tmap = new HashMap<>();
	        	tmap = finallist.get(i);
	        	tmap.put("Quantity", String.valueOf(Integer.parseInt(finallist.get(i).get("Quantity"))+quantity));
	        finallist.set(i,tmap);
	        found= true;
	        break;
	        }
	    }
		if(!found)
		{
			HashMap<String,String> Hmap = new HashMap<String , String>();
			Hmap.put("Name",name);
			Hmap.put("Type",type.toString());
			Hmap.put("Price",price.toString());
			Hmap.put("Quantity",quantity.toString());
			Hmap.put("Tax",tax.toString());
			Hmap.put("Total",total.toString());
			finallist.add(Hmap);
			
		}

	}
	public  void getData() {
		ListIterator<HashMap<String,String>>  iterator = finallist.listIterator(); 
		while (iterator.hasNext()) { 
            System.out.println("Object is : "+ iterator.next()); 
        } 
	}

}
