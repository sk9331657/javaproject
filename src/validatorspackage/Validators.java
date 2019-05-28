package validatorspackage;

public class Validators {

	public static Boolean validateName(String Name) {
		return !(Name.trim().equals(""));
	}
	
	public static Boolean validateType(String Type) {
	   try {
		   int t= Integer.parseInt(Type);
		   return 	(t==1||t==2||t==3);
	   }
	   catch (NumberFormatException e) {
		   return false;
	   }
	}
	
	public static Boolean validatePrice(String Price) {
		   try {
			   int t= Integer.parseInt(Price);
			   return true;
		   }
		   catch (NumberFormatException e) {
			   return false;
		   }
		}
	public static Boolean validateQuantity(String Quantity) {
		   try {
			   int t= Integer.parseInt(Quantity);
			   return true;
		   }
		   catch (NumberFormatException e) {
			   return false;
		   }
		}

}
