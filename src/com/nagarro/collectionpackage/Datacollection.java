package com.nagarro.collectionpackage;
import java.util.*; 

interface in1 {
	public  void setData(HashMap<String,String> list1);
	public  void getData();
	
}

public class Datacollection implements in1 {

	 static List<HashMap<String,String>> list = new ArrayList<>();
	
	//ArrayList<Object> list= new ArrayList<Object>();
	public  void setData(HashMap<String,String> list1) {
		list.add(list1);
	}
	public  void getData() {
		ListIterator<HashMap<String,String>>  iterator = list.listIterator(); 
		while (iterator.hasNext()) { 
            System.out.println("Value is : "
                               + iterator.next()); 
        } 
	}

}
