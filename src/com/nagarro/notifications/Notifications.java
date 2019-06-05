package com.nagarro.notifications;

public class Notifications {
	public Notifications () { }
	
	public  void invalidName() {
        System.out.println("Invalid Name Entered. Re-enter Product Name");
    }

	public  void invalidType() {
        System.out.println("Invalid Type Entered. Enter ");
        System.out.println("1. for Raw");
        System.out.println("2. for Manufactured");
        System.out.println("3. for Imported");
    }
	
	public  void invalidQuantity() {
        System.out.println("Invalid Quantity");
    }
	
	public  void invalidPrice() {
        System.out.println("Invalid Price ");
    }

}
