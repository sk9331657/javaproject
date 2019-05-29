package com.nagarro.exceptionpackage;

public class Notifications {
	
	public static void InvalidName() {
        System.out.println("Invalid Name Entered. Re-enter Product Name");
    }

	public static void InvalidType() {
        System.out.println("Invalid Type Entered. Enter ");
        System.out.println("1. for Raw");
        System.out.println("2. for Manufactured");
        System.out.println("3. for Imported");
    }
	
	public static void InvalidQuantity() {
        System.out.println("Invalid Quantity");

    }
	
	public static void InvalidPrice() {
        System.out.println("Invalid Price ");
    }

}
