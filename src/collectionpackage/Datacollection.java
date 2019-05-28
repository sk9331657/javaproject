package collectionpackage;
import java.util.*; 


public class Datacollection {

	 static List<HashMap<String,String>> list = new ArrayList<>();
	
	//ArrayList<Object> list= new ArrayList<Object>();
	public static void setData(HashMap<String,String> list1) {
		list.add(list1);
	}
	public static void getData() {
		ListIterator<HashMap<String,String>>  iterator = list.listIterator(); 
		while (iterator.hasNext()) { 
            System.out.println("Value is : "
                               + iterator.next()); 
        } 
	}

}
