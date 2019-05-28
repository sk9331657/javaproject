package helperfunctionpackage;

public class HelperFunction {

	public static double CalculateTax(String Type,String price) {
		Integer Price = Integer.parseInt(price);
		Integer type = Integer.parseInt(Type);
		double tax=0;
		if(type==1)
			tax= 0.125 * Price;
		else if(type==2)
			tax= 0.125 * Price+0.02*(Price+0.125*Price) ;
		else if(type==3) {
			tax= 0.125 * Price+0.02*(Price+0.125*Price) ;
			if((tax+Price)<=100)
				tax = tax+5;
			else if ((Price+tax)>100&&(Price+tax)<=200)
				tax=tax+10;
			else if((Price+tax)>200)
				tax=tax+((Price+tax)*0.1);
		}
		return tax;
	}
}
