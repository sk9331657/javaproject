package taxcalculationpackage;
import collectionpackage.Datacollection;
import exceptionpackage.Notifications;
import validatorspackage.Validators;
import helperfunctionpackage.HelperFunction;
import java.util.*;

public class TaxCalculation {

	public static void main(String[] args){
		
			Scanner input = new Scanner(System.in);
			
			while(true) {
				System.out.println("Enter Product Name");
				String name = input.nextLine();
				while(!Validators.validateName(name)) {
					Notifications.InvalidName();
					name = input.nextLine();
				}
				System.out.println("Enter 1 for Raw , 2 for Manufactured, 3 for Imported");
				String type = input.nextLine();
				while(!Validators.validateType(type)) {
					Notifications.InvalidType();
					type = input.nextLine();
				}
				System.out.println("Enter quantity");
				String quantity = input.nextLine();
				while(!Validators.validateQuantity(quantity)) {
					Notifications.InvalidQuantity();
					quantity = input.nextLine();
				}
				System.out.println("Enter Price");

				String Price = input.nextLine();
				while(!Validators.validatePrice(Price)) {
					Notifications.InvalidPrice();
					Price = input.nextLine();
				}
			    HashMap<String, String> hmap = new HashMap<String, String>();
				hmap.put("Name",name);
				hmap.put("Type",type);
				hmap.put("Price",Price);
				hmap.put("Quantity",quantity);
				hmap.put("Tax", Double.toString(HelperFunction.CalculateTax(type,Price)));
				hmap.put("Total", Double.toString(Integer.parseInt(Price)+Double.parseDouble(hmap.get("Tax"))));
				Datacollection.setData(hmap);
				Datacollection.getData();
				System.out.println("Enter any key to continue or n to exit");
				String choice= input.nextLine();
				if(choice.trim().equals("n")) {
					System.out.println("Bye!!! ");
					input.close();
					break;
				}
				
			}
			
	}

}
